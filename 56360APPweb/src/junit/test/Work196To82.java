package junit.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class Work196To82 {
	private static String user = "56360app";
	private static String password = "123456";
	private static String driver = "com.mysql.jdbc.Driver";
	//private static String url = "jdbc:mysql://127.0.0.1:3306/mk?useUnicode=true&amp;characterEncoding=gbk";
	//private static String url = "jdbc:mysql://127.0.0.1:3306/56360app1?useUnicode=true&amp;characterEncoding=gbk";
	private static String url = "jdbc:mysql://202.102.145.196:3306/56360app1?useUnicode=true&amp;characterEncoding=gbk";
	private static Connection conn = null;
	private static Statement stmt = null;
	private static String driver1 = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String url1 = "jdbc:sqlserver://218.59.144.244:5371;databasename=db360";
	private static String user1 = "jnhyw_mydb001";
	private static String password1 = "jnhyw_mypwd008";
	private static Connection conn1 = null;
	private static Statement stmt1 = null;
	PreparedStatement pstm = null;
	double start;
	double end;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	static int count=0;
	static String str = "id,username,password,memtype,memtypesign,pce,go_sign,realsign,issf,loginsign,province,city,town,address,line,"
			+ "mobile,mobile2,mobile3,intel1,intel2,tel,company,realname,postcard,nicename,headimage,companyimage,companyintro,"
			+ "companypic,postcardimage1,postcardimage2,postcardimage3,addCounts,addCounts0,addCounts1,addCounts2,loginCounts,local_province,"
			+ "local_city,local_town,local_addr,local_latitude,local_lontitude,local_ip,local_times,adddate,enddate,addtime,drilicencepic1,drilicenceno1,"
			+ "drilicencepic2,ownname,ownaddress,carno,cartype,carlong,carload,shibieID,cardrvierID,yunyingID,guacheID,field2";
@Test
	public void go() {
	try {
		Class.forName(driver);
		conn = DriverManager.getConnection(url, user, password);
		String sql = "select "+str+" from e_user where id >1";
		Statement stmt = conn.createStatement();
		ResultSet rs =  stmt.executeQuery(sql);
		Class.forName(driver1);
		conn1 = DriverManager.getConnection(url1, user1, password1);
		String sql1 = "insert into e_user ("+str+") values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstm = conn1.prepareStatement(sql1);
		System.out.println(conn1);
		int count =0;
		conn1.setAutoCommit(false);
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
			pstm.setString(49, rs.getString(49));
			pstm.setString(50, rs.getString(50));
			pstm.setString(51, rs.getString(51));
			pstm.setString(52, rs.getString(52));
			pstm.setString(53, rs.getString(53));
			pstm.setString(54, rs.getString(54));
			pstm.setString(55, rs.getString(55));
			pstm.setString(56, rs.getString(56));
			pstm.setString(57, rs.getString(57));
			pstm.setString(58, rs.getString(58));
			pstm.setString(59, rs.getString(59));
			pstm.setString(60, rs.getString(60));
			pstm.setString(61, rs.getString(61));
			pstm.setString(62, rs.getString(62));
			pstm.addBatch();
			if(count%100==0){
				int[] i = pstm.executeBatch();
				System.out.println(i.length);
				pstm.clearBatch();
			}
		}
		pstm.executeBatch();
		conn1.commit();  
        conn1.setAutoCommit(true);
	} catch (Exception e) {
		e.printStackTrace();
	}
		
		//rs.close();
		try {
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pstm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn1.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
