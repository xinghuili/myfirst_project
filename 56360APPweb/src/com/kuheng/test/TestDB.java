package com.kuheng.test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class TestDB {

	
	
	public static String db2Json(String sql) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String driver = "com.alibaba.druid.pool.DruidDataSource";//"com.mysql.jdbc.Driver";// 加载mysq驱动
		String url = "jdbc:mysql://127.0.0.1:3306/56360";
		String user = "root";
		String password = "mysql";

	// json数组
	JSONArray array = new JSONArray();
	
	try {
		Class.forName(driver); // 加载mysq驱动
	} catch (ClassNotFoundException e) {
		System.out.println("87驱动加载错误");
		e.printStackTrace();// 打印出错详细信息
	}
	try {

		conn = DriverManager.getConnection(url, user, password);
	} catch (SQLException e) {
		System.out.println("87数据库链接错误");
		e.printStackTrace();
	}

	try {
		stmt = conn.createStatement();
		System.out.println("连接成功...........");
		rs = stmt.executeQuery(sql);// 执行sql语句

		
		// 总记录数
		// 总记列数
		ResultSetMetaData metaData = rs.getMetaData();
		int columnCount = metaData.getColumnCount();

		System.out.println("总计读取：" + columnCount + "条数据！");

	} catch (SQLException e) {
//		System.out.println("eeeeeeeeeee===="+e.getMessage());
		System.out.println("87数据操作错误");
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
		System.out.println("87数据库关闭错误");
		e.printStackTrace();
	}
	return array.toString();
}

	
	
	
	public static void main(String[] args) {
		 TestDB db = new TestDB();
		 db.db2Json("select * from ku_admin");
	}

}
