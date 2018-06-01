package com.mywork.task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil{
	 private static String user = "root";
	 private static String password = "123456";
	 private static String driver = "com.mysql.jdbc.Driver";
	 private static String url = "jdbc:mysql://127.0.0.1:3306/mk?useUnicode=true&amp;characterEncoding=gbk";
	 private static Connection conn=null;
	 private static String driver1="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	 private static	String url1="jdbc:sqlserver://202.110.210.82:5371;databasename=db360";
	 private static	String user1 ="jnhyw_mydb001";
	 private static	String password1="jnhyw_mypwd008";
	 private static Connection conn1=null;
	 public static DButil db= null;
	 
	 private DButil(){
	 }	 
	 public static DButil getInstance(){
		 if(db==null){
			 synchronized(DButil.class){
	                if(db == null){
	                    db = new DButil();
	                }            
	           } 
		 }
		return db; 
	 }	 
	 static{
		 try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				System.out.println("驱动加载失败");
				e.printStackTrace();
			}
	 }	 
	 public Connection getMysqlConn(){		
		 try {
			 conn=conn!=null?conn:DriverManager.getConnection(url,user,password);
			return conn;
		} catch (SQLException e) {
			System.out.println("mysql--连接失败");
			e.printStackTrace();
			return null;
		}		 
	 }
	 public Connection getSqlseverConn(){
		 try {
			 conn1=conn1!=null?conn1:DriverManager.getConnection(url1,user1,password1);
			return conn1;
		} catch (SQLException e) {
			System.out.println("sqlserver--连接失败");
			e.printStackTrace();
			return null;
		}	 
	 }
	
}