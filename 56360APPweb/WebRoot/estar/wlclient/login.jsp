<%@ include file="conn.jsp" %>
<%@ page import="org.json.*" %>
<jsp:useBean id="MyFun" scope="page" class="myFun.EFuns" />
<%
	request.setCharacterEncoding("UTF-8");//解决POST数据中文乱码，提交页面为UTF-8编码
	//判断是否为POST提交 
	if(!request.getMethod().toUpperCase().equals("POST"))
	{
		//out.print(MyFun.MyEnCode(MyFun.printError("Error",new String("提交失败 ".getBytes()))));
		//return;
	}
    	String action=MyFun.GetRequest(request.getParameter("action"));
	if (action.toLowerCase().equals("login_client")){
			//登录设备标识
			String loginMac=MyFun.GetRequest(request.getParameter("loginMac"));
			if(loginMac.isEmpty() || loginMac.equals("")){
				out.print(MyFun.MyEnCode(MyFun.printError("error",new String("提交参数错误 ".getBytes()))));
				return;
			}
			//会员名
			String username=MyFun.GetRequest(request.getParameter("username"));
			if(username.isEmpty() || username.equals("")){
				out.print(MyFun.MyEnCode(MyFun.printError("error",new String("用户名为空 ".getBytes()))));
				return;
			}
			Statement stmt_1=conn.createStatement();
			String sql_1="select password from e_user where username = '"+username+"'";
			ResultSet rs_1=stmt_1.executeQuery(sql_1);
			String password="";
			if(rs_1.next()){
				password=rs_1.getString("password");
				rs_1.close();
			}
			stmt_1.close();
			//mac1
			String mac1=request.getParameter("mac1").trim();
			if(mac1.isEmpty() || mac1.equals("")){
				mac1="0";
			}
			//mac2
			String mac2=request.getParameter("mac2").trim();
			if(mac2.isEmpty() || mac2.equals("")){
				mac2="0";
			}
			String devices=request.getParameter("devices");
			//---------------------------------------------------------
			String sql="exec get_login '"+username+"','"+password+"' ";
			ResultSet rs=stmt.executeQuery(sql);
			//判断是否正确
			if(!rs.next()){
				//out.print("UserOrPassError");//
				out.print(MyFun.MyEnCode(MyFun.printError("error",new String("登陆失败！ ".getBytes()))));
			}else{
				//判断loginSign是否在允许范围内
				String userID=rs.getString("id");//		int		自动编号
				String memtype=rs.getString("memtype");//	int		(0：货主，默认；1：车主；）
				String pce=rs.getString("pce");//		int		(0:PC;1:android;2:ios)
				String go_sign=rs.getString("go_sign");//		int		会员标识（0：未通过审核；1：通过审核）
				String realsign=rs.getString("realsign");//	int		是否实名认证(0:否；1：是；2：现场认证等）
				
				String loginsign=rs.getString("loginsign");//	nvarchar(50)	登录标识（0:PC;1:android;2:ios,可多选，以“,”分隔）
				String pcMac1=rs.getString("pcMac1");//		nvarchar(50)	PC机器码1
				String pcMac2=rs.getString("pcMac2");//		nvarchar(50)	PC机器码2
				String andMac1=rs.getString("andMac1");//		nvarchar(50)	android机器码1
				String andMac2=rs.getString("andMac2");//		nvarchar(50)	android机器码2
				String iosMac1=rs.getString("iosMac1");//		nvarchar(50)	ios机器码1
				String iosMac2=rs.getString("iosMac2");//		nvarchar(50)	ios机器码2
				
				String province=rs.getString("province");//	nvarchar(50)	注册省
				String city=rs.getString("city");//		nvarchar(50)	注册市
				String town=rs.getString("town");//		nvarchar(50)	注册县
				String address=rs.getString("address");//		nvarchar(50)	注册地址
				String line=rs.getString("line");//		nvarchar(200)	专线
				String mobile=rs.getString("mobile");//		nvarchar(50)	手机号
				String mobile2=rs.getString("mobile2");//	nvarchar(50)	手机号2
				String mobile3=rs.getString("mobile3");//	nvarchar(50)	手机号3
				String intel1=rs.getString("intel1");//		nvarchar(50)	内号1
				String intel2=rs.getString("intel2");//		nvarchar(50)	内号2
				String tel=rs.getString("tel");//		nvarchar(50)	电话
				String company=rs.getString("company");//		nvarchar(50)	公司名称
				String realname=rs.getString("realname");//	nvarchar(50)	真实姓名
				String postcard=rs.getString("postcard");//	nvarchar(50)	身份证号	
				String nicename=rs.getString("nicename");//	nvarchar(50)	妮称
				String headimage=rs.getString("headimage");//	nvarchar(500)	头像
				String companyimage=rs.getString("companyimage");//	nvarchar(500)	公司名片
				String companyintro=rs.getString("companyintro");//	nvarchar(500)	公司简介
				String companypic=rs.getString("companypic");//	nvarchar(500)	公司营业执照照片
				String postcardimage1=rs.getString("postcardimage1");//	nvarchar(500)	身份证号图片1
				String postcardimage2=rs.getString("postcardimage2");//	nvarchar(500)	身份证号图片1
				
				String addCounts=rs.getString("addCounts");//	int		发布信息次数
				String addCounts0=rs.getString("addCounts0");//	int		整车信息次数
				String addCounts1=rs.getString("addCounts1");//	int		零担信息次数
				String addCounts2=rs.getString("addCounts2");//	int		快递信息次数
				
				String local_province=rs.getString("local_province");//	nvarchar(50)	定位省
				String local_city=rs.getString("local_city");//	nvarchar(50)	定位市
				String local_town=rs.getString("local_town");//	nvarchar(50)	定位县
				String local_addr=rs.getString("local_addr");//	nvarchar(50)	定位地址
				String local_latitude=rs.getString("local_latitude");//	nvarchar(50)	定位数据-纬度
				String local_lontitude=rs.getString("local_lontitude");//	nvarchar(50)	定位数据-经度
				String local_ip=rs.getString("local_ip");//	nvarchar(50)	定位IP
				String local_times=String.format("%s",rs.getDate("local_times"));//	datetime	定位时间，默认getdate()
				
				String adddate=String.format("%s",rs.getDate("adddate"));//		datetime	注册日期
				String enddate=String.format("%s",rs.getDate("enddate"));//		datetime	到期日期
				String addtime=String.format("%s",rs.getDate("addtime"));//		datetime	日期时间，默认getdate()
				//
				/*String handwrite=rs.getString("handwrite");
				String addfunc=rs.getString("addfunc");
				String AddFuncDate=String.format("%s",rs.getDate("AddFuncDate"));
				String HasAddTime=rs.getString("HasAddTime");
				String AddTimes=rs.getString("AddTimes");
				String HasInfoNum=rs.getString("HasInfoNum");
				String InfoNum=rs.getString("InfoNum");
				String InfoNum2=rs.getString("InfoNum2");
				String AddInfoDate=String.format("%s",rs.getDate("AddInfoDate"));
				String HasCharNum=rs.getString("HasCharNum");
				String CharNum=rs.getString("CharNum");
				String changeinfo=rs.getString("changeinfo");
				String changepwd=rs.getString("changepwd");*/
				//
				rs.close();
				//==========================================================================================
				if(userID==null || userID.equals("")) userID="null";
				if(memtype==null || memtype.equals("")) memtype="null";
				if(pce==null || pce.equals("")) pce="null";
				if(go_sign==null || go_sign.equals("")) go_sign="null";
				if(realsign==null || realsign.equals("")) realsign="null";
				if(loginsign==null || loginsign.equals("")) loginsign="null";
				if(province==null || province.equals("")) province="null";
				if(city==null || city.equals("")) city="null";
				if(town==null || town.equals("")) town="null";
				if(address==null || address.equals("")) address="null";
				if(line==null || line.equals("")) line="null";
				if(mobile==null || mobile.equals("")) mobile="null";
				if(mobile2==null || mobile2.equals("")) mobile2="null";
				if(mobile3==null || mobile3.equals("")) mobile3="null";
				if(intel1==null || intel1.equals("")) intel1="null";
				if(intel2==null || intel2.equals("")) intel2="null";
				if(tel==null || tel.equals("")) tel="null";
				if(company==null || company.equals("")) company="null";
				if(realname==null || realname.equals("")) realname="null";
				if(postcard==null || postcard.equals("")) postcard="null";
				if(nicename==null || nicename.equals("")) nicename="null";
				if(headimage==null || headimage.equals("")) headimage="null";
				if(companyimage==null || companyimage.equals("")) companyimage="null";
				if(companyintro==null || companyintro.equals("")) companyintro="null";
				if(companypic==null || companypic.equals("")) companypic="null";
				if(postcardimage1==null || postcardimage1.equals("")) postcardimage1="null";
				if(postcardimage2==null || postcardimage2.equals("")) postcardimage2="null";
				if(addCounts==null || addCounts.equals("")) addCounts="null";
				if(addCounts0==null || addCounts0.equals("")) addCounts0="null";
				if(addCounts1==null || addCounts1.equals("")) addCounts1="null";
				if(addCounts2==null || addCounts2.equals("")) addCounts2="null";
				if(local_province==null || local_province.equals("")) local_province="null";
				if(local_city==null || local_city.equals("")) local_city="null";
				if(local_town==null || local_town.equals("")) local_town="null";
				if(local_addr==null || local_addr.equals("")) local_addr="null";
				if(local_latitude==null || local_latitude.equals("")) local_latitude="null";
				if(local_lontitude==null || local_lontitude.equals("")) local_lontitude="null";
				if(local_ip==null || local_ip.equals("")) local_ip="null";
				if(local_times==null || local_times.equals("")) local_times="null";
				if(adddate==null || adddate.equals("")) adddate="null";
				if(enddate==null || enddate.equals("")) enddate="null";
				if(addtime==null || addtime.equals("")) addtime="null";
				//==========================================================================================
				//-----------------------判断是否在允许登录设备范围内----------------
				if(loginsign.indexOf(loginMac)==-1)
				{
					out.print(MyFun.MyEnCode(MyFun.printError("error",new String("设备未授权，禁止登录系统！ ".getBytes()))));
					return;
				}
				//-----------------------判断绑定的登录设备------------------------
				String sysMac1="0";
				String sysMac2="0";
				if(loginMac.equals("0"))
				{
					sysMac1=pcMac1;
					sysMac2=pcMac2;
				}else if(loginMac.equals("1"))
				{
					sysMac1=andMac1;
					sysMac2=andMac2;
				}else if(loginMac.equals("2"))
				{
					sysMac1=iosMac1;
					sysMac2=iosMac2;
				}
				//mac1
				if( sysMac1.equals("0") || sysMac1.equals("")){
					//reset sysMac1
					sql="exec updateUserMac1 "+loginMac+",'"+mac1+"',"+userID;
					stmt.executeUpdate(sql);
				}else{
					if(!sysMac1.trim().toLowerCase().equals(mac1.trim().toLowerCase())){
						//
						if(mac2.equals("0")){
							//out.print("NotTheMachine");//
							out.print(MyFun.MyEnCode(MyFun.printError("error",new String("登录设备与系统绑定不一致!".getBytes()))));
							return;
						}
					}
				}
				//mac2
				if(!mac2.equals("0")){
					if( sysMac2.equals("0") || sysMac2.equals("")){
						//reset sysMac2
						sql="exec updateUserMac2 "+loginMac+",'"+mac2+"',"+userID;
						stmt.executeUpdate(sql);
					}else{
						if(!sysMac2.trim().toLowerCase().equals(mac2.trim().toLowerCase())){
							//out.print("NotTheMachine");//
							out.print(MyFun.MyEnCode(MyFun.printError("error",new String("登录设备与系统绑定不一致!".getBytes()))));
							return;
						}
					}
				}
				//
				sql="exec updateUserMac "+loginMac+",'"+mac1+"','"+mac2+"',"+userID;
				stmt.executeUpdate(sql);
				//
				sql="exec updateUserMac2 "+loginMac+",'"+mac2+"',"+userID;
				stmt.executeUpdate(sql);
				//-----------------------判断是否被禁止或审核------------------------
				/*if(go_sign.equals("0")){
					//out.print("NotGoInSign");
					out.print(MyFun.MyEnCode(MyFun.printError("error",new String("您的用户名未通过审核，禁止登录系统！ ".getBytes()))));
					return;
				}
				if(go_sign.equals("2")){
					//out.print("NotGoInSign");
					out.print(MyFun.MyEnCode(MyFun.printError("error",new String("您的用户名已经到期，禁止登录系统！ ".getBytes()))));
					return;
				}*/
				if(go_sign.equals("3")){
					//out.print("NotGoInSign");
					out.print(MyFun.MyEnCode(MyFun.printError("error",new String("您的用户名已暂停服务，禁止登录系统！ ".getBytes()))));
					return;
				}
				//-----------------------根据到期日期进行判断------------------------
				long lasttime=0;
				String localdate="";
				if(go_sign.equals("1")){
					localdate=MyFun.GetCurDate();//
					lasttime=MyFun.dateDiff("day", MyFun.stringToDate(enddate),MyFun.stringToDate(localdate));
					if(lasttime<0){
						//----------更改会员标识为到期---------------------
						sql="exec updateUserSign 2,"+userID;
						stmt.executeUpdate(sql);
						//-------------------------------------------------
						//out.print("HaveNoTime");//
						//out.print(MyFun.MyEnCode(MyFun.printError("error",new String("您的用户名已经到期，禁止登录系统！ ".getBytes()))));
						//return;
					}
				}
				//-----------------------登录成功，修改相关参数----------------------
				String last_loginIP=MyFun.getIpAddr(request);
				sql="exec updateUserLoginInfo '"+last_loginIP+"','"+devices+"',"+userID;
				stmt.executeUpdate(sql);
				//-------------------------------------------------------------------
				//输出会员资料
				//生成一个json对象 
		        JSONObject json = new JSONObject(); 
		        json.put("state", "ok"); 
		        json.put("answer", "登录成功"); 
				//
				//json对象中的会员资料，所以将其定义成一个json对象 
		        JSONObject memInfo = new JSONObject();
		        memInfo.put("userID", userID); 
				memInfo.put("username", username); 
				memInfo.put("password", password); 
				memInfo.put("memtype", memtype); 
				memInfo.put("pce", pce); 
				memInfo.put("go_sign", go_sign); 
				memInfo.put("realsign", realsign); 
				memInfo.put("loginsign", loginsign); 
				memInfo.put("province", province); 
				memInfo.put("city", city); 
				memInfo.put("town", town); 
				memInfo.put("address", address); 
				memInfo.put("line", line); 
				memInfo.put("mobile", mobile); 
				memInfo.put("mobile2", mobile2); 
				memInfo.put("mobile3", mobile3); 
				memInfo.put("intel1", intel1);
				memInfo.put("intel2", intel2); 
				memInfo.put("tel", tel); 
				memInfo.put("company", company); 
				memInfo.put("realname", realname); 
				memInfo.put("postcard", postcard); 
				memInfo.put("nicename", nicename); 
				memInfo.put("headimage", headimage); 
				memInfo.put("companyimage", companyimage); 
				memInfo.put("companyintro", companyintro); 
				memInfo.put("companypic", companypic); 
				memInfo.put("postcardimage1", postcardimage1); 
				memInfo.put("postcardimage2", postcardimage2); 
				memInfo.put("addCounts", addCounts); 
				memInfo.put("addCounts0", addCounts0); 
				memInfo.put("addCounts1", addCounts1); 
				memInfo.put("addCounts2", addCounts2); 
				memInfo.put("local_province", local_province); 
				memInfo.put("local_city", local_city); 
				memInfo.put("local_town", local_town); 
				memInfo.put("local_addr", local_addr); 
				memInfo.put("local_latitude", local_latitude); 
				memInfo.put("local_lontitude", local_lontitude); 
				memInfo.put("local_ip", local_ip); 
				memInfo.put("local_times", local_times); 
				memInfo.put("adddate", adddate); 
				memInfo.put("enddate", enddate); 
				memInfo.put("addtime", addtime); 

				//会员基本资料
		        json.put("memInfo", memInfo); 
				//输出
				out.print(MyFun.MyEnCode(json.toString()));
				//out.print(json.toString());
				
			}
			
	}else{
		out.print(MyFun.MyEnCode(MyFun.printError("error",new String("系统错误，请与我们联系！ ".getBytes()))));
	}
	//
	//stmt.close();
	//
	//conn.close();
%>