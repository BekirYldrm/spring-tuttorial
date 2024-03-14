package com.junit;

public class MyMath {

	public int calcuteSum(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}

}
