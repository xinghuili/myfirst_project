package com.mywork.task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.kuheng.utils.DateUtil;

/**
 * 
 * @author Administrator
 *	从sqlserver数据库里更新新注册的用户，一分钟执行一次
 */
public class TaskJob3 {
	Connection conn = null;
	Statement stmt = null;
	Connection conn1 = null;
	Statement stmt1 = null;
	ResultSet rs=null;
	double start;
	double end;
	double end1;
	double end2;
	double end3;
	DateUtil dt=new DateUtil();
	PreparedStatement pstm= null;
	int id = 0;
	static int count=0;
	static String str = ",id,username,password,memtype,memtypesign,pce,go_sign,realsign,issf,loginsign,province,city,town,address,line,"
			+ "mobile,mobile2,mobile3,intel1,intel2,tel,company,realname,postcard,nicename,headimage,companyimage,companyintro,"
			+ "companypic,postcardimage1,postcardimage2,postcardimage3,addCounts,addCounts0,addCounts1,addCounts2,loginCounts,local_province,"
			+ "local_city,local_town,local_addr,local_latitude,local_lontitude,local_ip,local_times,adddate,enddate,addtime,drilicencepic1,drilicenceno1,"
			+ "drilicencepic2,ownname,ownaddress,carno,cartype,carlong,carload,shibieID,cardrvierID,yunyingID,guacheID,";
@Test
	public void go(){
		String driver="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/mk?useUnicode=true&amp;characterEncoding=gbk";
		String user = "root";
		String password="123456";
		//加载驱动
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println("mysql--驱动加载失败");
			e.printStackTrace();
		}
		//创建连接
		try {
			conn=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("mysql--获取连接失败");
			e.printStackTrace();
		}
		
		try {
			stmt=conn.createStatement();
		} catch (SQLException e) {
			System.out.println("mysql--stmt创建失败");
			e.printStackTrace();
		}	
				
		String sql = "SELECT column_name as name,data_type as type FROM information_schema.columns WHERE table_name='e_user' AND table_schema = 'mk'";
		try {
			rs=stmt.executeQuery(sql);
			System.out.print("\"update e_user set ");
			while(rs.next()){
				 String name = rs.getString("name");
				 String type = rs.getString("type");
				 if(str.indexOf(name)!=-1){
					 count++;
					 if(type.equals("int")){
						 String ss = String.valueOf(name.charAt(0)).toUpperCase()+name.substring(1, name.length());
						 System.out.println("int "+name+"= KuEuser.get"+ss+"();");
//						 System.out.print(name +"= \"+"+name+"+\",");
//						System.out.println("pstm.setInt("+count+", rs.getInt("+count+"));"); 
					 }else if(type.equals("varchar")){
						 String ss = String.valueOf(name.charAt(0)).toUpperCase()+name.substring(1, name.length());
						 System.out.println("String "+name+"= KuEuser.get"+ss+"();");
//						 System.out.print(name +"= '\"+"+name+"+\"',");
						// System.out.println("pstm.setString("+count+", rs.getString("+count+"));"); 
					 }else if(type.equals("datetime")){
						 String ss = String.valueOf(name.charAt(0)).toUpperCase()+name.substring(1, name.length());
						 System.out.println("Date "+name+"= KuEuser.get"+ss+"();");
//						 System.out.print(name +"= \"+"+name+"+\",");
//						 System.out.println("pstm.setDate("+count+", rs.getDate("+count+"));"); 
					 }
				 }
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
		
	}
//@Test
public void ggg(){
	String [] ss =str.split(",");
	for(int i=1;i<ss.length;i++){
		ss[i]=String.valueOf(ss[i].charAt(0)).toUpperCase()+ss[i].substring(1, ss[i].length());
		System.out.println(ss[i]);
	}
	
}
}
