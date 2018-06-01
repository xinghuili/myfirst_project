package com.kuheng.controller.member;

import java.math.BigDecimal;
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
import com.kuheng.entity.member.EInfo;
import com.kuheng.entity.member.EUser;
import com.kuheng.entity.member.KuBank;
import com.kuheng.entity.member.KuCollection;
import com.kuheng.entity.member.KuCredit;
import com.kuheng.entity.member.KuEnchashment;
import com.kuheng.entity.member.KuFinanceRecord;
import com.kuheng.entity.member.KuLoan;
import com.kuheng.entity.member.KuMessage;
import com.kuheng.entity.member.KuMobile;
import com.kuheng.entity.member.KuReceipt;
import com.kuheng.entity.member.KuSender;
import com.kuheng.service.system.EInfoService;
import com.kuheng.service.system.EUserService;
import com.kuheng.service.system.KuBankService;
import com.kuheng.service.system.KuCollectionService;
import com.kuheng.service.system.KuCreditService;
import com.kuheng.service.system.KuEnchashmentService;
import com.kuheng.service.system.KuFinanceRecordService;
import com.kuheng.service.system.KuLoanService;
import com.kuheng.service.system.KuLocationService;
import com.kuheng.service.system.KuMessageService;
import com.kuheng.service.system.KuMobileService;
import com.kuheng.service.system.KuReceiptService;
import com.kuheng.service.system.KuSenderService;

@Controller
@RequestMapping("/mobile/mine")
public class MineAction {
	@Autowired
	private KuSenderService kuSenderService;
	@Autowired
	private KuFinanceRecordService kuFinanceRecordService;
	@Autowired
	private KuBankService kuBankService;
	@Autowired
	private KuMobileService kuMobileService;
	@Autowired
	private KuCreditService kuCreditService;
	@Autowired
	private EUserService eUserService;
	@Autowired
	private EInfoService eInfoService;
	@Autowired
	private KuMessageService kuMessageService;
	@Autowired
	private KuEnchashmentService kuEnchashmentService;
	@Autowired
	private KuCollectionService kuCollectionService;
	@Autowired
	private KuReceiptService kuReceiptService;
	@Autowired
	private KuLoanService kuLoanService;
	
	//根据userid插入货主其余信息
	@RequestMapping(value="/addSender",produces="html/text;charset=utf-8")
	@ResponseBody
	public String addSender(@RequestParam("userId") long userId){
		KuSender sender=new KuSender();
		sender.setUserid(userId);
		sender.setAddtime((int)(System.currentTimeMillis()/1000));
		sender.setEdittime((int)(System.currentTimeMillis()/1000));
		int i = kuSenderService.insert(sender);
		JSONObject obj=new JSONObject();
		if(i==1){
			obj.put("success", true);
		}else{
			obj.put("success", false);
		}
		return obj.toJSONString();
	}
	
	//根据userid查询货主的余额和绑定的所有银行卡
	@RequestMapping(value="/getMyPurseMessage",produces="html/text;charset=utf-8")
	@ResponseBody
	public String getMyPurseMessage(@RequestParam("userId") int userId){
		KuSender sender = kuSenderService.selectByPrimaryKey((long)userId);
		JSONObject obj=new JSONObject();
		obj.put("money", sender.getMoney());
		obj.put("isBank", sender.getIsbank());
//		List<KuBank> list = kuBankService.selectByUserId(param);
//		if(list!=null&&list.size()>0){
//			JSONArray arr=new JSONArray();
//			for (KuBank bank: list) {
//				arr.add(JSONObject.toJSON(bank));
//			}
//			obj.put("blist", arr);
//		}
		return obj.toJSONString();
	}
	

