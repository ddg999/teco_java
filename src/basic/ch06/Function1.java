package basic.ch06;

import java.util.Scanner;

public class Function1 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int sum;
		add(10, 10);
		
		System.out.println("두 정수를 입력 : ");
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		
		System.out.println("a1 부터 a2 까지의 합은 : " + calcSum(a1,a2));

	} // end of main

	static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

	// 연습 문제
	// 함수를 수정 --> 파라메터 정수 2개 받을 수 있도록 설계
	// s1, s2 --> 
	// 1, 10 --> 55
	// 7 , 200 --> 7+8+9+...+200
	
	static int calcSum(int s1, int s2) {
		int sum = 0;
		for (int i = s1; i <= s2; i++) {
			sum += i;
		}
		return sum;
	}

} // end of class
