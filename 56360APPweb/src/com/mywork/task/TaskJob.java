package com.mywork.task;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;


import com.alibaba.fastjson.JSON;

import com.kuheng.entity.member.KuOrders;
import com.kuheng.service.system.KuOrdersService;
import com.kuheng.utils.TimeManager;
import com.mywork.task.util.Db2Json;
import com.mywork.task.util.Huoyun;
import com.mywork.task.util.PhoneUtil;

public class TaskJob{


	@Resource(name = "kuOrdersService")
	private KuOrdersService kuOrdersService;

	private Integer id=0;
	private int ord_hyid=0;
	

	
	
	String strDateBegin="23:59:00";
	String strDateEnd="00:05:00";
	
	
	 public static boolean isInDate(String date, String strDateBegin,String strDateEnd) {  
//	 	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd",Locale.ENGLISH);  
		 String strDate = date;//sdf.format(date);   //2017-04-11
	     // 截取当前时间年月日 转成整型
	     int  tempDate=Integer.parseInt(strDate.split(":")[0]+strDate.split(":")[1]+strDate.split(":")[2]);  
	     // 截取开始时间年月日 转成整型
	     int  tempDateBegin=Integer.parseInt(strDateBegin.split(":")[0]+strDateBegin.split(":")[1]+strDateBegin.split(":")[2]);  
	     // 截取结束时间年月日   转成整型
	     int  tempDateEnd=Integer.parseInt(strDateEnd.split(":")[0]+strDateEnd.split(":")[1]+strDateEnd.split(":")[2]);

	     if ((tempDate <= tempDateBegin && tempDate >= tempDateEnd)) {  	       
	        return true;  
	     } else {  
	        return false;  
	     }  
	 }
	 