	//根据userid查询货主的余额和是否绑定银行卡
//	@RequestMapping(value="/getMyPurseMessage",produces="html/text;charset=utf-8")
//	@ResponseBody
//	public String getMyPurseMessage(@RequestParam("userId") int userId,
//							@RequestParam("appType") int appType){
//		KuSender sender = kuSenderService.selectByPrimaryKey((long)userId);
//		Map<String,Object> param =new HashMap<String,Object>();
//		param.put("userId", userId);
//		param.put("appType", appType);
//		List<KuBank> list = kuBankService.selectByUserId(param);
//		JSONObject obj=new JSONObject();
//		obj.put("money", sender.getMoney());
//		if(list==null){
//			obj.put("isBank", "未绑定");
//		}else{
//			obj.put("isBank", "已绑定");
//		}
//		return obj.toJSONString();
//	}
	
	
	//显示账单
	@RequestMapping(value="/purseBill",produces="html/text;charset=utf-8")
	@ResponseBody
	public String bill(@RequestParam("userId") int userid,
					   @RequestParam("appType") int appType,
					   @RequestParam("firstResult") int firstResult,
					   @RequestParam("maxResult") int maxResult){
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("userid", userid);
		map.put("appType", appType);
		map.put("firstResult", firstResult);
		map.put("maxResult", maxResult);
		List<KuFinanceRecord> list = kuFinanceRecordService.selectPaging(map);
		JSONArray arr=new JSONArray();
		if(list!=null&&list.size()>0){
			for (KuFinanceRecord record: list) {
				arr.add(JSONObject.toJSON(record));
			}
			return arr.toJSONString();
		}else{
			return null;
		}
	}	
	
	//用户已绑定银行卡
	@RequestMapping(value="/bank",produces="html/text;charset=utf-8")
	@ResponseBody
	public String bank(@RequestParam("userId") int userId,
			           @RequestParam("appType") int appType){
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("userId", userId);
		map.put("appType", appType);
		List<KuBank> list = kuBankService.selectByUserId(map);
		JSONArray arr=new JSONArray();
		if(list!=null&&list.size()>0){
			for (KuBank bank: list) {
				arr.add(JSONObject.toJSON(bank));
			}
			return arr.toJSONString();
		}else{
			return null;
		}
	}
	
	//添加银行卡
	@RequestMapping(value="/addBank",produces="html/text;charset=utf-8")
	@ResponseBody
	public String addBank(@RequestParam("userId") long userId,
			              @RequestParam("bankName") String bankName,
			              @RequestParam("bankNo") String bankNo,
			              @RequestParam("tel") String tel,
			              @RequestParam("appType") int appType){
		KuBank bank =new KuBank();
		bank.setBankname(bankName);
		bank.setBankno(bankNo);
		bank.setBankmobile(tel);
		bank.setUserid(userId);
		bank.setStatus(true);
		bank.setApptype(appType);
		int i = kuBankService.save(bank);
		JSONObject obj=new JSONObject();
		if(i==1){
			obj.put("success", true);
		}else{
			obj.put("success", false);
		}
		return obj.toJSONString();
	}
	
	//删除银行卡
	@RequestMapping(value="/deleteBank",produces="html/text;charset=utf-8")
	@ResponseBody
	public String deleteBank(@RequestParam("itemId") int itemId){
		KuBank bank =new KuBank();
		bank.setItemid(itemId);
		bank.setStatus(false);
		int i = kuBankService.update(bank);
		JSONObject obj=new JSONObject();
		if(i==1){
			obj.put("success", true);
		}else{
			obj.put("success", false);
		}
		return obj.toJSONString();
	}
	
	//查询通话记录		
	@RequestMapping(value="/callLog",produces="html/text;charset=utf-8")
	@ResponseBody
	public String savecallrecord(@RequestParam("userId") Long userId2) {
		List<KuMobile> mlist = kuMobileService.selectByUserId2(userId2);
		if(mlist!=null&&mlist.size()>0){
			JSONArray arr=new JSONArray();
			DataSourceContextHolder.setDataSouuceType(DataSourceContextHolder.DATA_SOURCE_OTHER);
			for (KuMobile mobile : mlist) {
				Map<String,Object> map=new HashMap<String, Object>();
				Long userId = mobile.getUserid();
				Long orderId = mobile.getOrderid1();
				EUser user = eUserService.selectByPrimaryKey(Integer.parseInt(userId.toString()));
				EInfo order = eInfoService.selectByPrimaryKey(Integer.parseInt(orderId.toString()));
				map.put("addTime", mobile.getAddtime());
				map.put("pic", user.getHeadimage());
				map.put("userName", user.getRealname());
				map.put("count", user.getAddcounts());
				map.put("startCity", order.getMsgStartcity());
				map.put("startTown", order.getMsgStarttown());
				map.put("endCity", order.getMsgStopcity());
				map.put("endTown", order.getMsgStoptown());
				map.put("carLong", order.getMsgCarlength());
				map.put("carType", order.getMsgCartype());
				map.put("goods", order.getMsgGoods());
				map.put("goodsWeight", order.getMsgGoodsweight());
				map.put("goodsUnit", order.getMsgGoodsunit());
				arr.add(new JSONObject(map));
			}
			DataSourceContextHolder.removeDataSourceType();
			return arr.toJSONString();
		}else{
			return null;
		}
	}
	
