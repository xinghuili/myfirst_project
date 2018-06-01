package com.mywork.task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	static Connection conn=null;
	static ResultSet rs=null;
	static int count =0;
	static Statement stmt = null;
	static String str = "id,username,password,memtype,memtypesign,pce,go_sign,realsign,issf,loginsign,province,city,town,address,line,"
			+ "mobile,mobile2,mobile3,intel1,intel2,tel,company,realname,postcard,nicename,headimage,companyimage,companyintro,"
			+ "companypic,postcardimage1,postcardimage2,postcardimage3,addCounts,addCounts0,addCounts1,addCounts2,loginCounts,local_province,"
			+ "local_city,local_town,local_addr,local_latitude,local_lontitude,local_ip,local_times,adddate,enddate,addtime,drilicencepic1,drilicenceno1,"
			+ "drilicencepic2,ownname,ownaddress,carno,cartype,carlong,carload,shibieID,cardrvierID,yunyingID,guacheID";
//	@org.junit.Test
	public void go(){
		DButil db=DButil.getInstance();
		conn=db.getMysqlConn();		
		System.out.println(conn);
		try {
			stmt=stmt!=null?stmt:conn.createStatement();
			System.out.println(stmt);
			String sql = "select * from e_user where id = 568";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getString("id"));
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

		public void gg(){
			String id=null,username=null,password=null,memtype=null,memtypesign=null,pce=null,go_sign=null,realsign=null,issf=null,loginsign=null,province=null,city=null,town=null,address=null,line=null,mobile=null,mobile2=null,mobile3=null,intel1=null,intel2=null,tel=null,company=null,realname=null,postcard=null,nicename=null,headimage=null,companyimage=null,companyintro=null,companypic=null,postcardimage1=null,postcardimage2=null,postcardimage3=null,addCounts=null,addCounts0=null,addCounts1=null,addCounts2=null,loginCounts=null,local_province=null,local_city=null,local_town=null,local_addr=null,local_latitude=null,local_lontitude=null,local_ip=null,local_times=null,adddate=null,enddate=null,addtime=null,drilicencepic1=null,drilicenceno1=null,drilicencepic2=null,ownname=null,ownaddress=null,carno=null,cartype=null,carlong=null,carload=null,shibieID=null,cardrvierID=null,yunyingID=null,guacheID=null;
			String sql1 ="update e_user set id= "+ id +",username= '"+username+"',password= '"+password+"',memtype= "+memtype+",memtypesign= "+memtypesign+",pce= "+pce+",go_sign= "+go_sign+",realsign= "+realsign+",issf= "+issf+",loginsign= '"+loginsign+"',province= '"+province+"',city= '"+city+"',town= '"+town+"',address= '"+address+"',line= '"+line+"',mobile= '"+mobile+"',mobile2= '"+mobile2+"',mobile3= '"+mobile3+"',intel1= '"+intel1+"',intel2= '"+intel2+"',tel= '"+tel+"',company= '"+company+"',realname= '"+realname+"',postcard= '"+postcard+"',nicename= '"+nicename+"',headimage= '"+headimage+"',companyimage= '"+companyimage+"',companyintro= '"+companyintro+"',companypic= '"+companypic+"',postcardimage1= '"+postcardimage1+"',postcardimage2= '"+postcardimage2+"',postcardimage3= '"+postcardimage3+"',addCounts= "+addCounts+",addCounts0= "+addCounts0+",addCounts1= "+addCounts1+",addCounts2= "+addCounts2+",loginCounts= "+loginCounts+",local_province= '"+local_province+"',local_city= '"+local_city+"',local_town= '"+local_town+"',local_addr= '"+local_addr+"',local_latitude= '"+local_latitude+"',local_lontitude= '"+local_lontitude+"',local_ip= '"+local_ip+"',local_times= "+local_times+",adddate= "+adddate+",enddate= "+enddate+",addtime= "+addtime+",drilicencepic1= '"+drilicencepic1+"',drilicenceno1= '"+drilicenceno1+"',drilicencepic2= '"+drilicencepic2+"',ownname= '"+ownname+"',ownaddress= '"+ownaddress+"',carno= '"+carno+"',cartype= '"+cartype+"',carlong= '"+carlong+"',carload= '"+carload+"',shibieID= '"+shibieID+"',cardrvierID= '"+cardrvierID+"',yunyingID= '"+yunyingID+"',guacheID= '"+guacheID+"' where id = "+id;
		}
		@org.junit.Test
		public void ss(){
			String [] strs=str.split(",");
			for(int i = 0;i<strs.length;i++){
				System.out.println((i+1)+":"+strs[i]);
			}
			
		}
}
