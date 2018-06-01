package com.kuheng.test;

import java.util.Timer;
import java.util.TimerTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.kuheng.service.system.KuMemberService;

@Controller
@RequestMapping("/testTask12")
public class TestTask {
	@Autowired
	private KuMemberService kuMemberService;
	
	@RequestMapping("/testTask123")
	@ResponseBody
	public String testTask() {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {			
			public void run() {
				 int i=kuMemberService.selectCount(null);
				 System.out.println((int)(System.currentTimeMillis()/1000));
				 System.out.println(i);
			}			
		},0,10000);
		JSONObject obj=new JSONObject();
		obj.put("success", "success");
		return obj.toJSONString();
	}
}
