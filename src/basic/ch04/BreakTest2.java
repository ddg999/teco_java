package basic.ch04;

public class BreakTest2 {

	// 코드의 시작점
	public static void main(String[] args) {

		// 중간에 멈추는 break문
		// 소수 7이면 반복문을 멈추어라

		int i = 1;
		while (i <= 10) {
			System.out.println("a의 값 : " + i);
			// 단독 if 구문은 수행이 될수도 있고 안될 수도 있다
			if ((i % 7) == 0) {
				// 중간에 멈추어라
				break;
			}
			i++;
		}

	} // end of main

} // end of class
