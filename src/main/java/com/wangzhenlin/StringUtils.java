package com.wangzhenlin;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils{

	/**
	 * 判断一个字符串是否为空
	 * @param str
	 * @return
	 */
	public static boolean isBlank(String str) {
		
		return (str == null|| str.trim().equals(""));
	}
	
	/**
	 * 判断源字符是否有值，空引导也算没值
	 * @param str
	 * @return
	 */
	public static boolean haveValue(String str) {
		
		return !(str == null|| str.trim().equals(""));
	}
	
	/**
	 * 验证书记号码
	 * @param str
	 * @return
	 */
	public static boolean isMobile(String str) {
		
		String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$";
		Pattern p =  Pattern.compile(regex);
		Matcher matcher = p.matcher(str);
		return matcher.find();
			
	}
	
	/**
	 * 验证邮件
	 * @param str
	 * @return
	 */
	public static boolean isEmail(String str) {
		
		String regex="^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
		Pattern p =  Pattern.compile(regex);
		Matcher matcher = p.matcher(str);
		return matcher.find();
	}
	
	/**
	 * 获取n位随机英文字符串
	 * @param n
	 * @return
	 */
	public static String getRandomStr(int n) {
		
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		
		for (int i = 0; i < n; i++) {
			char c = (char)('A' +  random.nextInt(26));
			sb.append(c);
		}
		return sb.toString();
	}
	
	/**
	 * 3.3.8获取n位随机英文和数字字符串
	 * @param n
	 * @return
	 */
	public static String getRandomStr2(int n) {
		
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		
		for (int i = 0; i < n; i++) {
			int r = random.nextInt(36);
			if(r<26) {
				char c = (char)('A' +  r );
				sb.append(c);
			}else {
				sb.append(r-26);
			}
			
		}
		return sb.toString();
	}
	
	/**
	 * 获取随机长度为n的  中文字符串
	 * @param n
	 * @return
	 */
	public static String getRandomCn(int n ) {
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(getRandomCn());
		}
		return sb.toString();
	}
	
	/**
	 * 获取随机中文
	 * @return
	 */
	private static char getRandomCn() {
		
		String str = "";
        int hightPos; //
        int lowPos;
        Random random = new Random();

        hightPos = (176 + Math.abs(random.nextInt(39)));
        lowPos = (161 + Math.abs(random.nextInt(93)));

        byte[] b = new byte[2];
        b[0] = (Integer.valueOf(hightPos)).byteValue();
        b[1] = (Integer.valueOf(lowPos)).byteValue();

        try {
            str = new String(b, "GBK");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("错误");
        }

        return str.charAt(0);
	}
	
	
	
}
