package com.kuheng.utils;

import java.security.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

public class StrUtil {

	private final static String[] hexDigits = { "0", "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

	public static String byteArrayToHexString(byte[] b) {
		StringBuffer resultSb = new StringBuffer();
		for (int i = 0; i < b.length; i++) {
			resultSb.append(byteToHexString(b[i]));
		}
		return resultSb.toString();
	}

	private static String byteToHexString(byte b) {
		int n = b;
		if (n < 0)
			n = 256 + n;
		int d1 = n / 16;
		int d2 = n % 16;
		return hexDigits[d1] + hexDigits[d2];
	}

	public static String MD5Encode(String origin) {
		String resultString = null;

		try {
			resultString = new String(origin);
			MessageDigest md = MessageDigest.getInstance("MD5");
			resultString = byteArrayToHexString(md.digest(resultString
					.getBytes()));
		} catch (Exception ex) {

		}
		return resultString;
	}

	public static String getRemortIP(HttpServletRequest request) {
		if (request.getHeader("x-forwarded-for") == null) {
			return request.getRemoteAddr();
		}
		return request.getHeader("x-forwarded-for");
	}

	public static String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}

	public static boolean isemail(String str) {

		String regex = "[a-zA-Z_]{1,}[0-9]{0,}@(([a-zA-z0-9]-*){1,}\\.){1,3}[a-zA-z\\-]{1,}";

		return match(regex, str);

	}

	private static boolean match(String regex, String str) {

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(str);

		return matcher.matches();

	}

	// public static void main(String[] args) {
	// System.err.println(MD5Encode("123456"));
	// }

	// 时间
	public static String getTimeN(Long timelong, int start, int end) {

		String str = "";
		if (timelong > 100) {
			try {
				str = String.valueOf(timelong) + "000";
				Date dd = new Date(Long.parseLong(str));
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd mm:ss");

				String strtime = sdf.format(dd);
				str = strtime.substring(start, end);
			} catch (Exception e) {
				// TODO 自动生成 catch 块
				System.out.print(e.getMessage());
			}

		}

		return str;

	}

	/*
	 * 2. * 返回长度为【strLength】的随机数，在前面补0 3.
	 */
	public static String getFixLenthString(int strLength) {

		Random rm = new Random();

		// 获得随机数
		double pross = (1 + rm.nextDouble()) * Math.pow(10, strLength);

		// 将获得的获得随机数转化为字符串
		String fixLenthString = String.valueOf(pross);

		// 返回固定的长度的随机数
		return fixLenthString.substring(1, strLength + 1);
	}

	// 生成随机数字和字母,
	public static String getStringRandom(int length) {

		String val = "";
		Random random = new Random();

		// 参数length，表示生成几位随机数
		for (int i = 0; i < length; i++) {

			String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
			// 输出字母还是数字
			if ("char".equalsIgnoreCase(charOrNum)) {
				// 输出是大写字母还是小写字母
				int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;
				val += (char) (random.nextInt(26) + temp);
			} else if ("num".equalsIgnoreCase(charOrNum)) {
				val += String.valueOf(random.nextInt(10));
			}
		}
		return val;
	}

	public static boolean isMobileNO(String mobiles) {

		Pattern p = Pattern
				.compile("^(13[0-9]|15[012356789]|17[678]|18[0-9]|14[57])[0-9]{8}$");
		//^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$
		Matcher m = p.matcher(mobiles);

		System.out.println(m.matches() + "---");

		return m.matches();
	}

	public static void main(String[] args) {
		System.out.println(getFixLenthString(2));
		System.out.println("cccc==" + Math.random());
		System.out.println("zzz==" + (int) ((Math.random() * 90) + 10));
		System.out.println("vvv==" + (int) (Math.random() * 90) + 10);

		System.out.println("mobile==="+StrUtil.isMobileNO("15764738325"));
	}

}