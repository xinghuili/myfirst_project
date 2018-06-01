package com.mywork.task.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PhoneUtil {
/***
 * 
 * 从一堆数字中提取手机号和座机号，并格式化
 * 
 * **/

	public String  getMobile(String mobile) {

		String str=mobile.trim();

		String b1="";
		String b2="";
		String b3="";
		String strNew="";
		String strNew2 = "";
		
		//正则匹配手机号
		Pattern pattern = Pattern.compile("(13|14|15|17|18)\\d{9}");  
	    Matcher matcher = pattern.matcher(str);  
	  
	    while (matcher.find()) {  
	    	b1= matcher.group(); //返回当前匹配的字符串
	        b3=b1+","+b3;
	        if(str.indexOf(b1)>=0){
	        	str = str.replace(b1, " ");	//将已经匹配的换成空串
	        }
	        
	    }  
	    b2= str.trim();
	    strNew = b2+","+b3;		

	    //把新组成的字符串去掉多余符号
	    if(strNew.indexOf("-")>=0){
			strNew=strNew.replaceAll("-", ",");
		}
		if(strNew.indexOf(" ")>=0){
			strNew=strNew.replaceAll("[' ']+", ",");//多个空格换成一个‘，’
		}

		if(strNew.indexOf(",")>0){
			strNew=strNew.replaceAll("[',']+", ",");//多个','换成一个','
		}
		
		
//		System.out.println("################################################");
//		strNew=",17862581332,联通:29808,电信:6098";
//		String ss[]=strNew.split(",");
//		
//		for(int i=0;i<ss.length;i++){
////			System.out.println("rrrrrr==="+ss[i]);
//			if(ss[i].indexOf("-")==0){
//				
//			}else if(ss[i].indexOf("-")>0 ){
////				System.out.println("fffff==="+ss[i]);
//				if( ss[i].indexOf("0")==0){
////					System.out.println("座机==="+ss[i]);
//					strNew2 = ss[i]+","+strNew2;
//				}else{
////					System.out.println("小号..."+ss[i]);
//					String ws=ss[i].replace("-", ",");
//					strNew2 = ws+","+strNew2;
//				}
//
//			}else{
//				strNew2 = ss[i]+","+strNew2;
//			}
//		}
//		System.out.println("dddddd==="+strNew2);
		return strNew;
	}
	
	//判断是否 包含数字
	 public boolean isDigit(String strNum) {  
		 boolean flag = false;
		 Pattern p = Pattern.compile(".*\\d+.*");
		 Matcher m = p.matcher(strNum);
		 if (m.matches())
			flag = true;
		    return flag;
		}
	
	
	public static void main(String[] args) {
//		String mobile = "763 18343814949 15943891906 15243066866";//" 306   151449181180482-2888358 15943891906 ";//" 763 18343814949 15943891906 15243066866";
//		String mobile = " 306   151449181180482-2888358 15943891906 ";//" 763 18343814949 15943891906 15243066866";
		String mobile = "0537-2496016-5555585-13953795015 -18266797115 2222287 6888-6999";
//		String mobile = " 0633-55623421396331021713516332155 ";
//		String mobile = "  135009380000439-6969881 0439-6969587";
//		String mobile = " 139476233470476-353052618647638008  ";
//		String mobile= "155406977730476-88811971594746761315947467614";
//		String mobile = "031189899877 80889557 ";
		PhoneUtil pu = new PhoneUtil();
		String nm = pu.getMobile(mobile);
		System.out.println("nm======="+nm);
	}
}
