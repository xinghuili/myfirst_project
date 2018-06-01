package com.mywork.task;

import java.sql.Connection;


import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import com.kuheng.utils.DateUtil;

public class TaskJob2 {
	Connection conn = null;
	Statement stmt = null;
	Connection conn1 = null;
	Statement stmt1 = null;
	ResultSet rs=null;
	PreparedStatement pstm= null;
	double start;
	double end;
	double end1;
	double end2;
	double end3;
	DateUtil dt=new DateUtil();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");   
	static String  str = "id,username,password,memtype,memtypesign,pce,go_sign,realsign,issf,loginsign,province,city,town,address,line,"
			   + "mobile,mobile2,mobile3,intel1,intel2,tel,company,realname,postcard,nicename,headimage,companyimage,companyintro,"
			   +"companypic,postcardimage1,postcardimage2,postcardimage3,addCounts,addCounts0,addCounts1,addCounts2,loginCounts,local_province,"
			   +"local_city,local_town,local_addr,local_latitude,local_lontitude,local_ip,local_times,adddate,enddate,addtime";

	public void test(){
		String ss [] = str.split(",");
		
		for(int i = 0;i<ss.length;i++){
			int j = i+1;
//			System.out.print("'\"+"+ss[i]+"+\"',");
			System.out.println("String "+ss[i]+" = rs.getString("+j+");");
		}
	}	
	@Test
	public void delMySql() throws ParseException{
		start=System.currentTimeMillis();
		String driver="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/mk?useUnicode=true&amp;characterEncoding=gbk";
//		String url = "jdbc:mysql://127.0.0.1:3306/56360app1?useUnicode=true&amp;characterEncoding=gbk";
		String user = "root";
		String password="123456";
		//加载驱动
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println("删除数据--驱动加载失败");
			e.printStackTrace();
		}
		//创建连接
		try {
			conn=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("删除数据--获取连接失败");
			e.printStackTrace();
		}
		
//		try {
//			conn.setAutoCommit(false);
//		} catch (SQLException e1) {
//			System.out.println("conn取消自动提交操作 失败");
//			e1.printStackTrace();
//		}
		String sql = "truncate table e_user";
		try {
			stmt=conn.createStatement();
		} catch (SQLException e) {
			System.out.println("删除数据--stmt创建失败");
			e.printStackTrace();
		}
		end1=System.currentTimeMillis();
		System.out.println("删除数据用时："+((end1-start)/1000)+" s");
		try {
			int i = stmt.executeUpdate(sql);
			if(i>0){
				gogogo();
			}else{
				System.out.println("发生异常");
			}
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
	}

	public void gogogo(){
		String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url="jdbc:sqlserver://202.110.210.82:5371;databasename=db360";
		String user ="jnhyw_mydb001";
		String password="jnhyw_mypwd008";
		int count=1;
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println("读取数据--驱动加载失败");
			e.printStackTrace();
		}
		try {
			conn1=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("获取数据--获取连接失败");
			e.printStackTrace();
		}
		
		String sql = "select "+str+" from e_user";
		String sql1="insert into e_user ("+str+") values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			stmt1=conn1.createStatement();
		} catch (SQLException e) {
			System.out.println("获取数据--stmt1创建失败");
			e.printStackTrace();
		}
		
		try {
			pstm=conn.prepareStatement(sql1);
		} catch (SQLException e1) {
			System.out.println("pstm----创建失败");
			e1.printStackTrace();
		}
		
		try {
			rs=stmt1.executeQuery(sql);
			
			end2=System.currentTimeMillis();
			System.out.println("查询原始数据用时："+((end2-end1)/1000)+" s");
	
			while(rs.next()){
				pstm.setInt(1, rs.getInt(1));
				pstm.setString(2, rs.getString(2));
				pstm.setString(3, rs.getString(3));
				pstm.setInt(4, rs.getInt(4));
				pstm.setInt(5, rs.getInt(5));
				pstm.setInt(6, rs.getInt(6));
				pstm.setInt(7, rs.getInt(7));
				pstm.setInt(8, rs.getInt(8));
				pstm.setInt(9, rs.getInt(9));
				pstm.setString(10, rs.getString(10));
				pstm.setString(11, rs.getString(11));
				pstm.setString(12, rs.getString(12));
				pstm.setString(13, rs.getString(13));
				pstm.setString(14, rs.getString(14));
				pstm.setString(15, rs.getString(15));
				pstm.setString(16, rs.getString(16));
				pstm.setString(17, rs.getString(17));
				pstm.setString(18, rs.getString(18));
				pstm.setString(19, rs.getString(19));
				pstm.setString(20, rs.getString(20));
				pstm.setString(21, rs.getString(21));
				pstm.setString(22, rs.getString(22));
				pstm.setString(23, rs.getString(23));
				pstm.setString(24, rs.getString(24));
				pstm.setString(25, rs.getString(25));
				pstm.setString(26, rs.getString(26));
				pstm.setString(27, rs.getString(27));
				pstm.setString(28, rs.getString(28));
				pstm.setString(29, rs.getString(29));
				pstm.setString(30, rs.getString(30));
				pstm.setString(31, rs.getString(31));
				pstm.setString(32, rs.getString(32));
				pstm.setInt(33, rs.getInt(33));
				pstm.setInt(34, rs.getInt(34));
				pstm.setInt(35, rs.getInt(35));
				pstm.setInt(36, rs.getInt(36));
				pstm.setInt(37, rs.getInt(37));
				pstm.setString(38, rs.getString(38));
				pstm.setString(39, rs.getString(39));
				pstm.setString(40, rs.getString(40));
				pstm.setString(41, rs.getString(41));
				pstm.setString(42, rs.getString(42));
				pstm.setString(43, rs.getString(43));
				pstm.setString(44, rs.getString(44));
				pstm.setDate(45, rs.getDate(45));
				pstm.setDate(46, rs.getDate(46));
				pstm.setDate(47, rs.getDate(47));
				pstm.setDate(48, rs.getDate(48));
				pstm.executeUpdate();
				count++;
			}
		} catch (SQLException e) {
			System.out.println("获取数据--查询失败");
			e.printStackTrace();
		}
		
		end3=System.currentTimeMillis();
		System.out.println("插入数据用时："+((end3-end2)/1000)+" s");
		
		if(pstm!=null){
			try {
				pstm.close();
			} catch (SQLException e) {
				System.out.println("pstm--关闭失败");
				e.printStackTrace();
			}
		}
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				System.out.println("rs--关闭失败");
				e.printStackTrace();
			}
		}
		if(stmt1!=null){
			try {
				stmt1.close();
			} catch (Exception e) {
				System.out.println("stmt1---关闭失败");
				e.printStackTrace();
			}
		}
		if(conn1!=null){
			try {
				conn1.close();
			} catch (Exception e) {
				System.out.println("conn1----关闭失败");
				e.printStackTrace();
			}
		}
		if(stmt!=null){
			try {
				stmt.close();
			} catch (Exception e) {
				System.out.println("stmt---关闭失败");
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (Exception e) {
				System.out.println("conn---关闭失败");
				e.printStackTrace();
			}
		}
		end=System.currentTimeMillis();
		System.out.println("程序一共用时："+((end-start)/1000)+" s");
		System.out.println("共插入"+count+"条数据");
	}
}
