package com.kuheng.utils;

import java.util.Set;

import com.alibaba.fastjson.JSONObject;

import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jpush.api.JPushClient;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Message;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.AndroidNotification;
import cn.jpush.api.push.model.notification.IosNotification;
import cn.jpush.api.push.model.notification.Notification;

public class JPushClientUtil{
	
	private final static String APPKEY ="da363f19da089ddd990a9422";  //appKey = "abfd1498b53fdfe81afc0eb7"; // 必填，例如466f7032ac604e02fb7bda89

	private final static String MASTERSECRET = "cc914bbecc6e044d12d4381f";//masterSecret = "3e57d4b7756c0c7e89fe494a";// "13ac09b17715bd117163d8a1";//必填，每个应用都对应一个masterSecret

	private final static int MAXTRYTIME = 3;
	
	private static long TIMELIVE =  60 * 60 * 24 * 3;    
	
	private static JPushClient jpush=new JPushClient(MASTERSECRET, APPKEY);
	
	//推送通知给指定的用户
	public static PushResult sendNotificationByAlias(String title,String content,Set<String> alias){
		PushPayload pushPayload=buildPushNotificationByAlias_allPlatform(title,content,alias);
		System.out.println(pushPayload.toString()); 
		PushResult result=null;
		try {
			result = jpush.sendPush(pushPayload);
		}catch(APIConnectionException e){  
            System.err.println("[Connection Error]:"+ e.toString());  
        }catch(APIRequestException e){  
            System.out.println("HTTP Status:"+e.getStatus());  
            System.out.println("Error Code:"+e.getErrorCode());  
            System.out.println("Error Message:"+e.getErrorMessage());  
        }  
		return result;
	}
	
	//推送信息给指定的用户
	public static PushResult sendMessageByAlias(String content,String message,Set<String> alias){
		PushPayload pushPayload=buildPushMessageByAlias_allPlatform(content,message,alias);
		System.out.println(pushPayload.toString()); 
		PushResult result=null;
		try {
			result = jpush.sendPush(pushPayload);
		}catch(APIConnectionException e){  
            System.err.println("[Connection Error]:"+ e.toString());  
        }catch(APIRequestException e){  
            System.out.println("HTTP Status:"+e.getStatus());  
            System.out.println("Error Code:"+e.getErrorCode());  
            System.out.println("Error Message:"+e.getErrorMessage());  
        }  
		return result;
	}
	
	
	
	//全平台通知推送  
    public static PushPayload buildPushNotificationByAlias_allPlatform(String title,String content,Set<String> alias){  
        return PushPayload.newBuilder()
        				  .setPlatform(Platform.android())
        				  .setAudience(Audience.alias(alias))
        				  .setNotification(Notification.newBuilder()
        						  					   .setAlert(content)
        						  					   .addPlatformNotification(AndroidNotification.newBuilder().setTitle(title).build())  
//        						  					   .addPlatformNotification(IosNotification.newBuilder().incrBadge(1).setSound("default").addExtra("message", message).build())  
        						  					   .build())  
        				  .build();  
    }
	
    
	//全平台消息推送  
    public static PushPayload buildPushMessageByAlias_allPlatform(String content,String message,Set<String> alias){  
        return PushPayload.newBuilder()
        				  .setPlatform(Platform.android())
        				  .setAudience(Audience.alias(alias))
        				  .setMessage(Message.newBuilder().setMsgContent(content).addExtra("message", message).build())
        				  .build();  
    }
    

}
