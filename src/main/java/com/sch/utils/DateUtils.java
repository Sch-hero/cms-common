package com.sch.utils;

import java.nio.channels.NonWritableChannelException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @宋春浩
 *
 * 2019年10月12日
 * 
 * 日期工具包
 */
public class DateUtils {
	
	/**
	 * 
	 * @param birthday
	 * @return
	 */
	public static void main(String[] args) {
		Date birth = new Date(100,0,6);
		int age = claAge(birth);
		System.err.println("age is"+age);//gfgfgffg
		
		
		System.out.println("今年的月初是：" + getMonthStart(new Date()));
		
		System.out.println("今年的月末是：" + getMonthEnd(new Date(119,1,23)));
	}

	
	private static int claAge(Date birthday) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.setTime(birthday);
		//获取出生的年月日
		int birthYear = cal.get(Calendar.YEAR);
		int birthMonth = cal.get(Calendar.MONTH);
		int birthDate = cal.get(Calendar.DAY_OF_MONTH);
		
		//获取今天的年月日
		cal.setTime(new Date());
		int currentYear = cal.get(Calendar.YEAR);
		int currentMonth = cal.get(Calendar.MONTH);
		int currentDate = cal.get(Calendar.DAY_OF_MONTH);
		
		int age = currentYear-birthYear;
		if (currentMonth<birthMonth) {
			age--;
		}else if (currentMonth==birthMonth) {
			if (currentDate<birthDate) {
				age--;
			}
		}
		return age;
	}
	
	
	/**
	 * 判断是否为今天
	 * @param date
	 * @return
	 */
	public static boolean isToday(Date date) {
		SimpleDateFormat smt = new SimpleDateFormat("yyyy-MM-dd");
		
		String dateStr = smt.format(date);
		String todayStr = smt.format(new Date());
		
		return dateStr.equals(todayStr);
	}
	
	/**
	 * 判断是否为今年
	 * @param date
	 * @return
	 */
	public static boolean isThisYear(Date date) {
		SimpleDateFormat smt = new SimpleDateFormat("yyyy-MM-dd");
		
		String dateStr = smt.format(date);
		String todayStr = smt.format(new Date());
		
		return dateStr.equals(todayStr);
	}
	
	/**
	 * 给定时间对象，初始化到该月初的1日0时0分0秒0毫秒
	 * @param date
	 * @return
	 */
	public static Date getMonthStart(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		//设置零秒
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.HOUR, 0);
		cal.set(Calendar.AM_PM, Calendar.AM);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		return cal.getTime();
	}
	
	/**
	 * 求月末
	 * @param date
	 * @return
	 */
	public static Date getMonthEnd(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.HOUR, 0);
		cal.set(Calendar.AM_PM, Calendar.AM);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.add(Calendar.MONTH, 1);
		cal.add(Calendar.SECOND, -1);
		return cal.getTime();
		
	}
}
