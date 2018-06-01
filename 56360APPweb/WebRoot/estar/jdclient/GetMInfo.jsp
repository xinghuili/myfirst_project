<%@page contentType="text/html; charset=UTF-8" language="java"
	import="java.sql.*" errorPage=""%>
<jsp:useBean id="MyFun" scope="page" class="myFun.Funs" />
<jsp:useBean id="DataKeyWord" scope="page" class="myFun.DataKeyWord" />
<%
	String action = request.getParameter("action");
	if (action.isEmpty()) {
		//out.print(MyFun.MyEnCode(MyFun.printError("Error",new String("系统错误(错认代码001)，请与我们联系！ ".getBytes()))));
		out.print(MyFun.printError("Error", new String(
				"系统错误(错认代码001)，请与我们联系！ ".getBytes())));
		out.close();
	} else {
		action = MyFun.GetRequest(action);
	}
	String StartCity = request.getParameter("StartCity");
	if (StartCity.isEmpty()) {
		//out.print(MyFun.MyEnCode(MyFun.printError("Error",new String("出发地传值错误 ".getBytes()))));
		out.print(MyFun.printError("Error",
				new String("出发地传值错误 ".getBytes())));
		out.close();
	} else {
		StartCity = MyFun.GetRequest(StartCity);
	}
	//
	String StopCity = request.getParameter("StopCity");
	if (StopCity.isEmpty()) {
		StopCity = "";
	} else {
		StopCity = MyFun.GetRequest(StopCity);
	}
	//
	String inType = MyFun.GetRequest(request.getParameter("inType"));//'信息类型 默认0（0:驾盾；1：运力网）
	if (inType.isEmpty()) {
		inType = "0";
	} else {
		inType = MyFun.GetRequest(inType);
	}
	//out.println(action);
	if (action.equals("getdatas"))//''取得初始信息,取得当前查看信息
	{
		String pag = MyFun.GetRequest(request.getParameter("pag"));
		if (pag.equals("") || pag.equals("0")) {
			pag = "1";
		}
		int StartNum = (MyFun.StringToInt(pag) - 1) * 20;
		//String TotalNum=MyFun.GetRequest(request.getParameter("TotalNum"));
		out.print("22222222222222");
		out.print(DataKeyWord.SearchKeyWord(StartCity, StopCity,
				inType, StartNum, 1, 0));
		out.print("111111111111111111111111");
	} else if (action.equals("getnewdatas"))//'刷新读取信息
	{
		String MaxID = MyFun.GetRequest(request.getParameter("MaxID"));
		out.print(DataKeyWord.SearchKeyWord(StartCity, StopCity,
				inType, 0, 1, 1));
	} else {
		//out.print(MyFun.MyEnCode(MyFun.printError("Error",new String("系统错误(错认代码002)，请与我们联系！ ".getBytes()))));
		out.print(MyFun.printError("Error", new String(
				"系统错误(错认代码002)，请与我们联系！ ".getBytes())));
		out.close();
	}
%>