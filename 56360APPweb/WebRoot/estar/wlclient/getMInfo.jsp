<%@page contentType="text/html; charset=gb2312" language="java" import="java.sql.*"  errorPage=""%>
<jsp:useBean id="MyFun" scope="page" class="myFun.EFuns" />
<jsp:useBean id="DataKeyWord" scope="page" class="myFun.EDataKeyWordJson" />
<%
response.setHeader("Access-Control-Allow-Origin", "*");
response.setHeader("Access-Control-Allow-Credentials", "true");
response.setHeader("Access-Control-Allow-Methods", "*");
response.setHeader("Access-Control-Allow-Headers", "Content-Type,Access-Token");
response.setHeader("Access-Control-Expose-Headers", "*");	
out.print(MyFun.MyEnCode(MyFun.printError("ok",new String("�ɹ�".getBytes()))));
	/* request.setCharacterEncoding("UTF-8");//���POST�����������룬�ύҳ��ΪUTF-8����
	//�ж��Ƿ�ΪPOST�ύ 
	if(!request.getMethod().toUpperCase().equals("POST"))
	{
		out.print(MyFun.MyEnCode(MyFun.printError("Error",new String("�ύʧ�� ".getBytes()))));
		return;
	}
	String action=request.getParameter("action");
	if(action.isEmpty())
	{
		out.print(MyFun.MyEnCode(MyFun.printError("Error",new String("ϵͳ����(���ϴ���001)������������ϵ�� ".getBytes()))));
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
	//��Ϣ����(0:������1���㵥��2����ݣ�
	String inType=MyFun.GetRequest(request.getParameter("intype"));//'��Ϣ����
	if(inType.isEmpty())
	{
		inType="";
	}
	//
	String carType=MyFun.GetRequest(request.getParameter("cartype"));//'��������
	if(carType.isEmpty())
	{
		carType="";
	}
	String carLength=MyFun.GetRequest(request.getParameter("carlength"));//'�������ȣ��ɶ�ѡ��
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
	if(action.equals("getdatas"))//''ȡ�ó�ʼ��Ϣ,ȡ�õ�ǰ�鿴��Ϣ
	{
		int StartNum=(MyFun.StringToInt(pag)-1)*20;
		out.print(DataKeyWord.SearchKeyWord(QG,startPCT,stopPCT,inType,carType,carLength,StartNum,1,0));
	}else if(action.equals("getnewdatas"))//'ˢ�¶�ȡ��Ϣ
	{
		String MaxID=MyFun.GetRequest(request.getParameter("MaxID"));
		out.print(DataKeyWord.SearchKeyWord(QG,startPCT,stopPCT,inType,carType,carLength,0,1,1));
	}else
	{
		out.print(MyFun.MyEnCode(MyFun.printError("Error",new String("ϵͳ����(���ϴ���002)������������ϵ�� ".getBytes()))));
		out.close();
	} */
%>
