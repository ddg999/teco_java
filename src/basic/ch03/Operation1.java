 package basic.ch03;

/**
 * 부호 연산자
 * 단항 연산자 --> 변수의 부호를 변경(리터럴값의 부호를 변경)
 */

public class Operation1 {

	public static void main(String[] args) {

		int intData = 1000;
		System.out.println(+intData);
		System.out.println(-intData);
		System.out.println("----------");
		System.out.println(intData);
		// 부호 연산자는 변수의 실제 값이 변경 된 것은 아니다)
		
		// 메모리 공간 안의 실제 값을 변경하려면 어떻게 해야할까?
		// 답은 --> 대입 연산자와 함께 사용해야 한다.
		
		intData = -intData;
		System.out.println("실제 변수안에 들어있는 값 : " + intData);
		
		// 연습
		int oneStepDistance = 1;
		final int ZERO_POINT = 0; // 상수를 사용할 때는 대문자를 권장한다.
		int currentPosition = 0;
		
		// 제로 포인트에서 왼쪽으로 3칸 이동한 값을 출력하시오.
		currentPosition = ZERO_POINT - ( 3 * oneStepDistance );
		
		// 결과값 출력
		System.out.println("현재 위치 : " + currentPosition);
		
		// 절대값 출력
		
		// 자바 개발자들이 이미 만들어 둔 도구이다.
		// Math math; // 수학과 관련된 기능들의 모음
		
		System.out.println("거리 : " + Math.abs(currentPosition));
		
	} // end of main

} // end of class