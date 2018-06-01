package com.kuheng.controller.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jpush.api.push.PushResult;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.kuheng.entity.member.EUser;
import com.kuheng.entity.member.KuFriend;
import com.kuheng.service.system.EUserService;
import com.kuheng.service.system.KuFriendService;
import com.kuheng.utils.JPushClientUtil;

@Controller
@RequestMapping("/mobile/logistics")
public class LogisticsAction {
	@Autowired
	private EUserService eUserService;
	@Autowired
	private KuFriendService kuFriendService;
	//搜索要添加好友电话	
	@RequestMapping(value="/searchAddFriendByTel",produces="html/text;charset=utf-8")
	@ResponseBody
	public String searchAddFriendByTel(@RequestParam("mobile") String mobile) {
		EUser user = eUserService.selectByMobile(mobile);
		JSONObject obj=new JSONObject();
		Map<String,Object> map=new HashMap<String, Object>();
		if(user!=null){
			if((user.getMemtype()==3)||(user.getMemtype()==2)||(user.getMemtype()==0&&(user.getGoSign()==1||user.getGoSign()==2))){
				obj.put("success",true);
				map.put("headpic", user.getHeadimage().split(",")[1]);
				map.put("username", user.getUsername());
				map.put("realname", user.getRealname());
				map.put("id", user.getId());
				JSONArray arr=new JSONArray();
				arr.add(new JSONObject(map));
				obj.put("user", arr);
			}else{
				obj.put("success", false);
				obj.put("message","该手机用户没有认证，无法添加好友！");
			}			
		}else{
			obj.put("success", false);
			obj.put("sendsms", true);
			obj.put("message","该手机用户没有注册56360，发短信邀请其加入该平台！");
		}
		return obj.toJSONString();
	}
	
	//搜索要添加好友真实姓名
	@RequestMapping(value="/searchAddFriendByRealName",produces="html/text;charset=utf-8")
	@ResponseBody
	public String searchAddFriendByRealName(@RequestParam("realName") String realName) {
		List<EUser> list = eUserService.selectByRealName(realName);
		if(list!=null&&list.size()>0){
			JSONArray arr=new JSONArray();
			for (EUser user : list) {
				Map<String,Object> map=new HashMap<String, Object>();
				map.put("headpic", user.getHeadimage().split(",")[1]);
				map.put("username", user.getUsername());
				map.put("realname", user.getRealname());
				map.put("id", user.getId());
				arr.add(new JSONObject(map));
			}
			return arr.toJSONString();
		}else{
			return null;
		}
	}
	
	//添加好友
		@RequestMapping(value="/addFriend",produces="html/text;charset=utf-8")
		@ResponseBody
		public String addFriend(@RequestParam("userId1") long userId1,
								@RequestParam("userId2") long userId2,
								@RequestParam("realName") String realName) {
			KuFriend friend=new KuFriend();
			friend.setUserid1(userId1);
			friend.setUserid2(userId2);
			friend.setState(false);
			friend.setAddtime((int)(System.currentTimeMillis()/1000));
			int i = kuFriendService.insert(friend);
			JSONObject obj=new JSONObject();
			if(i==2){
				obj.put("success", true);
				obj.put("message", "添加申请发送成功！");
				Set<String> alias=new TreeSet<String>();
				alias.add(String.valueOf(userId2));
				JPushClientUtil.sendNotificationByAlias("好友提示",realName+"请求添加您为好友，请去[新的好友]中接受！",alias);
				JPushClientUtil.sendMessageByAlias("newFriend", String.valueOf(userId1), alias);
			}else if(i==1){
				obj.put("success", false);
				obj.put("message", "已添加好友！");
			}else if(i==0){
				obj.put("success", false);
				obj.put("message", "添加申请已存在，请在［新的好友］中查看或等待对方同意");
			}
			return obj.toJSONString();	
		}
		
		//查找全部好友
		@RequestMapping(value="/allFriend",produces="html/text;charset=utf-8")
		@ResponseBody
		public String allFriend(@RequestParam("userId") long userId) {
			List<KuFriend> list = kuFriendService.selectByUserId(userId);
			if(list!=null&&list.size()>0){
				JSONArray arr=new JSONArray();
				long id=0;
				for (KuFriend friend : list) {
					id=(friend.getUserid1()!=userId)?friend.getUserid1():friend.getUserid2();
					EUser user = eUserService.selectByPrimaryKey(Integer.parseInt(id+""));
					Map<String,Object> map=new HashMap<String, Object>();
					map.put("itemid", friend.getItemid());
					map.put("uid", user.getId());
					map.put("bigpic", user.getHeadimage().split(",")[0]);
					map.put("imgPath", user.getHeadimage().split(",")[1]);
					map.put("title",user.getRealname());
//					map.put("province",user.getProvince());
					map.put("city",user.getCity());
					map.put("town",user.getTown());
					map.put("username",user.getUsername());
					map.put("company",user.getCompany());
					arr.add(new JSONObject(map));
				}
				return arr.toJSONString();
			}else{
				return null;
			}
		}
		
