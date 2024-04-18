package exercise;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

		while (true) {
		// 사용자 한테 값을 입력 받기
		System.out.println("\t메뉴 선택");
		System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
		System.out.print("선택 : ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
			// 만약 ... 사용자 1 -->
			if (choice == 1) {
				System.out.println("등록을 선택했습니다.");
				System.out.println("--------------------------------------");
			} else if (choice == 2) {
				System.out.println("조회를 선택했습니다.");
				System.out.println("--------------------------------------");
			} else if (choice == 3) {
				System.out.println("수정을 선택했습니다.");
				System.out.println("--------------------------------------");
			} else if (choice == 4) {
				System.out.println("삭제를 선택했습니다.");
				System.out.println("--------------------------------------");
			} else if (choice == 0) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
				System.out.println("--------------------------------------");
			}
			
		}
		
	}

}
