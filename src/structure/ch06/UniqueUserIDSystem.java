package structure.ch06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class UniqueUserIDSystem {

	private HashSet<String> userIDs;

	public UniqueUserIDSystem() {
		this.userIDs = new HashSet<String>();
	}

	// 사용자 ID 등록 기능
	// 정상적으로 들어가면 true
	// 중복 발생하면 false
	public boolean registerUserID(String userId) {
		return userIDs.add(userId);
	}

	// 시스템 실행
	public void run() {
		// 실행 흐름 만들기 --> while, if
		while (true) {
			System.out.println("1.아이디등록 2.전체조회 3.종료");

			// 동작 - 스캐너 활용
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("아이디 입력 : ");
				String userId = sc.next();

				// 결과 -> 정상 유저 등록
				if (registerUserID(userId)) {
					System.out.println("새로운 사용자가 등록되었습니다.");
				} else {
					// -> 이미 등록된 사용자입니다.
					System.out.println("이미 등록된 사용자입니다.");
				}
			} else if (choice == 2) {
				if (userIDs.size() == 0) {
					System.out.println("조회할 아이디가 없습니다.");
				} else {
					Iterator<String> iter = userIDs.iterator();
					while (iter.hasNext()) {
						System.out.println("ID : " + iter.next());
					}
				}
			} else if (choice == 3) {
				System.out.println("시스템을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}

	// 코드 테스트
	public static void main(String[] args) {
		UniqueUserIDSystem system = new UniqueUserIDSystem();
		system.run();
	} // end of main
}