	/**** 
	 *  @author Administrator
	 * @2016-11-08
	 * 任务1 为 从货运网读取数据，并保存到mysql新建的数据库中。每10秒读取一次，如读取的数据大于本地的数据则写入，反之则不写。
	 *	read1读取济宁的信息
	 *
	 ****/
	public void read1() throws Exception{
		
		TimeManager tm = new TimeManager();
		String dd = tm.getHMS();
		
		TaskJob tj = new TaskJob();
//		System.out.println("当前时间=="+dd);
//		System.out.println("开始时间=="+strDateBegin);
//		System.out.println("结束时间=="+strDateEnd);
		boolean flag = tj.isInDate(dd, strDateBegin, strDateEnd);
		if(flag){
			int a = 0;
			if(ord_hyid==0){
	
				//获取最新的数据，获取对应Huoyun的id;
				int maxid=Db2Json.getMaxID("SELECT * FROM s_wlinfo_jn2 where id=(SELECT max(ID) FROM s_wlinfo_jn2)");
				
				if(maxid>2000){
					ord_hyid=(maxid-500);
				}

			}
			
			
			// 获取本货运网的数据库的数据
	//		String sql = " select top 1000 * from S_PSInfo_java2 where id> "+ord_hyid+"   order by id asc";
			String sql = " select top 1000 * from s_wlinfo_jn2 where id> "+ord_hyid+"   order by id asc";
			String sets = Db2Json.db2Json(sql);
			List list = JSON.parseArray(sets, Huoyun.class);
			a = list.size();
			System.out.println("sssssssss==="+a);
			if (a<=0) {
				ord_hyid=0;
			} else {
				// 只插入新数据
				Huoyun bean = null;
	
				String Msg_Code = "";
				String Msg_Town = "";
				String Msg_TelDe = "";
				String Msg_Area = "";
				String Msg_NetPhone = "";
				String Msg_QQ = "";
				String Msg_EnContent = "";
				String Msg_Dx = "";
				String Msg_Lt = "";
	//			String msg_Stopprovince = "";
	//			String msg_Stopcity = "";
	//			String msg_Stoptown = "";
				String msg_Action = "";
				String Msg_StartProvince = "";
				String Msg_StartTown = "";
				String Msg_StartCity = "";
				Integer userid=0;
				String goodsnote="";
				String company=""; //发货企业
				String sender=""; //联系人
				String semobile="";//联系方式
				String sendaddress="";//起始地区+县区
				String recaddress="";//终点地区+县区
				String title="";
				String type="";    //区分0是配送，1是询价
				int addtime=0;
				int recarea=0;	//收货方地址id
				int sendarea=0;  //发货方地址id
				String kaishi="";	//
				String jiesu="";
				
				///////////////////////////
				int Msg_NewClient=0;
	
				for (int i = 0; i <a; i++) {
	
					Msg_Code="";
					bean = (Huoyun) list.get(i);
	
					if (bean.getMsg_Code() != null
							&& !"".equals(bean.getMsg_Code())) {
						Msg_Code = bean.getMsg_Code();
	
					}
	//				if (bean.getMsg_Town() != null
	//						&& !"".equals(bean.getMsg_Town())) {
	//					Msg_Town = bean.getMsg_Town();
	//				}
					if (bean.getMsg_TelDe() != null
							&& !"".equals(bean.getMsg_TelDe())) {
						Msg_TelDe = bean.getMsg_TelDe();
					}
					if (bean.getMsg_Area() != null
							&& !"".equals(bean.getMsg_Area())) {
						Msg_Area = bean.getMsg_Area();
					}
					if (!"".equals(bean.getMsg_NetPhone())&&bean.getMsg_NetPhone().length()>3) {
						Msg_NetPhone = bean.getMsg_NetPhone();
					}
					if (bean.getMsg_QQ() != null && !"".equals(bean.getMsg_QQ())) {
						Msg_QQ = bean.getMsg_QQ();
					}
	
					if (!"".equals(bean.getMsg_Dx())&& bean.getMsg_Dx().length()>3) {
						Msg_Dx = bean.getMsg_Dx();
					}
					if (!"".equals(bean.getMsg_Lt())&&bean.getMsg_Lt().length()>3) {
						Msg_Lt = bean.getMsg_Lt();
					}
					
				
					if (bean.getMsg_StartCity() != null
							&& !"".equals(bean.getMsg_StartCity())) {
						Msg_StartCity = bean.getMsg_StartCity();
					}
	
					if(bean.getMsg_QQ()!=null && !"".equals(bean.getMsg_QQ())){
						sender=bean.getMsg_QQ();
					}
	
	
					if(bean.getMsg_EnContent()!=null && !"".equals(bean.getMsg_EnContent())){
						company=bean.getMsg_EnContent();
					}
	
					if(bean.getMsg_TelDe()!=null && !"".equals(bean.getMsg_TelDe())){
	//					semobile=bean.getMsg_TelDe();
						PhoneUtil pu = new PhoneUtil();
						semobile = pu.getMobile(bean.getMsg_TelDe());
					}
	
					if(bean.getMsg_Flag()>0){
						userid = bean.getMsg_Flag();
					}
	
					if(bean.getId()>0){
						id = bean.getId();
					}
	
	
					type=bean.getMsg_Type()+"";
					//区分信息来源，对应infotype。（1 济宁货运网发布    0外地信息）
					Msg_NewClient = bean.getMsg_NewClient();
	
					// 主键 当前时间毫秒+两位随机数
					int bb = (int) ((Math.random() * 90) + 10);// 两位随机数
					long ttw = System.currentTimeMillis();
					String ordid = Long.toString(ttw);
					String ddd = ordid + bb;
					long ordersid = Long.parseLong(ddd);
	
	
	
					//对Msg_StartTown,msg_Stoptown进行截取处理
					if(Msg_StartTown.trim().length()>=2){
						kaishi=Msg_StartTown.trim().substring(0, 2);  //县区长度大于2截取前两个字，小于2则用地区
					}else{
						kaishi=Msg_StartCity;
					}
	
	
					if(!"".equals(Msg_Lt) && Msg_Lt.length()>3){
						if(Msg_Lt.indexOf("-")>0){
							Msg_Lt=Msg_Lt.replaceAll("-", ",");
						}
						semobile=semobile+",联通:"+Msg_Lt;
					}
					if(!"".equals(Msg_Dx) && Msg_Dx.length()>3){
						if(Msg_Dx.indexOf("-")>0){
							Msg_Dx=Msg_Dx.replaceAll("-", ",");
						}
						semobile=semobile+",电信:"+Msg_Dx;
					}
					if(!"".equals(Msg_NetPhone)&& Msg_NetPhone.length()>3){
						if(Msg_NetPhone.indexOf("-")>0){
							Msg_NetPhone=Msg_Lt.replaceAll("-", ",");
						}
						semobile=semobile+",移动:"+Msg_NetPhone;
					}
					
					if(semobile.length()>150){
						semobile=semobile.substring(0, 150);
					}
					if(bean.getMsg_Content().length()>250){
						goodsnote = bean.getMsg_Content().substring(0,250);
					}else{
						goodsnote = bean.getMsg_Content()+"";
					}
	
					sendaddress=Msg_Code;//Msg_StartProvince + Msg_StartCity+Msg_StartTown;//bean.getMsg_StartCity()+bean.getMsg_StartTown();
	//				recaddress = msg_Stopprovince + msg_Stopcity+msg_Stoptown;
					title=id+"";
					if("济宁配送".equals(Msg_Area)){
						userid=userid;
					}else{
						userid=0;
					}
					
					
					//将时间转化成秒
					 String str = bean.getMsg_AddTime().toString();
					 Calendar calendar = Calendar.getInstance();
					  //毫秒
					  long millionSeconds = 0L;
					try {
						 calendar.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str));
						millionSeconds = calendar.getTimeInMillis();
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					addtime=(int)(millionSeconds/1000);
					
					
					String ip = bean.getMsg_Ip();
					BigDecimal mo = new BigDecimal(0.0);
	
	
	
					/************
					 * 
					 * 以下连接mysql保存到mysql中
					 * 
					 * 
					 * 
					 * ************/
	
					KuOrders order = new KuOrders();
					order.setAddtime(addtime);
					order.setAllfee(mo);
					order.setDelstatus(0);
					order.setEditer("");
					order.setEvaluation(0);
					order.setGoodsnote(goodsnote);
					order.setInfotype(1);
					order.setIp(ip);
					order.setLatitude(mo);
					order.setLongitude(mo);
					order.setMsgSign(0);
					order.setOrdersid(ordersid);
					order.setOtherservice("");
					order.setPayway(0);
					order.setRecaddress(recaddress);
					order.setRecarea(recarea);
					order.setRunstatus("");
					order.setSendaddress(sendaddress);
					order.setSendarea(sendarea);
					order.setSendcompany(company);
					order.setSendmobile(semobile);
					order.setSendrealname(sender);
					order.setSigntime(0);
					order.setStatus((byte)0);
					order.setTitle(title);
					order.setTransportbyid(userid);
					order.setUpdatetime(0);
					order.setUserid((long)userid);
					
					kuOrdersService.save(order);
	
					if(i==(a-1)){
						ord_hyid = id;
					}
				}
			}
	//		System.out.println("进入job4命令................");   
			job4();
		
		}
	}


	
	
	

	// 每天00：01:10定时清空数据库表pei_orders
	public void job2() {

//		String hql_mysql = " truncate table pei_orders ";
//		String hql_2 = " truncate table pei_orders_2 ";
//		String hql_2new = " truncate table pei_orders_2_new ";
//		String hql_3 = " truncate table pei_orders_3 ";
//		String hql_3new = " truncate table pei_orders_3_new ";
//
//		Connection conn = null;
//		Statement stmt = null;
//		ResultSet rs = null;
//		String url = "jdbc:mysql://192.168.1.166:3306/56360";
//		String user = "56360";
//		String password = "123456";
//
//		try {
//			Class.forName("com.mysql.jdbc.Driver"); // 加载mysq驱动  
//		} catch (ClassNotFoundException e) {
//			System.out.println("13驱动加载错误job2");
//			e.printStackTrace();// 打印出错详细信息
//		}
//		try {
//			conn = DriverManager.getConnection(url, user, password);
//		} catch (SQLException e) {
//			System.out.println("13数据库链接错误job2");
//			e.printStackTrace();
//		}
//
//		try {
//			stmt = conn.createStatement();
//			stmt.executeUpdate(hql_mysql);// 执行sql语句
//			stmt.executeUpdate(hql_2);
//			stmt.executeUpdate(hql_2new);
//			stmt.executeUpdate(hql_3);
//			stmt.executeUpdate(hql_3new);
////			System.out.println("13执行sql语句job2");
//		} catch (SQLException e) {
//			System.out.println("13数据操作错误job2");
//			e.printStackTrace();
//		}
//
//		// 关闭数据库
//		try {
//			if (rs != null) {
//				rs.close();
//				rs = null;
//			}
//			if (stmt != null) {
//				stmt.close();
//				stmt = null;
//			}
//			if (conn != null) {
//				conn.close();
//				conn = null;
//			}
//		} catch (Exception e) {
//			System.out.println("13数据库关闭错误job2");
//			e.printStackTrace();
//		}
				
	}







	// 每天定时删除S_PSInfo_java2中已读取的数据
	public void job4() {
		
		String sql = " delete from s_wlinfo_jn2 where id<"+ord_hyid;

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url = "jdbc:sqlserver://218.59.146.91:5371;DataBaseName=jnhyw002";
		String user = "user_java_jn2";
		String password = "pwd_jn2_pwd";

		try {
			Class.forName(driver); // 加载驱动
		} catch (ClassNotFoundException e) {
			System.out.println("87驱动加载错误4");
			e.printStackTrace();// 打印出错详细信息
		}
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("87数据库链接错误4");
			e.printStackTrace();
		}

			try {
				stmt = conn.createStatement();
				stmt.executeUpdate(sql);// 执行sql语句

			} catch (SQLException e) {
				System.out.println("87数据操作错误4");
				e.printStackTrace();
			}

			// 关闭数据库
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
				
			} catch (Exception e) {
				System.out.println("87数据库关闭错误4");
				e.printStackTrace();
			}

		}

	
	
	
	
	public static void main(String[] args) {
		TaskJob job = new TaskJob();
		
//		try {
//			job.read1();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
////			e.printStackTrace();
//			System.out.println("ddddeeeeeeee==="+e.getMessage());
//		}
		
		
		
	}
}
