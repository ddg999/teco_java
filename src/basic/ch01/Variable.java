package basic.ch01;

/**
 * <-- 여러줄 주석
 * 변수란 뭘까?
 * 변하는 수(변할 수 있는 데이터)
 * 데이터(값)를 담을 수 있는 메모리 공간(상자)
 */
public class Variable {

	// 코드의 시작점(메인함수)
	// 코드를 작성하는 시점 -> 컴파일
	// 프로그램을 실행하는 시점 -> 런타임
	public static void main(String[] args) {

		// 변수를 활용하는 3가지 유형
		
		//1. 변수를 선언
		int ageBox; // 정수값을 담을 수 있는 상자를 선언
		int telBox; // 정수값을 담을 수 있는 상자를 선언
		
		//2. 변수의 값을 넣기 (초기화하다)
		ageBox = 30; //대입연산자 =
		telBox = 300;
		
		//3. 변수를 사용하기
		System.out.println(ageBox);
		ageBox = telBox;
		System.out.println("after --> ageBox : " + ageBox);
		System.out.println("-------------------");
		System.out.println(telBox);
		
		
		
	} // end of main

} // end of class
