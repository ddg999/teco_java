package basic.ch04;

public class ForTest1 {

	// 코드의 시작점
	public static void main(String[] args) {

		// 문제 - 화면에 0부터 9까지 화면에 출력하시오.
//		System.out.println("0");
//		System.out.println("1");
//		System.out.println("2");
//		System.out.println("3");
//		System.out.println("4");
//		System.out.println("5");
//		System.out.println("6");
//		System.out.println("7");
//		System.out.println("8");
//		System.out.println("9");

		// 반복적인 패턴이 보인다면 반복문(for)을 생각하자
		// 0 ~ 9
		for(int i = 0; i < 10; i++) { // for문 안에서만 int i 유효
			// 반복적인 패턴에 구문을 작성한다.
			System.out.println(i);
		}
		
	} // end of main

} // end of class
