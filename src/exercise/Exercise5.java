package exercise;

import java.util.Iterator;

public class Exercise5 {

	// 코드의 시작점
	public static void main(String[] args) {

		// 1단계 - 세로 반복의 횟수 (for - 횟수)
		// * - 1
		// ** - 2
		// *** - 3
		// **** - 4
		// ***** - 5

		for (int i = 0; i < 5; i++) { // 5번

		}

		// 2단계

		System.out.print("*");
		System.out.println();
		System.out.print("**");
		System.out.println();
		System.out.print("***");
		System.out.println();
		System.out.print("****");
		System.out.println();
		System.out.print("*****");
		System.out.println();

		System.out.println("----------------");

		for (int j = 0; j < 1; j++) { // 1번 동작
			System.out.print("*");
		}
		System.out.println();

		for (int j = 0; j < 2; j++) { // 2번 동작
			System.out.print("*");
		}
		System.out.println();

		for (int j = 0; j < 3; j++) { // 3번 동작
			System.out.print("*");
		}
		System.out.println();

		for (int j = 0; j < 4; j++) { // 4번 동작
			System.out.print("*");
		}
		System.out.println();

		for (int j = 0; j < 5; j++) { // 5번 동작
			System.out.print("*");
		}
		System.out.println();

		System.out.println("---------------------");
		
		// 3단계

		// outer for
		for (int i = 0; i < 5; i++) { // 5번
			
			// inner for
			// 첫번째 동작 j = 0, j <= 0 ---> 한번 동작 -> * -> 줄바꿈  
			// 두번째 동작 j = 0, j <= 1 ---> 두번 동작 -> ** -> 줄바꿈  
			// 세번째 동작 j = 0, j <= 2 ---> 세번 동작 -> *** -> 줄바꿈  
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	} // end of main

} // end of class
