package com.kuheng.test;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/mobile1/tset")
public class Test {
	 @RequestMapping("/test1")
	 @ResponseBody
	public String test1(HttpServletRequest request){
		 String path_real=request.getSession().getServletContext().getRealPath("/");
		 String path_real1="/"+request.getContextPath();
		 String path_real2=this.getClass().getClassLoader().getResource("").getPath();
		 String path_real3=request.getScheme()+"://"+ request.getServerName()+"/"+request.getContextPath(); 
		 
		 System.out.println("path_real------"+path_real);
		 System.out.println("path_real1------"+path_real1);
		 System.out.println("path_real2------"+path_real2);
		 System.out.println("path_real3------"+path_real3);
		 JSONObject obj =new JSONObject();
		 obj.put("state", "ok");
		return "heelo";
	}
	 @RequestMapping("/test2")
	 @ResponseBody
	public String test2(){
		 JSONObject obj =new JSONObject();
		 obj.put("state", "err");
		 System.out.println("--------");
		return obj.toJSONString();
	} 
	@RequestMapping("/test3")
	@ResponseBody
	 public String test3(HttpServletRequest request) throws IOException{
		System.out.println("request:"+request);
		 JSONObject obj =new JSONObject();
		 boolean flag=PreventRefresh(request, 2000);
		 if(flag){
			 obj.put("state", "err");
		 }else{
			 obj.put("state", "ok");
		 }
		 return obj.toJSONString();
	 }
	
	
	 public boolean PreventRefresh(HttpServletRequest request, long lMaxTimeMS)
			    throws IOException
			  {
			    java.util.Date date = new java.util.Date();
			    long time = date.getTime();
			    String temp = null;
			    HttpSession session = request.getSession();
			    System.out.println("session:"+session);
			    if (session.getAttribute("bj") != null) {
			      temp = String.valueOf(session.getAttribute("bj"));
			    }
			    if ((temp != null) && (temp.length() > 0))
			    {
			      long bj = Long.parseLong(temp);
			      long msg = time - bj;
			      if (msg < lMaxTimeMS) {
			        return true;
			      }
			    }
			    session.setAttribute("bj", Long.valueOf(time));
			    return false;
			  }
	 
}
