package com.kuheng.controller.member;

import java.io.IOException;


//import cn.jpush.http.HttpClient;






import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.kuheng.datasource.DataSourceContextHolder;
import com.kuheng.entity.member.EUser;
import com.kuheng.entity.member.KuKnowcar;
import com.kuheng.entity.member.KuSendmsgLog;
import com.kuheng.service.system.EUserService;
import com.kuheng.service.system.KuKnowcarService;
import com.kuheng.service.system.KuSendmsgLogService;
import com.kuheng.utils.StrUtil;
import com.kuheng.utils.Systemprint;

/**
 * 短信http接口的java代码调用示例
 * @author jacky
 * @since 2013-12-1
 */
@Controller
@RequestMapping("/mobile/sms")
public class JavaSmsApi {
	@Autowired
	private KuSendmsgLogService kuSendmsgLogService;
	@Autowired
	private EUserService eUserService;
	@Autowired
	private KuKnowcarService kuKnowcarService;
	/**
	 * 服务http地址
	 */
	private static String BASE_URI = "http://yunpian.com";
	/**
	 * 服务版本号
	 */
	private static String VERSION = "v1";
	/**
	 * 编码格式
	 */
	private static String ENCODING = "UTF-8";
	/**
	 * 查账户信息的http地址
	 */
	private static String URI_GET_USER_INFO = BASE_URI + "/" + VERSION + "/user/get.json";
	/**
	 * 通用发送接口的http地址
	 */
	private static String URI_SEND_SMS = BASE_URI + "/" + VERSION + "/sms/send.json";
	/**
	 * 模板发送接口的http地址
	 */
	private static String URI_TPL_SEND_SMS = BASE_URI + "/" + VERSION + "/sms/tpl_send.json";
	
	/**
	 * 取账户信息
	 * @return json格式字符串
	 * @throws IOException 
	 */
	public static String getUserInfo(String apikey) throws IOException{
		HttpClient client = new HttpClient();
		HttpMethod method = new GetMethod(URI_GET_USER_INFO+"?apikey="+apikey);
		HttpMethodParams param = method.getParams();
		param.setContentCharset(ENCODING);
		client.executeMethod(method);
		return method.getResponseBodyAsString();
	}
	/**
	 * 发短信
	 * @param apikey apikey
	 * @param text　短信内容　
	 * @param mobile　接受的手机号
	 * @return json格式字符串
	 * @throws IOException 
	 */
	public static String sendSms(String apikey, String text, String mobile) throws IOException{
		HttpClient client = new HttpClient();
		NameValuePair[] nameValuePairs = new NameValuePair[3];
		nameValuePairs[0] = new NameValuePair("apikey", apikey);
		nameValuePairs[1] = new NameValuePair("text", text);
		nameValuePairs[2] = new NameValuePair("mobile", mobile);
		PostMethod method = new PostMethod(URI_SEND_SMS);
		method.setRequestBody(nameValuePairs);
		HttpMethodParams param = method.getParams();
		param.setContentCharset(ENCODING);
		client.executeMethod(method);
		return method.getResponseBodyAsString();
	}
	
	/**
	 * 通过模板发送短信
	 * @param apikey apikey
	 * @param tpl_id　模板id
	 * @param tpl_value　模板变量值　
	 * @param mobile　接受的手机号
	 * @return json格式字符串
	 * @throws IOException 
	 */
	public static String tplSendSms(String apikey, long tpl_id, String tpl_value, String mobile) throws IOException{
		HttpClient client = new HttpClient();
		NameValuePair[] nameValuePairs = new NameValuePair[4];
		nameValuePairs[0] = new NameValuePair("apikey", apikey);
		nameValuePairs[1] = new NameValuePair("tpl_id", String.valueOf(tpl_id));
		nameValuePairs[2] = new NameValuePair("tpl_value", tpl_value);
		nameValuePairs[3] = new NameValuePair("mobile", mobile);
		PostMethod method = new PostMethod(URI_TPL_SEND_SMS);
		method.setRequestBody(nameValuePairs);
		HttpMethodParams param = method.getParams();
		param.setContentCharset(ENCODING);
		client.executeMethod(method);
		return method.getResponseBodyAsString();
	}
	/**
	 * 
	 * @param mobile 要发送短信的手机号
	 * @throws IOException
	 */
	@RequestMapping(value="/sendsms",produces="html/text;charset=utf-8")
	@ResponseBody
	public  String go(@RequestParam("mobile") String mobile,
						@RequestParam("msg") String msg,
						@RequestParam("apptype") Integer apptype,
						HttpServletRequest request,
						HttpServletResponse resp) throws IOException {
		String method=request.getMethod();
		String apikey = "fd5c368924cda15ad5d84429462b08f8";
		String ran = getRandom();
		/**************** 使用通用接口发短信 *****************/
		//设置您要发送的内容
		//String text = "您的验证码是"+ran+"【汽配品网】";
		//发短信调用示例
		//JavaSmsApi.sendSms(apikey, text, mobile);
		
		/**************** 使用模板接口发短信 *****************/
//设置模板ID，如使用1号模板:您的验证码是#code#【#company#】
		long tpl_id=1;
//设置对应的模板变量值
		String tpl_value="#code#="+ran+"&#company#=56360";
//模板发送的调用示例
		String str=JavaSmsApi.tplSendSms(apikey, tpl_id, tpl_value, mobile);
//		String str ="测试。。。。。";
		JSONObject obj =JSON.parseObject(str);
		JSONObject json=new JSONObject();
		int status=0;
		System.out.println(str+"---------------------------------------------------------");
		if(obj.get("msg").toString().toLowerCase().equals("ok")){
			status=1;
			json.put("state", "ok");
			json.put("code", ran);
			json.put("mobile", mobile);
		}else{
			status=2;
			json.put("state", "err");
			json.put("msg", obj.get("msg"));
		}
		String ip = StrUtil.getRemortIP(request);
		int addtime= (int)(System.currentTimeMillis()/1000);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("mobile",mobile);
		map.put("title",msg);
		map.put("apptype",apptype);
		map.put("note",str);
		map.put("code",ran);
		map.put("ip",ip);
		map.put("status",status);
		map.put("addtime",addtime);
		DataSourceContextHolder.setDataSouuceType("mainDataSource");
		kuSendmsgLogService.insert1(map);	
		return json.toJSONString();		
	}
	//获取随机数
	public static  String getRandom(){
		String ran=String.valueOf(Math.random());
		ran=ran.substring(2,8);
		return ran;		
	}
	