		//显示新的好友
		@RequestMapping(value="/showNewFriend",produces="html/text;charset=utf-8")
		@ResponseBody
		public String showNewFriend(@RequestParam("userId") long userId) {
			List<Map<String,Object>> list = kuFriendService.selectByUserId2(userId);
			if(list!=null&&list.size()>0){
				JSONArray arr=new JSONArray();
				for (Map<String,Object> friend : list) {
					arr.add(friend);
				}
				return arr.toJSONString();
			}else{
				return null;
			}
		}
		
		//删除好友
		@RequestMapping(value="/deleteFriend",produces="html/text;charset=utf-8")
		@ResponseBody
		public String deleteFriend(@RequestParam("itemId") int itemId,
								   @RequestParam("friendId") String friendId,
								   @RequestParam("sendId") String sendId) {
			int i = kuFriendService.deleteByPrimaryKey(itemId);
			JSONObject obj=new JSONObject();
			if(i==1){
				obj.put("success", true);
				Set<String> alias=new TreeSet<String>();
				alias.add(String.valueOf(sendId));
				JPushClientUtil.sendMessageByAlias("deleteFriend",friendId,alias);
			}else{
				obj.put("success", false);
			}
			return obj.toJSONString();
		}
		
		
		//同意添加好友
		@RequestMapping(value="/agreeFriend",produces="html/text;charset=utf-8")
		@ResponseBody
		public String agreeFriend(@RequestParam("itemId") int itemId,
								  @RequestParam("friendId") int friendId,
								  @RequestParam("realName") String realName,
								  @RequestParam("userMessage") String userMessage) {
			KuFriend friend=new KuFriend();
			friend.setState(true);
			friend.setItemid(itemId);
			int i = kuFriendService.updateByPrimaryKeySelective(friend);
			JSONObject obj=new JSONObject();
			if(i==1){
				obj.put("success", true);
				EUser user = eUserService.selectByPrimaryKey(friendId);
				Map<String,Object> map=new HashMap<String, Object>();
				map.put("friendid", friendId);
				map.put("itemid", itemId);
				map.put("mobile", user.getUsername());
				map.put("imgbig", user.getHeadimage().split(",")[0]);
				map.put("imgsmall", user.getHeadimage().split(",")[1]);
				map.put("realname", user.getRealname());
				map.put("city", user.getCity());
				map.put("town", user.getTown());
				map.put("company", user.getCompany());
				obj.put("data",new JSONObject(map));
//				System.out.println(userMessage);
				Set<String> alias=new TreeSet<String>();
				alias.add(String.valueOf(friendId));
				JPushClientUtil.sendNotificationByAlias("好友通过提示",realName+"通过了您的添加请求，可以开始沟通了！",alias);
				JPushClientUtil.sendMessageByAlias("agreeFriend",userMessage,alias);
			}else{
				obj.put("success", false);
			}
			return obj.toJSONString();
		}	
		
		//根据关键字搜索物流企业
		@RequestMapping(value="/searchLogistics",produces="html/text;charset=utf-8")
		@ResponseBody
		public String searchLogistics(@RequestParam("name") String name,
									  @RequestParam("firstResult") int firstResult,
									  @RequestParam("maxResult") int maxResult) {
			Map<String,Object> param =new HashMap<String,Object>();
			param.put("name", "%"+name+"%");
			param.put("firstResult", firstResult);
			param.put("maxResult", maxResult);
			List<EUser> list = eUserService.selectByCompanyName(param);
			if(list!=null&&list.size()>0){
				JSONArray arr=new JSONArray();
				for (EUser user : list) {
					Map<String,Object> map=new HashMap<String, Object>();
					map.put("uid", user.getId());
					map.put("company",user.getCompany());
					map.put("companyimage",user.getCompanyimage());
					map.put("companyintro",user.getCompanyintro());
					map.put("line", user.getLine());
					map.put("headimage", user.getHeadimage());
					map.put("realname",user.getRealname());
					map.put("memtypesign",user.getMemtypesign());
					map.put("province",user.getProvince());
					map.put("city",user.getCity());
					map.put("town",user.getTown());
					map.put("address",user.getAddress());
					map.put("mobile",user.getUsername());
					map.put("mobile2",user.getMobile2());
					map.put("mobile3",user.getMobile3());
					map.put("intel1",user.getIntel1());
					map.put("intel2",user.getIntel2());
					map.put("tel",user.getTel());
					arr.add(new JSONObject(map));
				}
				return arr.toJSONString();
			}else{
				return null;
			}
		}
		
