package basic.ch04;

import java.util.Scanner;

public class EvenSumCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Ctrl + Shift + O 임포트 추가
		System.out.print("정수값을 입력하세요 : ");
		int maxNumber = sc.nextInt();
		int sum = 0;
		
		// 10
		// 반복적인 패턴이 확인 된다
		// 1 2 3 4 5 6 7 8 9 10;
		
		for (int i = 2; i <= maxNumber; i += 2) {
			sum = sum + i;
		}
		
		System.out.println("sum : " + sum);
		
		
		
		
	} // end of main

} // end of class
