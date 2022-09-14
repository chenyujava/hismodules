package com.neuedu.test;

import java.util.Date;

import com.neuedu.utils.DateUtil;

public class TestUtil {

	public static void main(String[] args) {
		Date date = DateUtil.string2Date("2022-10-01");
		System.out.println(date);
		
	}
}
