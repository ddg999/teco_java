package basic.ch06;

import java.util.Scanner;

public class Function_Exercise {

	public static void main(String[] args) {

		greet("석지웅");

		System.out.println("제곱은? " + square(11));

		System.out.println("18세 이상인가요? " + checkAdult(11));

		System.out.println("숫자의 부호는? " + signOfNumber(-5));

		System.out.println("큰 수는 ? " + findMax(32, 21));

	}

	static void greet(String name) {
		System.out.println("안녕하세요, [" + name + "]님!");
	}

	static int square(int i) {
		int result1 = i * i;
		return result1;
	}

	static boolean checkAdult(int age1) {
		boolean adult;
		if (age1 >= 18) {
			adult = true;
		} else {
			adult = false;
		}
		return adult;
	}

	static String signOfNumber(int num1) {
		String sign;
		if (num1 > 0) {
			sign = "positive";
		} else if (num1 < 0) {
			sign = "negative";
		} else {
			sign = "zero";
		}
		return sign;
	}

	static int findMax(int a1, int a2) {
		if (a1 > a2) {
			return a1;
		} else {
			return a2;
		}
	}

}
