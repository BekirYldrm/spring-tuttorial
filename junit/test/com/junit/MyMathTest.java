package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyMathTest {

	private MyMath math = new MyMath();

	@Test
	void calcuteSum_ThreeMemberArray() {
		assertEquals(6, math.calcuteSum(new int[] { 1, 2, 3 }));
	}

	@Test
	void calcuteSum_ZeroLengthArray() {
		assertEquals(0, math.calcuteSum(new int[] {}));
	}

}
