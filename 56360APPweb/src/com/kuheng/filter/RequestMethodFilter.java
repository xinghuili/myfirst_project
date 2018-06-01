package com.kuheng.filter;

import java.io.IOException;



import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kuheng.controller.base.BaseController;

public class RequestMethodFilter extends BaseController implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {	
		HttpServletRequest  request= (HttpServletRequest) req;
		HttpServletResponse response= (HttpServletResponse) resp;
		String method =request.getMethod();
		if(method.toUpperCase().equals("POST")){
			chain.doFilter(req, resp);
		}else{
			return;
		}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
		
	}

}
