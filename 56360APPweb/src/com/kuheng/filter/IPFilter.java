package com.kuheng.filter;


    import java.io.IOException;  
    import java.util.Iterator;  
    import java.util.Map;  
    import java.util.Set;  
      
    import javax.servlet.Filter;  
    import javax.servlet.FilterChain;  
    import javax.servlet.FilterConfig;  
    import javax.servlet.ServletContext;  
    import javax.servlet.ServletException;  
    import javax.servlet.ServletRequest;  
    import javax.servlet.ServletResponse;  
    import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

import com.kuheng.utils.StrUtil;
      
 
      
    /** 
     *  
     * @Description 自定义过滤器，用来判断IP访问次数是否超限。<br> 
     *              如果前台用户访问网站的频率过快（比如：达到或超过50次/s），则判定该IP为恶意刷新操作，限制该ip访问<br> 
     *              默认限制访问时间为1小时，一小时后自定解除限制 
     *  
     * @author zhangyd 
     * @date 2016年7月28日 下午5:54:51 
     * @since JDK ： 1.7 
     */  
    public class IPFilter implements Filter {  
      
        /** 
         * 默认限制时间（单位：ms）  即ip被限制后，1分钟内不能访问
         */  
        private static final long LIMITED_TIME_MILLIS = 1 * 60 * 1000;  
      
        /** 
         * 用户连续访问最高阀值，超过该值则认定为恶意操作的IP，进行限制 
         * 即连续刷次数等于大于10次，视为恶意IP
         */  
        private static final int LIMIT_NUMBER = 6;  
      
        /** 
         * 用户访问最小安全时间，在该时间内如果访问次数大于阀值，则记录为恶意IP，否则视为正常访问 
         * 即连续刷新间隔时间小于等于5秒，视为恶意IP
         */  
        private static final int MIN_SAFE_TIME = 1000;  
      
        private FilterConfig config;  
      
        public void init(FilterConfig filterConfig) throws ServletException {  
            this.config = filterConfig;  
        }  
      
        /** 
         * @Description 核心处理代码 
         * @param servletRequest 
         * @param servletResponse 
         * @param chain 
         * @throws IOException 
         * @throws ServletException 
         * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, 
         *      javax.servlet.ServletResponse, javax.servlet.FilterChain) 
         */  
        @SuppressWarnings("unchecked")  
          
        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)  
                throws IOException, ServletException {  
            HttpServletRequest request = (HttpServletRequest) servletRequest;  
            HttpServletResponse response = (HttpServletResponse) servletResponse;  
            ServletContext context = config.getServletContext();  
 System.out.println("进入filter");
            // 获取限制IP存储器：存储被限制的IP信息  
            Map<String, Long> limitedIpMap = (Map<String, Long>) context.getAttribute("limitedIpMap");  
            // 过滤受限的IP  
            filterLimitedIpMap(limitedIpMap);  
            // 获取用户IP  
            String ip = StrUtil.getIpAddr(request);//.getIp(request);  
            // 判断是否是被限制的IP，如果是则跳到异常页面  
            if (isLimitedIP(limitedIpMap, ip)) {  
                long limitedTime = limitedIpMap.get(ip) - System.currentTimeMillis();  
                // 剩余限制时间(用为从毫秒到秒转化的一定会存在些许误差，但基本可以忽略不计)  
                request.setAttribute("remainingTime", ((limitedTime / 1000) + (limitedTime % 1000 > 0 ? 1 : 0)));  
                request.getRequestDispatcher("/error/403.jsp").forward(request, response);  
                return;  
            }  
            // 获取IP存储器  
            Map<String, Long[]> ipMap = (Map<String, Long[]>) context.getAttribute("ipMap");  
      
            // 判断存储器中是否存在当前IP，如果没有则为初次访问，初始化该ip  
            // 如果存在当前ip，则验证当前ip的访问次数  
            // 如果大于限制阀值，判断达到阀值的时间，如果不大于[用户访问最小安全时间]则视为恶意访问，跳转到异常页面  
            if (ipMap.containsKey(ip)) {  
                Long[] ipInfo = ipMap.get(ip);  
                ipInfo[0] = ipInfo[0] + 1;  
                System.out.println("当前ip======"+ip);
                System.out.println("当前第[" + (ipInfo[0]) + "]次访问");  
                
                if (ipInfo[0] > LIMIT_NUMBER) { 
//                	System.out.println("ccc................"+ipInfo[0]);
//                	System.out.println("ipAccessTime................"+ipInfo[1]);
                    Long ipAccessTime = ipInfo[1];  
                    Long currentTimeMillis = System.currentTimeMillis();  
                    
                    System.out.println("间隔时间长................"+(currentTimeMillis - ipAccessTime));
                    
//                    System.out.println("ipAccessTime................"+ipInfo[1]);
                    
                    
                    if (currentTimeMillis - ipAccessTime <= MIN_SAFE_TIME) {  
                        limitedIpMap.put(ip, currentTimeMillis + LIMITED_TIME_MILLIS);  
                        request.setAttribute("remainingTime", LIMITED_TIME_MILLIS);  
                        request.getRequestDispatcher("/error/overLimitIP").forward(request, response);  
                        return;  
                    } else {  
                        initIpVisitsNumber(ipMap, ip);  
                    }  
                }else{
//                	System.out.println("sssssssssss");
                }  
            } else {  
                initIpVisitsNumber(ipMap, ip);  
//                System.out.println("您首次访问该网站");  
            }  
            context.setAttribute("ipMap", ipMap);  
            chain.doFilter(request, response);  
        }  
      
       
        public void destroy() {  
      
        }  
      
        /** 
         * @Description 是否是被限制的IP 
         * @author zhangyd 
         * @date 2016年8月8日 下午5:39:17 
         * @param limitedIpMap 
         * @param ip 
         * @return true : 被限制 | false : 正常 
         */  
        private boolean isLimitedIP(Map<String, Long> limitedIpMap, String ip) {  
            if (limitedIpMap == null || ip == null) {  
                // 没有被限制  
                return false;  
            }  
            Set<String> keys = limitedIpMap.keySet();  
            Iterator<String> keyIt = keys.iterator();  
            while (keyIt.hasNext()) {  
                String key = keyIt.next();  
                if (key.equals(ip)) {  
//                	System.out.println("被限制ip=========="+ip);
                    // 被限制的IP  
                    return true;  
                }  
            }  
            return false;  
        }  
      
        /** 
         * @Description 过滤受限的IP，剔除已经到期的限制IP 
         * @author zhangyd 
         * @date 2016年8月8日 下午5:34:33 
         * @param limitedIpMap 
         */  
        private void filterLimitedIpMap(Map<String, Long> limitedIpMap) {  
            if (limitedIpMap == null) {  
                return;  
            }  
            Set<String> keys = limitedIpMap.keySet();  
            Iterator<String> keyIt = keys.iterator();  
            long currentTimeMillis = System.currentTimeMillis();  
            while (keyIt.hasNext()) {  
                long expireTimeMillis = limitedIpMap.get(keyIt.next());  
                if (expireTimeMillis <= currentTimeMillis) {  
                    keyIt.remove();  
                }  
            }  
      
        }  
      
        /** 
         * 初始化用户访问次数和访问时间 
         *  
         * @author zhangyd 
         * @date 2016年7月29日 上午10:01:39 
         * @param ipMap 
         * @param ip 
         */  
        private void initIpVisitsNumber(Map<String, Long[]> ipMap, String ip) {  
            Long[] ipInfo = new Long[2];  
            ipInfo[0] = 0L;// 访问次数  
            ipInfo[1] = System.currentTimeMillis();// 初次访问时间  
            ipMap.put(ip, ipInfo);  
        }  
    }  