	//显示消息
	@RequestMapping(value="/message",produces="html/text;charset=utf-8")
	@ResponseBody
	public String allMessage(@RequestParam("userId") int userId){
		List<KuMessage> list = kuMessageService.selectByUserId(userId);
		JSONArray arr=new JSONArray();
		if(list!=null&&list.size()>0){
			for (KuMessage message: list) {
				arr.add(JSONObject.toJSON(message));
			}
			return arr.toJSONString();
		}else{
			return null;
		}
	}
	
	//显示信用总值
	@RequestMapping(value="/allCredit",produces="html/text;charset=utf-8")
	@ResponseBody
	public String allCredit(@RequestParam("userId") long userId){
		JSONObject obj=new JSONObject();
		obj.put("total", kuSenderService.selectByPrimaryKey(userId).getAllcredit());
		return obj.toJSONString();
	}	
	
	//显示信用明细
	@RequestMapping(value="/credit",produces="html/text;charset=utf-8")
	@ResponseBody
	public String credit(@RequestParam("userId") int userId,
							 @RequestParam("firstResult") int firstResult,
							 @RequestParam("maxResult") int maxResult){
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("userid", userId);
		map.put("firstResult", firstResult);
		map.put("maxResult", maxResult);
		List<KuCredit> list = kuCreditService.selectPaging(map);
		JSONArray arr=new JSONArray();
		if(list!=null&&list.size()>0){
			for (KuCredit credit: list) {
				arr.add(JSONObject.toJSON(credit));
			}
			return arr.toJSONString();
		}else{
			return null;
		}
	}	
	
	//提现
	@RequestMapping(value="/cash",produces="html/text;charset=utf-8")
	@ResponseBody
	public String cash(@RequestParam("userId") long userId,
					   @RequestParam("bankName") String bankName,
					   @RequestParam("bankNo") String bankNo,
					   @RequestParam("money") BigDecimal money){
		BigDecimal fee=new BigDecimal(0);
		KuEnchashment cash=new KuEnchashment();
		cash.setUserid(userId);
		cash.setBank(bankName);
		cash.setBankno(bankNo);
		cash.setAmount(money);
		cash.setFee(fee);
		cash.setMoney(money.subtract(fee));
		cash.setSendtime((int)(System.currentTimeMillis()/1000));
		int i = kuEnchashmentService.save(cash);
		JSONObject obj=new JSONObject();
		if(i==1){
			obj.put("success", true);
		}else{
			obj.put("success", false);
		}
		return obj.toJSONString();
	}
	