	/**
	 * 
	 * @param mobile 要发送短信的手机号
	 * @throws IOException
	 */
	@RequestMapping(value="/sendInviteSms",produces="html/text;charset=utf-8")
	@ResponseBody
	public  String sendInviteSms(@RequestParam("senderId") long senderId,
								 @RequestParam("mobile") String mobile,
								 @RequestParam("name") String name,
						HttpServletRequest request,
						HttpServletResponse resp) throws IOException {
		EUser user = eUserService.selectByMobile(mobile);
		JSONObject json=new JSONObject();
		if(user!=null){
			json.put("success",false);
			switch(user.getMemtype()){
				case 1:
					KuKnowcar knowcar=new KuKnowcar();
					knowcar.setSenderid(senderId);
					knowcar.setCarownerid((long)user.getId());
					knowcar.setAddtime((int)(System.currentTimeMillis()/1000));
					int i = kuKnowcarService.insert(knowcar);
					JSONObject obj=new JSONObject();
					if(i==1){
						json.put("message","添加熟车成功！");
					}else{
						json.put("message","已添加，无法重复添加！");
					}
					break;
				case 2:case 3:case 0:
					json.put("message","该手机号已注册56360发货版,无法邀请加入熟车");
					break;
			}
			return json.toJSONString();
		}else{
			json.put("success",true);
			String method=request.getMethod();
			String apikey = "fd5c368924cda15ad5d84429462b08f8";
			long tpl_id=1973858;
			String tpl_value="#name#="+name;
			String str=JavaSmsApi.tplSendSms(apikey, tpl_id, tpl_value, mobile);
			JSONObject obj =JSON.parseObject(str);
			int status=0;
			if(obj.get("msg").toString().toLowerCase().equals("ok")){
				status=1;
				json.put("state", true);
				json.put("msg", "已成功发送邀请短信！");
				String ip = StrUtil.getRemortIP(request);
				int addtime= (int)(System.currentTimeMillis()/1000);
				Map<String,Object> map = new HashMap<String, Object>();
				map.put("mobile",mobile);
				map.put("title","邀请短信");
				map.put("apptype",1);
				map.put("note",str);
				map.put("code","");
				map.put("ip",ip);
				map.put("status",status);
				map.put("addtime",addtime);
				kuSendmsgLogService.insert1(map);
			}else{
				status=2;
				json.put("state", false);
				json.put("msg", obj.get("msg"));
			}
		}	
		return json.toJSONString();	
	}
	
	//加好友时邀请短信
	@RequestMapping(value="/sendFriendInviteSms",produces="html/text;charset=utf-8")
	@ResponseBody
	public  String sendFriendInviteSms(
								 @RequestParam("mobile") String mobile,
								 @RequestParam("name") String name,
						HttpServletRequest request,
						HttpServletResponse resp) throws IOException {
		String method=request.getMethod();
		String apikey = "fd5c368924cda15ad5d84429462b08f8";
		long tpl_id=1992448;
		String tpl_value="#name#="+name;
//模板发送的调用示例
		String str=JavaSmsApi.tplSendSms(apikey, tpl_id, tpl_value, mobile);
		JSONObject obj =JSON.parseObject(str);
		JSONObject json=new JSONObject();
		int status=0;
		if(obj.get("msg").toString().toLowerCase().equals("ok")){
			status=1;
			json.put("state", true);
			json.put("msg", "已成功发送邀请短信！");
			Map<String,Object> map = new HashMap<String, Object>();
			map.put("mobile",mobile);
			map.put("title","邀请短信");
			map.put("apptype",1);
			map.put("note",str);
			map.put("code","");
			map.put("ip",StrUtil.getRemortIP(request));
			map.put("status",status);
			map.put("addtime",(int)(System.currentTimeMillis()/1000));
			kuSendmsgLogService.insert1(map);	
		}else{
			status=2;
			json.put("state", false);
			json.put("msg", obj.get("msg"));
		}
		return json.toJSONString();	
	}
}    


