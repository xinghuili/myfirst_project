<%@page contentType="text/html; charset=gb2312" language="java" import="java.sql.*"  errorPage=""%>
<jsp:useBean id="MyFun" scope="page" class="myFun.EFuns" />
<jsp:useBean id="DataKeyWord" scope="page" class="myFun.EDataKeyWordJson" />
<%
response.setHeader("Access-Control-Allow-Origin", "*");
response.setHeader("Access-Control-Allow-Credentials", "true");
response.setHeader("Access-Control-Allow-Methods", "*");
response.setHeader("Access-Control-Allow-Headers", "Content-Type,Access-Token");
response.setHeader("Access-Control-Expose-Headers", "*");	
out.print(MyFun.MyEnCode(MyFun.printError("ok",new String("成功".getBytes()))));
	/* request.setCharacterEncoding("UTF-8");//解决POST数据中文乱码，提交页面为UTF-8编码
	//判断是否为POST提交 
	if(!request.getMethod().toUpperCase().equals("POST"))
	{
		out.print(MyFun.MyEnCode(MyFun.printError("Error",new String("提交失败 ".getBytes()))));
		return;
	}
	String action=request.getParameter("action");
	if(action.isEmpty())
	{
		out.print(MyFun.MyEnCode(MyFun.printError("Error",new String("系统错误(错认代码001)，请与我们联系！ ".getBytes()))));
		return;
	}else
	{
		action=MyFun.GetRequest(action);
	}
	//out.print(action);
	String QG=MyFun.GetRequest(request.getParameter("QG"));//
	if(QG.isEmpty())
	{
		QG="0";
	}
	String startPCT=request.getParameter("start");
	if(startPCT.isEmpty())
	{
		startPCT="";
	}else
	{
		startPCT=MyFun.GetRequest(startPCT);
	}
	String stopPCT=request.getParameter("stop");
	if(stopPCT.isEmpty())
	{
		stopPCT="";
	}else
	{
		stopPCT=MyFun.GetRequest(stopPCT);
	}
	//信息类型(0:整车；1：零单；2：快递）
	String inType=MyFun.GetRequest(request.getParameter("intype"));//'信息类型
	if(inType.isEmpty())
	{
		inType="";
	}
	//
	String carType=MyFun.GetRequest(request.getParameter("cartype"));//'车辆类型
	if(carType.isEmpty())
	{
		carType="";
	}
	String carLength=MyFun.GetRequest(request.getParameter("carlength"));//'车辆长度（可多选）
	if(carLength.isEmpty())
	{
		carLength="";
	}
	//
	String pag=MyFun.GetRequest(request.getParameter("pag"));
	if(pag.equals("") || pag.equals("0") )
	{
		pag="1";
	}
	//out.println(inType);
	if(action.equals("getdatas"))//''取得初始信息,取得当前查看信息
	{
		int StartNum=(MyFun.StringToInt(pag)-1)*20;
		out.print(DataKeyWord.SearchKeyWord(QG,startPCT,stopPCT,inType,carType,carLength,StartNum,1,0));
	}else if(action.equals("getnewdatas"))//'刷新读取信息
	{
		String MaxID=MyFun.GetRequest(request.getParameter("MaxID"));
		out.print(DataKeyWord.SearchKeyWord(QG,startPCT,stopPCT,inType,carType,carLength,0,1,1));
	}else
	{
		out.print(MyFun.MyEnCode(MyFun.printError("Error",new String("系统错误(错认代码002)，请与我们联系！ ".getBytes()))));
		out.close();
	} */
%>