	//更换头像
	@RequestMapping(value="/changePic",produces="html/text;charset=utf-8")
	@ResponseBody
	public String changePic(@RequestParam("userId") int userId,
							@RequestParam("bigImg") String big,
							@RequestParam("smallImg") String small){
		DataSourceContextHolder.setDataSouuceType(DataSourceContextHolder.DATA_SOURCE_OTHER);
		EUser user = eUserService.selectByPrimaryKey(userId);
		user.setHeadimage(big+","+small);
		int i = eUserService.updateByPrimaryKeySelective(user);
		DataSourceContextHolder.removeDataSourceType();
		JSONObject obj=new JSONObject();
		if(i==1){
			obj.put("success", true);
			obj.put("message",big+","+small);
		}else{
			obj.put("success", false);
		}
		return obj.toJSONString();
	}
	
	
	//添加收藏企业
	@RequestMapping(value="/addCollection",produces="html/text;charset=utf-8")
	@ResponseBody
	public String addCollection(@RequestParam("collectorId") long collectorId,
							@RequestParam("collectedId") long collectedId,
							@RequestParam(value="content",required=false) String content,
							@RequestParam("type") int type) {
		KuCollection collection=new KuCollection();
		collection.setCollectorid(collectorId);
		collection.setCollectedid(collectedId);
		collection.setContent(content!=null?content:"null");
		collection.setType(type);
		int addtime=(int)(System.currentTimeMillis()/1000);
		collection.setAddtime(addtime);
		int i = kuCollectionService.insert(collection);
		JSONObject obj=new JSONObject();
		if(i==1){
			obj.put("success", true);
			obj.put("itemId",collection.getItemid());
			obj.put("addtime", addtime);
		}else{
			obj.put("success", false);
		}
		return obj.toJSONString();	
	}

	
	//显示我的全部收藏企业
	@RequestMapping(value="/showAllCollection",produces="html/text;charset=utf-8")
	@ResponseBody
	public String showAllCollection(@RequestParam("userId") long userId) {
		List<Map<String, Object>> list = kuCollectionService.selectByCollectorId(userId);
		if(list!=null&&list.size()>0){
			JSONArray arr=new JSONArray();
			for (Map<String,Object> collection : list) {
				arr.add(new JSONObject(collection));
			}
			return arr.toJSONString();
		}else{
			return null;
		}
	}
	
	//删除收藏企业
	@RequestMapping(value="/deleteCollection",produces="html/text;charset=utf-8")
	@ResponseBody
	public String deleteCollection(@RequestParam("itemId") int itemId) {
		int i = kuCollectionService.deleteByPrimaryKey(itemId);
		JSONObject obj=new JSONObject();
		if(i==1){
			obj.put("success", true);
		}else{
			obj.put("success", false);
		}
		return obj.toJSONString();
	}
	
	//添加发票
	@RequestMapping(value="/addReceipt",produces="html/text;charset=utf-8")
	@ResponseBody
	public String addReceipt(@RequestParam("userId") long userId,
			              @RequestParam("receiptname") String receiptName,
			              @RequestParam("idennumb") String idenNumb,
			              @RequestParam("addr") String addr,
			              @RequestParam("tel") String tel,
			              @RequestParam("bank") String bank,
			              @RequestParam("bankno") String bankNo,
			              @RequestParam("money") String money,
			              @RequestParam("reason") String reason,
			              @RequestParam(value="remark",required=false) String remark){
		KuReceipt receipt=new KuReceipt();
		receipt.setUserid(userId);
		receipt.setReceiptname(receiptName);
		receipt.setIdennumb(idenNumb);
		receipt.setAddr(addr);
		receipt.setTel(tel);
		receipt.setBank(bank);
		receipt.setBankno(bankNo);
		receipt.setMoney(money);
		receipt.setReason(reason);
		if(remark!=null){
			receipt.setRemark(remark);
		}
		receipt.setAddtime((int)(System.currentTimeMillis()/1000));
		int i = kuReceiptService.insert(receipt);
		JSONObject obj=new JSONObject();
		if(i==1){
			obj.put("success", true);
		}else{
			obj.put("success", false);
		}
		return obj.toJSONString();
	}
	
	//添加贷款
	@RequestMapping(value="/addLoan",produces="html/text;charset=utf-8")
	@ResponseBody
	public String addLoan(@RequestParam("userId") long userId,
			              @RequestParam("money") String money,
			              @RequestParam("reason") String reason,
			              @RequestParam("limittime") String limittime){
		KuLoan loan=new KuLoan();
		loan.setUserid(userId);
		loan.setReason(reason);
		loan.setMoney(money);
		loan.setLimittime(limittime);
		loan.setAddtime((int)(System.currentTimeMillis()/1000));
		int i = kuLoanService.insert(loan);
		JSONObject obj=new JSONObject();
		if(i==1){
			obj.put("success", true);
		}else{
			obj.put("success", false);
		}
		return obj.toJSONString();
	}
}
