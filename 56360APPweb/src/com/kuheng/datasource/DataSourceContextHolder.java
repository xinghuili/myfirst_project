package com.kuheng.datasource;

public class DataSourceContextHolder {
	
	public final static String DATA_SOURCE_MAIN="mainDataSource";
	
	public final static String DATA_SOURCE_OTHER="otherDataSource";
	
	private  static final ThreadLocal<String> contextHolder=new ThreadLocal<String>();

	public static void setDataSouuceType(String dataSource){
		contextHolder.set(dataSource);
	}
	
	public static String getDataSourceType(){
		return contextHolder.get();
	}
	
	public static void removeDataSourceType(){
		contextHolder.remove();
	}
}
