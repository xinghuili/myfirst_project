package com.kuheng.controller.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.kuheng.datasource.DataSourceContextHolder;
import com.kuheng.entity.member.EUser;
import com.kuheng.entity.member.KuCarowner;
import com.kuheng.entity.member.KuKnowcar;
import com.kuheng.service.system.EUserService;
import com.kuheng.service.system.KuCarownerService;
import com.kuheng.service.system.KuKnowcarService;

@Controller
@RequestMapping("/mobile/find")
public class FindAction {
	@Autowired
	private EUserService eUserService;
	@Autowired
	private KuCarownerService kuCarownerService;
	@Autowired
	private KuKnowcarService kuKnowcarService;
	
	//查询车源		
	@RequestMapping(value="/carSource",produces="html/text;charset=utf-8")
	@ResponseBody
	public String savecallrecord(@RequestParam("memType") int memType,
								 @RequestParam("firstResult") int firstResult,
								 @RequestParam("maxResult") int maxResult) {
		Map<String,Object> param =new HashMap<String,Object>();
		param.put("memType", memType);
		param.put("firstResult", firstResult);
		param.put("maxResult", maxResult);
		List<Map<String, Object>> list = eUserService.selectPaging(param);
		if(list!=null&&list.size()>0){
			JSONArray arr=new JSONArray();
			for (Map<String, Object> user : list) {
				arr.add(user);
			}
			return arr.toJSONString();
		}else{
			return null;
		}
	}
	
	//查询熟车	
		@RequestMapping(value="/knowCar",produces="html/text;charset=utf-8")
		@ResponseBody
		public String knowCar(@RequestParam("userId") long userId,
									 @RequestParam("firstResult") int firstResult,
									 @RequestParam("maxResult") int maxResult) {
			Map<String,Object> param =new HashMap<String,Object>();
			param.put("userId", userId);
			param.put("firstResult", firstResult);
			param.put("maxResult", maxResult);
			List<Map<String,Object>> list = kuKnowcarService.selectPaging(param);
			if(list!=null&&list.size()>0){
				JSONArray arr=new JSONArray();
				for (Map<String,Object> know : list) {
					arr.add(know);
				}
				return arr.toJSONString();
			}else{
				return null;
			}
		}
	
	//加熟车		
		@RequestMapping(value="/addKnowCar",produces="html/text;charset=utf-8")
		@ResponseBody
		public String addKnowCar(@RequestParam("senderId") long senderId,
									 @RequestParam("ownerCarId") long ownerCarId) {
			KuKnowcar knowcar=new KuKnowcar();
			knowcar.setSenderid(senderId);
			knowcar.setCarownerid(ownerCarId);
			knowcar.setAddtime((int)(System.currentTimeMillis()/1000));
			int i = kuKnowcarService.insert(knowcar);
			JSONObject obj=new JSONObject();
			if(i==1){
				obj.put("success", true);
			}else{
				obj.put("success", false);
			}
			return obj.toJSONString();
		}
		
	//取消熟车		
		@RequestMapping(value="/cancelKnowCar",produces="html/text;charset=utf-8")
		@ResponseBody
		public String cancelKnowCar(@RequestParam("itemId") int itemId) {
			int i = kuKnowcarService.deleteByPrimaryKey(itemId);
			JSONObject obj=new JSONObject();
			if(i==1){
				obj.put("success", true);
			}else{
				obj.put("success", false);
			}
			return obj.toJSONString();
		}
		
	//根据车牌号加熟车		
		@RequestMapping(value="/addKnowCarByCarno",produces="html/text;charset=utf-8")
		@ResponseBody
		public String addKnowCarByCarno(@RequestParam("senderId") long senderId,
										@RequestParam("carNo") String carNo) {
			KuCarowner carowner = kuCarownerService.selectByCarNo(carNo);
			JSONObject obj=new JSONObject();
			if(carowner!=null){
				obj.put("success", true);
				KuKnowcar knowcar=new KuKnowcar();
				knowcar.setSenderid(senderId);
				knowcar.setCarownerid(carowner.getUserid());
				knowcar.setAddtime((int)(System.currentTimeMillis()/1000));
				int i = kuKnowcarService.insert(knowcar);
				if(i==1){
					obj.put("message", "添加熟车成功！");
				}else{
					obj.put("message", "已添加，无法重复添加！");
				}
			}else{
				obj.put("success", false);
			}
			return obj.toJSONString();
		}
}
