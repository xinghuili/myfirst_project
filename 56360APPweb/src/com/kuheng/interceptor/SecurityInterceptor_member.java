package com.kuheng.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.method.HandlerMethod;  
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;  
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.kuheng.auth.Auth;
import com.kuheng.entity.common.GlobalConstant;
import com.kuheng.entity.common.SessionInfo;
import com.kuheng.entity.common.SessionMember;

/**
 * 权限拦截器
 * 
 */
public class SecurityInterceptor_member implements HandlerInterceptor {

	private List<String> excludeUrls;// 不需要拦截的资源

	public List<String> getExcludeUrls() {
		return excludeUrls;
	}

	public void setExcludeUrls(List<String> excludeUrls) {
		this.excludeUrls = excludeUrls;
	}

	/**
	 * 完成页面的render后调用
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object,
			Exception exception) throws Exception {

	}

	/**
	 * 在调用controller具体方法后拦截
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object,
			ModelAndView modelAndView) throws Exception {

	}

	/**
	 * 在调用controller具体方法前拦截
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
		String requestUri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String url = requestUri.substring(contextPath.length());
		//SessionInfo sessionInfo = (SessionInfo) request.getSession().getAttribute(GlobalConstant.SESSION_INFO);
		SessionMember sessionInfo=(SessionMember)request.getSession().getAttribute("sessionMember");
		//判断是否包含在菜单权限里
		  if (object instanceof HandlerMethod) {
		 Auth auth = ((HandlerMethod) object).getMethod().getAnnotation(Auth.class);
		 if(auth!=null){
		// System.out.println("auth:"+auth.value());
		 }
		// System.out.println("url:"+url);
	//	System.out.println("excludeUrls:"+excludeUrls.size());

	//	if ((url.indexOf("/admin/") > -1) || excludeUrls.contains(url)) {// 如果要访问的资源是不需要验证的
		//	System.out.println("11111");
			
		//	return true;
		//}
		if ((sessionInfo == null) ) {// 如果没有登录或登录超时
			request.setAttribute("msg", "您还没有登录或登录已超时，请重新登录，然后再刷新本功能！");
			request.getRequestDispatcher("/memberlogin/login.do").forward(request, response);
			return false;
		}
		
		//if(!sessionInfo.getResourceAllList().contains(url)){
		//	return true;
		//}

		//if (!sessionInfo.getResourceList().contains(url)) {// 如果当前用户没有访问此资源的权限
		//	request.setAttribute("msg", "您没有访问此资源的权限！<br/>请联系超管赋予您<br/>[" + url + "]<br/>的资源访问权限！");
			//request.getRequestDispatcher("/error/noSecurity.jsp").forward(request, response);
		////	return false;
		//}
		  }
		return true;
	}
}
