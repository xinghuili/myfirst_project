package com.kuheng.controller.type;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kuheng.controller.base.BaseController;

@Controller
@RequestMapping("/base/type")
public class ManageType extends BaseController{

	
	 /**
	    * 品牌管理
	    */
	@RequestMapping("/manage_brand")
	public String manage_brand(HttpServletRequest request){
		
		
		
		return "/base/type/list_brand";
	}
	
	
	
	
	 /**
	    * 品牌添加
	    */
	@RequestMapping("/add_brand")
	public String add_brand(HttpServletRequest request){
		
		
		
		return "/base/type/add_brand";
	}
	
	
	
	
	
	
	 /**
	    * 品牌添加
	    */
	@RequestMapping("/delete_brand")
	public String delete_brand(HttpServletRequest request){
		
		
		
		return "/base/type/add_brand";
	}
	
	
	
}
