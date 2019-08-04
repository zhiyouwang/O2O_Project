package com.JunWang.o2o.util;

import javax.servlet.http.HttpServletRequest;

public class HttpServletRequestUtil {
	
	/**
	 * 得到Int类型
	 * @param request
	 * @param key
	 * @return
	 */
	public static int getInt(HttpServletRequest request, String key) {
		try {
			return Integer.decode(request.getParameter(key));
		} catch (Exception e) {
			return -1;
		}
	}
	
	/**
	 * 得到long类型
	 * @param request
	 * @param key
	 * @return
	 */
	public static long getILong(HttpServletRequest request, String key) {
		try {
			return Long.valueOf(request.getParameter(key));
		} catch (Exception e) {
			return -1;
		}
	}
	
	/**
	 * Double类型
	 * @param request
	 * @param key
	 * @return
	 */
	public static Double getDouble(HttpServletRequest request, String key) {
		try {
			return Double.valueOf(request.getParameter(key));
		} catch (Exception e) {
			return -1d;
		}
	}
	
	/**
	 * 布尔类型
	 * @param request
	 * @param key
	 * @return
	 */
	public static boolean getIBoolean(HttpServletRequest request, String key) {
		try {
			return Boolean.valueOf(request.getParameter(key));
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * String类型
	 * @param request
	 * @param key
	 * @return
	 */
	public static String getString(HttpServletRequest request, String key) {
		try {
			String result = request.getParameter(key);
			if (result != null) {
				result = result.trim();
			}
			if ("".equals(result)) {
				result = null;
			}
			return result;
		} catch (Exception e) {
			return null;
		}
	}

}
