package com.kuheng.aontroller.order;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kuheng.controller.base.BaseController;
import com.kuheng.service.system.KuOrdersService;
import com.kuheng.utils.PageView;





@Controller
@RequestMapping("/mobile/order")
public class OrderAction extends BaseController{

	@Autowired
	private KuOrdersService kuOrderService;
	
	
	/**
	 * 订单
	 * 
	 * **/
	@RequestMapping("/orderlist")
	public String orderList(HttpServletRequest request, HttpServletResponse response){
	
		////////////////////////////////////////////////
		 int pageno = 1;//Integer.parseInt(request.getParameter("pageno"));  
//		KuMember user=userService.getBean(this.getUserid());
		//验证访问人的身份
		System.out.println("进入.................");
//		if(this.getToken()!=null&&this.getToken().length()>4&&user!=null&&this.getToken().equals(user.getToken())){
		////
		if(pageno<=0){pageno=1;}
		PageView<Object> pageView = new PageView<Object>(20, pageno);
		Map mapgd = new HashMap();
//		mapgd.put("gc_id_1", 1);
//		mapgd.put("sortbyname", "xiaoliang");
//		mapgd.put("goods_state", 1);

		mapgd.put("firstResult", pageView.getFirstResult());
		mapgd.put("maxResult", pageView.getMaxresult());

		
		List goodslist = kuOrderService.selectPaging(mapgd);
		System.out.println("goodslist==========="+goodslist.size());
		ObjectMapper  objectMapper = new ObjectMapper(); 

		String str ="";
		try {
			str = objectMapper.writeValueAsString(goodslist);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
//			HttpServletResponse response1=this.getHttpResponse();
			response.setCharacterEncoding("utf-8"); //这里不设置编码会有乱码    
			response.setContentType("text/html;charset=utf-8");   
			response.setHeader("Cache-Control", "no-cache");  
			response.getWriter().print(str);

			//this.getResponse().getWriter().print(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
	
//		}else{
//			
//			PrintWriter pw=null;
//			JSONObject json=new JSONObject();
//			try {
//				pw = getResponse().getWriter();
//				json.put("flag","1");
//				json.put("message", "账户异地登录");
//				json.put("status", "0");
//				pw.print(json);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//				json.put("flag","-1");
//				json.put("message", "操作异常！");
//				json.put("status", "1");
//				pw.print(json);
//			}finally{
//				if(pw!=null){pw.close();}
//			}	
//			
//		}


		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
