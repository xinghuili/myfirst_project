package com.mywork.task.util;

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

public class Db2Json {

	public static String db2Json(String sql) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;


		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url = "jdbc:sqlserver://218.59.146.91:5371;DataBaseName=jnhyw002";
		String user = "user_java_jn2";
		String password = "pwd_jn2_pwd";
		
	
		
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
//			System.out.println("连接成功...........");
			rs = stmt.executeQuery(sql);// 执行sql语句

			
			// 总记录数
			// 总记列数
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();

			String value="";
			while (rs.next()) {
				// 遍历ResultSet中的每条数据
				JSONObject jsonObj = new JSONObject();
				// 遍历每一列
				for (int i = 1; i <= columnCount; i++) {
					String columnName = metaData.getColumnLabel(i);
					
					try {
						value = rs.getString(URLEncoder.encode(columnName, "UTF-8"));
					} catch (UnsupportedEncodingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
					jsonObj.put(columnName, value);
				}
				
				array.add(jsonObj);
//				System.out.println("wwwwwww==" + array.size());
				
			}
//			System.out.println("总计读取：" + count + "条数据！");

		} catch (SQLException e) {
//			System.out.println("eeeeeeeeeee===="+e.getMessage());
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

	
	
	
	///////////////////////获取数据库最大id////////////////////////////////////////////////
	public static int getMaxID(String sql) {
		int maxid=0;
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url = "jdbc:sqlserver://218.59.146.91:5371;DataBaseName=jnhyw002";
		String user = "user_java_jn2";
		String password = "pwd_jn2_pwd";
		
		
		try {
			Class.forName(driver); // 加载mysq驱动
			// Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("maxid驱动加载错误");
			e.printStackTrace();// 打印出错详细信息
		}
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("maxid数据库链接错误");
			e.printStackTrace();
		}
		
		try {
			stmt = conn.createStatement();
//			System.out.println("连接成功...........");
//			sql = "SELECT MAX(ID) FROM pei_orders";
			// sql = "select * from S_PSInfo";
			rs = stmt.executeQuery(sql);// 执行sql语句
			// System.out.println("yyyyy=="+rs.findColumn(columnLabel));

			while (rs.next()) {
				//获取最大ID
//				System.out.println(rs.getInt("ID") + "   ");
				maxid=rs.getInt("ID");
			}
			

		} catch (SQLException e) {
			System.out.println("maxid数据操作错误");
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
			System.out.println("maxid数据库关闭错误");
			e.printStackTrace();
		}

	
		return maxid;
	}
	
	
}