		//根据物流录类别搜索物流企业列表
		@RequestMapping(value="/showLogisticsByLocation",produces="html/text;charset=utf-8")
		@ResponseBody
		public String showLogisticsByLocation(@RequestParam("sign") int sign,
									@RequestParam("province") String province,
									@RequestParam("city") String city,
									@RequestParam("town") String town,
									@RequestParam("firstResult") int firstResult,
									@RequestParam("maxResult") int maxResult) {
			Map<String,Object> param =new HashMap<String,Object>();
			param.put("sign", sign);
			param.put("province", province);
			param.put("city", city);
			param.put("town", town);
			param.put("firstResult", firstResult);
			param.put("maxResult", maxResult);
			List<EUser> list = eUserService.selectByCompanyLocation(param);
			if(list!=null&&list.size()>0){
				JSONArray arr=new JSONArray();
				for (EUser user : list) {
					Map<String,Object> map=new HashMap<String, Object>();
					map.put("uid", user.getId());
					map.put("company",user.getCompany());
					map.put("companyimage",user.getCompanyimage());
					map.put("companyintro",user.getCompanyintro());
					map.put("line", user.getLine());
					map.put("headimage", user.getHeadimage());
					map.put("realname",user.getRealname());
					map.put("memtypesign",user.getMemtypesign());
					map.put("province",user.getProvince());
					map.put("city",user.getCity());
					map.put("town",user.getTown());
					map.put("address",user.getAddress());
					map.put("mobile",user.getUsername());
					map.put("mobile2",user.getMobile2());
					map.put("mobile3",user.getMobile3());
					map.put("intel1",user.getIntel1());
					map.put("intel2",user.getIntel2());
					map.put("tel",user.getTel());
					arr.add(new JSONObject(map));
				}
				return arr.toJSONString();
			}else{
				return null;
			}
		}
		
		//根据专线搜索物流企业列别
		@RequestMapping(value="/showLogisticsLine",produces="html/text;charset=utf-8")
		@ResponseBody
		public String showLogisticsLine(@RequestParam("sign") int sign,
									@RequestParam("province1") String province1,
									@RequestParam("city1") String city1,
									@RequestParam("town1") String town1,
									@RequestParam("province2") String province2,
									@RequestParam("city2") String city2,
									@RequestParam("town2") String town2,
									@RequestParam("firstResult") int firstResult,
									@RequestParam("maxResult") int maxResult) {
			Map<String,Object> param =new HashMap<String,Object>();
			param.put("sign", sign);
			param.put("province1", province1);
			param.put("city1", city1);
			param.put("town1", town1);
			param.put("province2", province2);
			param.put("city2", city2);
			param.put("town2", town2);
			param.put("firstResult", firstResult);
			param.put("maxResult", maxResult);
//			System.out.println(param.toString());
			List<EUser> list = eUserService.selectByLine(param);
			if(list!=null&&list.size()>0){
				JSONArray arr=new JSONArray();
				for (EUser user : list) {
					Map<String,Object> map=new HashMap<String, Object>();
					map.put("uid", user.getId());
					map.put("company",user.getCompany());
					map.put("companyimage",user.getCompanyimage());
					map.put("companyintro",user.getCompanyintro());
					map.put("line", user.getLine());
					map.put("headimage", user.getHeadimage());
					map.put("realname",user.getRealname());
					map.put("memtypesign",user.getMemtypesign());
					map.put("province",user.getProvince());
					map.put("city",user.getCity());
					map.put("town",user.getTown());
					map.put("address",user.getAddress());
					map.put("mobile",user.getUsername());
					map.put("mobile2",user.getMobile2());
					map.put("mobile3",user.getMobile3());
					map.put("intel1",user.getIntel1());
					map.put("intel2",user.getIntel2());
					map.put("tel",user.getTel());
					arr.add(new JSONObject(map));
				}
				return arr.toJSONString();
			}else{
				return null;
			}
		}
		
//根据Id推送通知
		@RequestMapping(value="/pushNotification",produces="html/text;charset=utf-8")
		@ResponseBody
		public String pushNotification(@RequestParam("userId") String userId){
			Set<String> alias=new TreeSet<String>();
			alias.add(userId);
			PushResult result = JPushClientUtil.sendNotificationByAlias("新消息提示","有好友找您沟通，请进入[物流录]查看交流！",alias);
			return result.toString();
		}
		
}
