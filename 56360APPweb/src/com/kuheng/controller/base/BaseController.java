package com.kuheng.controller.base;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.kuheng.entity.common.Page;
import com.kuheng.utils.Const;
import com.kuheng.utils.Logger;
import com.kuheng.utils.PageData;
import com.kuheng.utils.Tools;
import com.kuheng.utils.UuidUtil;


public class BaseController {
	
	protected Logger logger = Logger.getLogger(this.getClass());

	private static final long serialVersionUID = 6357869213649815390L;
	
	

	
	/**
	 * 得到PageData
	 */
	public PageData getPageData(){
		return new PageData(this.getRequest());
	}
	
	/**
	 * 得到ModelAndView
	 */
	public ModelAndView getModelAndView(){
		return new ModelAndView();
	}
	
	/**
	 * 得到request对象
	 */
	public HttpServletRequest getRequest() {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		
		return request;
	}

	/**
	 * 得到32位的uuid
	 * @return
	 */
	public String get32UUID(){
		
		return UuidUtil.get32UUID();
	}
	
	/**
	 * 得到分页列表的信息 
	 */
	public Page getPage(){
		
		return new Page();
	}
	
	public static void logBefore(Logger logger, String interfaceName){
		logger.info("");
		logger.info("start");
		logger.info(interfaceName);
	}
	
	public static void logAfter(Logger logger){
		logger.info("end");
		logger.info("");
	}
	
	
	/**
	 * 异步 返回数据
	 * 
	 * @param flag
	 * 
	 * @param message
	 * @return
	 */
	public String putPrintWiter(HttpServletResponse response,String result) {
		
	 response.setContentType("application/json");
	  try {
		PrintWriter out = response.getWriter();
		out.write(result);
	  } catch (IOException e) {
		e.printStackTrace();
	 }
	
	 return null;
	}	
	
	
	/*
	 * 获取当前的url
	 */
	public String getUrl(HttpServletRequest request ,String url) {
		String queryString = request.getQueryString();
		String newqs = "";
		if (queryString != null) {
			String[] qss = queryString.split("&");
			int slen = qss.length;
			for (int i = 0; i < slen; i++) {
				if (qss[i].indexOf("pageno=") != 0) {
					newqs = newqs + "&" + qss[i];
				}
			}
			if (newqs.length() > 0) {
				queryString = newqs.substring(1, newqs.length());
				queryString = "?" + queryString;
			} else {
				queryString = "";
			}
		} else {
			queryString = "";
		}
		String strBackUrl = "";
		if (url != null && !"".equals(url)) {
			strBackUrl = url + queryString;
		} else {
			strBackUrl = "http://" + request.getServerName() + ":" + request.getServerPort() +request.getContextPath() + request.getServletPath() + queryString;
		}

		// String strBackUrl = this.getHttpRequest().getHeader("Referer") +
		// queryString;
		return strBackUrl;
	}
	
	
	
	
}
