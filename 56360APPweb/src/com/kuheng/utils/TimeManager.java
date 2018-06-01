 package com.kuheng.utils;



import java.util.*;

import java.text.*;
/**
 ****************************************************
 *类名称：	Time<br>
 *类功能：	时间操作<br>

 ****************************************************
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class TimeManager {
	private Date time,timem;
	private String strtime;
	private SimpleDateFormat format;
	private SimpleDateFormat format1;
	private static  TimeManager timemgr;
	
	/**
	 * 初始化
	 */
	public TimeManager() {
		
		strtime="";
		format=null;
	}
	
	public static TimeManager getInstance() {
		if(timemgr == null) {
			timemgr = new TimeManager();
		}
		return timemgr;
	}
	
	
	
	/***************************************************
	*函数名称：	getYear()<br>
	*函数功能：	取得年份<br>	
	*返回值：	int<br>
	*参数说明：	无<br>

	*最后修改：	无
	****************************************************/
	public int getYear(){
		time=new Date();
		format=new SimpleDateFormat("yyyy",Locale.getDefault());
		strtime=format.format(time);
		return Integer.parseInt(strtime);
	}
	/***************************************************
	*函数名称：	getMonth()<br>
	*函数功能：	取得月份<br>
	*返回值：	int<br>
	*参数说明：	无<br>
	*最后修改：	无
	****************************************************/
	public int getMonth(){
		time=new Date();
		format=new SimpleDateFormat("MM",Locale.getDefault());
		strtime=format.format(time);
		return Integer.parseInt(strtime);
	}
	/***************************************************
	*函数名称：	getSunr()<br>
	*函数功能：	取得日份<br>	
	*返回值：	int<br>
	*参数说明：	无<br>
	*最后修改：	无		  
	****************************************************/
	public int getSun(){
		time=new Date();
		format=new SimpleDateFormat("dd",Locale.getDefault());
		strtime=format.format(time);
		return Integer.parseInt(strtime);
	}
	/***************************************************
	*函数名称：	getWeek()<br>
	*函数功能：	取得星期<br>	
	*返回值：	int<br>
	*参数说明：	无<br>
	*最后修改：	无		  
	*****************************************************/
	public int getWeek(){
		return time.getDay();
	}
	
	/***************************************************
	*函数名称：	getHour()<br>
	*函数功能：	取得小时<br>	
	*返回值：	int<br>
	*参数说明：	无<br>
	*最后修改：	无		  
	****************************************************/
	public int getHour(){
		time=new Date();
		format=new SimpleDateFormat("HH",Locale.getDefault());
		strtime=format.format(time);
		return Integer.parseInt(strtime);
	}
	/***************************************************
	*函数名称：	getMinu()<br>
	*函数功能：	取得分钟<br>	
	*返回值：	int<br>
	*参数说明：	无<br>
	*最后修改：	无		  
	****************************************************/
	public int getMinu(){
		time=new Date();
		format=new SimpleDateFormat("mm",Locale.getDefault());
		strtime=format.format(time);
		return Integer.parseInt(strtime);
	}
	/***************************************************
	*函数名称：	getSecond()<br>
	*函数功能：	取得秒数<br>
	*返回值：	String<br>
	*参数说明：	无<br>
	*最后修改：	无		  
	****************************************************/
	public int getSecond(){
		time=new Date();
		format=new SimpleDateFormat("ss",Locale.getDefault());
		strtime=format.format(time);
		return Integer.parseInt(strtime);
	}
	/***************************************************
	*函数名称：	getYMD()<br>
	*函数功能：	取得年-月-日<br>	
	*返回值：	String<br>
	*参数说明：	无<br>
	*最后修改：	无		  
	****************************************************/
	public String getYMD(){
		time=new Date();
		format=new SimpleDateFormat("yyyy-MM-dd",Locale.getDefault());
		strtime=format.format(time);
		return strtime;
	}
	
	public String getYM(){
		time=new Date();
		format=new SimpleDateFormat("yyyyMM",Locale.getDefault());
		strtime=format.format(time);
		return strtime;
	}
	
	
	/***************************************************
	*函数名称：	getHMS()<br>
	*函数功能：	取得时:分:秒<br>	
	*返回值：	String<br>
	*参数说明：	无<br>
	*最后修改：	无		  
	****************************************************/
	public String getHMS(){
		time=new Date();
		format=new SimpleDateFormat("HH:mm:ss",Locale.getDefault());
		strtime=format.format(time);
		return strtime;
	}
	/***************************************************
	*函数名称：	getYMDHMS()<br>
	*函数功能：	取得年-月-日 时:分:秒<br>	
	*返回值：	String<br>
	*参数说明：	无<br>
	*最后修改：	无		  
	****************************************************/
	public String getYMDHMS(){
		time=new Date();
		format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss",Locale.getDefault());
		strtime=format.format(time);
		return strtime;
	}
	
	
	
	public String getYMDHMSS(){
		time=new Date();
		format=new SimpleDateFormat("yyMMddHHmmssssss",Locale.getDefault());
		strtime=format.format(time);
		return strtime;
	}
	
	
	
	
	
	
	
	
	public String getYMDH(){
		time=new Date();
		format=new SimpleDateFormat("yyyy-MM-dd-HH",Locale.getDefault());
		strtime=format.format(time);
		return strtime;
	}
		
	/***************************************************
	*函数名称：	getMinH<br>
	*函数功能：	获小时间差,输入的时间减现在的时间<br>
	*返回值：	int<br>
	*参数说明：	无<br>
	*最后修改：	无		  
	****************************************************/
	public int getMinH(String in){
		format = new SimpleDateFormat ("HH:mm:ss", Locale.getDefault());
		format1=new SimpleDateFormat("HH",Locale.getDefault());
		try {
			timem=format.parse(in);
			strtime=format1.format(timem);
			System.err.print(strtime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	return Integer.parseInt(strtime)-this.getHour();
	}
	/***************************************************
	*函数名称：	getMinM<br>
	*函数功能：	获分钟差,输入的时间减现在的时间<br>
	*返回值：	int<br>
	*参数说明：	无<br>
	*最后修改：	无		  
	****************************************************/
	public int getMinM(String in){
		format = new SimpleDateFormat ("HH:mm:ss", Locale.getDefault());
		format1=new SimpleDateFormat("mm",Locale.getDefault());
		try {
			timem=format.parse(in);
			strtime=format1.format(timem);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	return Integer.parseInt(strtime)-this.getMinu();
	}
	
	
	public long getYMDHMSp(String in){
		   SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		   java.util.Date now=null;;
		try {
			now = df.parse(this.getYMDHMS());
		} catch (ParseException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		   java.util.Date date = null;
		try {
			date = df.parse(in);
		} catch (ParseException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		   long l=now.getTime()-date.getTime();
		   long day=l/(24*60*60*1000);
		   long hour=(l/(60*60*1000)-day*24);
		   long min=((l/(60*1000))-day*24*60-hour*60);
		//   long s=(l/1000-day*24*60*60-hour*60*60-min*60);
		 //  System.out.println(""+day+"天"+hour+"小时"+min+"分"+s+"秒");
		   
		   return min;	   
		   
	}
	
	/***************************************************
	*函数名称：	getNextDate<br>	  
	**函数功能：	获取明天的日期<br>
	****************************************************/
	public String getNextDate(){
		  SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");  
		  Date date = new Date();
		  String nowDate = sf.format(date);  

		Calendar cal = Calendar.getInstance();  
	    try {
			cal.setTime(sf.parse(nowDate));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	    cal.add(Calendar.DAY_OF_YEAR, +1);  
	    String nextDate_1 = sf.format(cal.getTime());  
	   // long time = (date.getTime() / 1000) + 60 * 60 * 24;//秒  
	    return nextDate_1;

	}

	
	/***************************************************
	*函数名称：	getMinS<br>
	*函数功能：	获秒差,输入的时间减现在的时间<br>
	*返回值：	int<br>
	*参数说明：	无<br>
	*最后修改：	无		  
	****************************************************/
	public int getMinS(String in){
		format = new SimpleDateFormat ("HH:mm:ss", Locale.getDefault());
		format1=new SimpleDateFormat("ss",Locale.getDefault());
		try {
			timem=format.parse(in);
			strtime=format1.format(timem);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	return Integer.parseInt(strtime)-this.getSecond();
	}
	
	
	
	
	
	
	
	
	
  public  String  calDate( int   days)   {   
	      GregorianCalendar   gCal   =   new   GregorianCalendar();
	      SimpleDateFormat   sFormat   =   new   SimpleDateFormat("yyyy-MM-dd");   
	      gCal.add(Calendar.DATE,   days);  
	      String   sDate   =   sFormat.format(gCal.getTime()); 
         
          return  sDate;
  } 
  
  /**
   * 的到多少天的时间long
   * @param days
   * @return
   */
  
  public  long  calDatelong( int   days)   {   
      GregorianCalendar   gCal   =   new   GregorianCalendar();
      SimpleDateFormat   sFormat   =   new   SimpleDateFormat("yyyy-MM-dd");   
      gCal.add(Calendar.DATE,   days);  
      //String   sDate   =   sFormat.format(gCal.getTime()); 
     
      return  gCal.getTimeInMillis()/1000;
} 

  
  
	
  
  public  String  calDatemin( int   days)   {   
      GregorianCalendar   gCal   =   new   GregorianCalendar();
      SimpleDateFormat   sFormat   =   new   SimpleDateFormat("yyyy-MM-dd HH:mm:ss");   
      gCal.add(Calendar.DATE,   days);  
      String   sDate   =   sFormat.format(gCal.getTime()); 
     
      return  sDate;
}   

  public static long getQuot(String time1, String time2){ 
	  long quot = 0; 
	  SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd"); 
	  try { 
	  Date date1 = ft.parse( time1 ); 
	  Date date2 = ft.parse( time2 ); 
	  quot = date1.getTime() - date2.getTime(); 
	  quot = quot / 1000 / 60 / 60 / 24; 
	  } catch (ParseException e) { 
	  e.printStackTrace(); 
	  } 
	  return quot; 
	  } 
  

  
public static long getNowhour(String time1, String time2) throws ParseException{ 

	  SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   java.util.Date now = df.parse(time1);
	   java.util.Date date=df.parse(time2);
	   long l=now.getTime()-date.getTime();
	   long day=l/(24*60*60*1000);
	   long hour=(l/(60*60*1000)-day*24);
	  // long min=((l/(60*1000))-day*24*60-hour*60);
	   //long s=(l/1000-day*24*60*60-hour*60*60-min*60);  
        return hour;

  }  
  
  
  
  
  
  
  
  
  public  String  calDate1( int   days)   {   
	  
      GregorianCalendar   gCal   =   new   GregorianCalendar(2003,   5,   27);   
      SimpleDateFormat   sFormat   =   new   SimpleDateFormat("yyyy-MM-dd");   
      gCal.add(Calendar.DATE,   5);           
      String   sDate   =   sFormat.format(gCal.getTime());  
      return sDate;
} 
 
  
  
   /**
   * 具体的时间转化为long
   * @param time
   * @param type
   * @return
   */
	public Long getTimeLong(String time,String type){
		Long t=new Long(0);
		try {
			SimpleDateFormat sdf= new SimpleDateFormat(type);  
			Date dt2 = sdf.parse(time);  
			t=dt2.getTime()/1000;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return t;
	}
  
	
	
	public static  Date getTimeDate(String time,String type){
		Date dd=null;
		try {
			SimpleDateFormat sdf= new SimpleDateFormat(type);  
			dd = sdf.parse(time);  
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return dd;
	}
  
	 
	   /**
	   * 具体的时间转化为String
	   * @param time
	   * @param type
	   * @return
	   */
		public String getTimeString(long addtime){
			 String str=String.valueOf(addtime)+"000";
			 Date dd = new Date(Long.parseLong(str));

			 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");   
			 String strtime=sdf.format(dd); 
			return strtime;
		}
	  
	
	
		public String getTimeString2(long addtime){
			 String str=String.valueOf(addtime)+"000";
			 Date dd = new Date(Long.parseLong(str));

			 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");   
			 String strtime=sdf.format(dd); 
			return strtime;
		}
	
	
	
	
	/**
	 * 获取今天开始的时间
	 * @return
	 */
	
	public Long getStartTime(){
		Calendar todayStart = Calendar.getInstance();
		todayStart.set(Calendar.HOUR, 0);
		todayStart.set(Calendar.MINUTE, 0);
		todayStart.set(Calendar.SECOND, 0);
		todayStart.set(Calendar.MILLISECOND, 0);
		return todayStart.getTime().getTime();
	}
	
	/**
	 * 获取今天结束的时间
	 * @return
	 */
	
	public Long getEndTime(){
		Calendar todayEnd = Calendar.getInstance();
		todayEnd.set(Calendar.HOUR, 23);
		todayEnd.set(Calendar.MINUTE, 59);
		todayEnd.set(Calendar.SECOND, 59);
		todayEnd.set(Calendar.MILLISECOND, 999);
		return todayEnd.getTime().getTime();
	}	

	
	
	
	/**
	 * 格式化日期
	 * @param date 日期对象
	 * @return String 日期字符串
	 */
	public static String formatDate(Date date){
		String DEFAULT_FORMAT = "yyyy-MM-dd";
		SimpleDateFormat f = new SimpleDateFormat(DEFAULT_FORMAT);
		String sDate = f.format(date);
		return sDate;
	}
	
	/**
	 * 获取某年第一天日期
	 * @param year 年份
	 * @return Date
	 */
	public static Date getCurrYearFirst(int year){
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(Calendar.YEAR, year);
		Date currYearFirst = calendar.getTime();
		return currYearFirst;
	}
	
	/**
	 * 获取某年最后一天日期
	 * @param year 年份
	 * @return Date
	 */
	public static Date getCurrYearLast(int year){
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(Calendar.YEAR, year);
		calendar.roll(Calendar.DAY_OF_YEAR, -1);
		Date currYearLast = calendar.getTime();
		
		return currYearLast;
	}

	
	
	/**
	 * 测试主方法
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 1999;i < 2020;i++){
			//System.out.println(formatDate(getCurrYearFirst(i)));
			System.out.println(getCurrYearLast(i).getTime());
		}

	}	
	
	
//	public static Long getSeconds(String time) throws ParseException{
//		 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
//		 Date d2=null;
//		 d2 =sdf.parse(time);
//		return  d2.getTime();
//	}
//	

}
