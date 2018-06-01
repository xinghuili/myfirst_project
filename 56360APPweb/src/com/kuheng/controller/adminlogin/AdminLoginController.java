package com.kuheng.controller.adminlogin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kuheng.controller.base.BaseController;
import com.kuheng.entity.common.SessionInfo;
import com.kuheng.entity.member.KuAdmin;
import com.kuheng.utils.CaptchaUtil;
import com.kuheng.utils.ObjectExcelView;
import com.kuheng.utils.PageData;
import com.sun.jndi.url.corbaname.corbanameURLContextFactory;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.repository.DeploymentBuilder;
import org.apache.shiro.SecurityUtils; 
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.web.servlet.ModelAndView;

import org.apache.shiro.authc.AuthenticationException;


/**
 * 
 * @author yuhengli
 *
 */

@Controller
@RequestMapping("/adminlogin")
public class AdminLoginController extends BaseController  {


	
	
	
	/**
	 * 获取登录用户的IP
	 * @throws Exception 
	 */
	public void getRemortIP(String USERNAME) throws Exception {  
		PageData pd = new PageData();
		HttpServletRequest request = this.getRequest();
		String ip = "";
		if (request.getHeader("x-forwarded-for") == null) {  
			ip = request.getRemoteAddr();  
	    }else{
	    	ip = request.getHeader("x-forwarded-for");  
	    }
		pd.put("USERNAME", USERNAME);
		pd.put("IP", ip);
		//leSysUserService.saveIP(pd);
	}  
	
	
	
	
	
	
	/**
	 * 用户登陆
	 * @param request
	 * @return
	 */
	@RequestMapping("/admin_login")
	public String member_login(String username,String password,HttpServletRequest request,HttpSession httpSession){
		if(username!=null&&password!=null){
			KuAdmin user =null;
			if(user==null){
				SessionInfo sessionInfo=new SessionInfo();
				sessionInfo.setLoginname(username);
				sessionInfo.setId(1);			

				request.getSession().setAttribute("sessionInfo", sessionInfo);
				return "redirect:/base/system/manager_index.do";
				
			}else{
				request.setAttribute("message","用户名或密码错误"); 
				return "/adminlogin/login"; 	
			}
		
			 
		}else{
 
       return "/adminlogin/login";  
   } 
		
		
	}
	
	
	
	/**
	 * 用户退出loginOut
	 * @param request
	 * @return
	 */
	@RequestMapping("/admin_loginout")
	public String member_loginout(HttpServletRequest request,HttpSession httpSession){
	
	
		   request.getSession().setAttribute("sessionInfo", "");
	       return "/adminlogin/admin_login";  
	   	
	    		
	    }
	    		

	/**
	 * 验证码
	 * @param request
	 * @return
	 */	
	@RequestMapping(value = "/captcha", method = RequestMethod.GET)
    @ResponseBody
    public void captcha(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        CaptchaUtil.outputCaptcha(request, response);
    }
	
}
