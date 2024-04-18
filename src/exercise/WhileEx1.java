package exercise;

import java.util.Scanner;

public class WhileEx1 {

	public static void main(String[] args) {

		//1 부터 입력한 수까지의 합을 구해보자
		System.out.println("몇 까지 합을 구할까요?");
		int start = 1;
		Scanner sc = new Scanner(System.in);
		int end = sc.nextInt();
		int sum = 0;
		boolean flag = true;
		
		while (true) {
			sum = sum + start;
			if(start == end) {
				System.out.println("1부터 " + end + "까지의 합 : " + sum);
				sc.close();
				return;
			}
			start++;
		}
		
	}

}
