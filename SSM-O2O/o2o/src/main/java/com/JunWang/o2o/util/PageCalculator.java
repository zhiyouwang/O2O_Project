package com.JunWang.o2o.util;

public class PageCalculator {
	public static int calculateRowIndex(int pageIndex, int pageSize) {
		return (pageSize > 0) ? (pageIndex - 1) * pageSize : 0;
	}

}
