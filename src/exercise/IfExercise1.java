package exercise;

import java.util.Scanner;

public class IfExercise1 {

	// 코드의 시작점
	public static void main(String[] args) {

		// 정수값 입력 받기를 활용해서 코드의 흐름을 만들어주세요
		System.out.println("점수를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();

		// 조건문을 완성 하세요
		// 90점 이상 -> A 학점 입니다.
		if (score >= 90) {
			System.out.println("A 학점 입니다");
		}
		// 80점 이상 -> B 학점 입니다.
		else if (score >= 80) {
			System.out.println("B 학점 입니다");
		}
		// 70점 이상 -> C 학점 입니다.
		else if (score >= 70) {
			System.out.println("C 학점 입니다");
		}
		// 60점 이상 -> D 학점 입니다.
		else if (score >= 60) {
			System.out.println("D 학점 입니다");
		}
		// 59점 이하 -> F 학점 입니다.
		else if (score <= 59) {
			System.out.println("F 학점 입니다");
		}

		// 열여 있던 자원 닫기
		sc.close();

	} // end of main

} // end of class
