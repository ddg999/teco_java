package basic.ch04;

import java.util.Scanner;

public class OddSumCalculator {

	public static void main(String[] args) {

		System.out.println("홀수 합 숫자 입력");
		Scanner sc = new Scanner(System.in);
		int maxNumber = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= maxNumber; i += 2) {
			sum += i;
			System.out.print("sum : " + sum + " \t");
		}
		System.out.println("sum : " + sum);
		
		sc.close();
	}

}
