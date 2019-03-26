package com.ybh.test_1;

import java.math.BigDecimal;

public class Test_1 {

	public static void main(String[] args) throws Exception {
		BigDecimal b = new BigDecimal("0");
		int intValue = b.intValue();
		if(intValue < 0){
			throw new  Exception("输入有误");
		}
		System.out.println(intValue);
	}
}
