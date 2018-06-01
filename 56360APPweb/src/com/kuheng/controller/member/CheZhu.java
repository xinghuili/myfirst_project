package com.kuheng.controller.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.kuheng.entity.member.KuCheZhuLine;
import com.kuheng.service.system.KuCheZhuLineService;

@Controller
@RequestMapping("/chezhu")
public class CheZhu {
	@Autowired
	private KuCheZhuLineService kuCheZhuLineService;
	@RequestMapping("/addline")
	@ResponseBody
	public String addLine(
			@RequestParam("userid") int userid,
			@RequestParam("startProvince") String startProvince,
			@RequestParam("startCity") String startCity,
			@RequestParam("startTown") String startTown,
			@RequestParam("stopProvince") String stopProvince,
			@RequestParam("stopCity") String stopCity,
			@RequestParam("stopTown") String stopTown,
			@RequestParam("carLen") String carLen,
			@RequestParam("carType") String carType,
			HttpServletResponse response
			){
			KuCheZhuLine kuCheZhuLine=new KuCheZhuLine();
			kuCheZhuLine.setUserid(userid);
			kuCheZhuLine.setStartProvince(startProvince);
			kuCheZhuLine.setStartCity(startCity);
			kuCheZhuLine.setStartTown(startTown);
			kuCheZhuLine.setStopProvince(stopProvince);
			kuCheZhuLine.setStopCity(stopCity);
			kuCheZhuLine.setStopTown(stopTown);
			kuCheZhuLine.setSendType((byte) 0);
			if(!"".equals(carLen)&&null!=carLen&&!"null".equals(carLen)){
				kuCheZhuLine.setCarLength(carLen);
			}
			if(!"".equals(carType)&&null!=carType&&!"null".equals(carType)){
				kuCheZhuLine.setCarType(carType);
			}
			kuCheZhuLine.setAddtime((int)(System.currentTimeMillis()/1000));
			kuCheZhuLine.setLasttime(0);
			int i = kuCheZhuLineService.addLine(kuCheZhuLine);
			JSONObject obj = new JSONObject();
			if(i==1){
				obj.put("success",true);
			}else{
				obj.put("success",false);
			}
			
		return obj.toJSONString();
	}
	
	@RequestMapping(value="/selectline",produces="html/text;charset=utf-8")
	@ResponseBody
	public String selectLine(
			@RequestParam("userid") int userid,
			HttpServletResponse res
			){
		List<Map<String,Object>> list= kuCheZhuLineService.selectline(userid);
		JSONArray arr = new JSONArray();
		if(list!=null&&list.size()>0){
			for(Map<String,Object> map:list){
				arr.add(map);
			}
		}else{
			Map<String, Object> m = new HashMap<String, Object>();
			m.put("hasnodata", true);
			arr.add(m);
		}		
		return arr.toJSONString();
		
	}
	@RequestMapping(value="/deleteline",produces="html/text;charset=utf-8")
	@ResponseBody
	public String deleteLine(
			@RequestParam("id") int id
			){
		int i = kuCheZhuLineService.deleteLine(id);
		JSONObject obj = new JSONObject();
		if(i==1){
			obj.put("success", true);
		}else{
			obj.put("success", false);
		}
		return obj.toJSONString();
	}

}
