package com.kuheng.utils;
@SuppressWarnings("all")
public class Systemprint {
	public static void prints(Object... params){
		System.out.println("--------------------------------");
		for(Object param:params){
			System.out.println(param);
		}	
	}
}
