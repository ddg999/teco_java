package exercise;

public class OperationPractice {

	// 코드의 시작점
	public static void main(String[] args) {
		
		// 1. intData와 doubleData을 덧셈 연산 하여 result1 변수에 담고
		// 결과값 30.5를 출력 하세요.
		int intData = 10;
		double doubleData = 20.5;
		// result1 변수명으로 사용
		double result1 = intData + doubleData;
		System.out.println("결과값 : " + result1);

		// 2. result1 변수를 정수형으로 강제 형 변환 해서 출력하세요
		System.out.println((int)result1);

		// 3. intData 변수에서 -1을 뺀 후 출력하세요
		// 단, 단항 연산자 사용
		System.out.println(--intData);

		// 4. doubleData 변수에 값을 -20.5로 출력 하세요
		// 단, doubleData 값을 변경하지 마세요
		System.out.println(-doubleData);

		// 5. 변수 intData 와 doubleData, 관계 연산자를 사용해서
		// result2 변수에 값을 true 담기도록 식을 만들고 만들고 출력하세요
		boolean result2 = intData < doubleData;
		System.out.println("intData 는 doubleData 보다 작다 : " + result2);

		int num1 = 10;
		int num2 = 30;
		// 6. 변수 result3 을 선언하고 num1과 num2 변수가 합이
		// 숫자 50보다 큰지 비교 연산자(삼항 연산자)를 사용해서 결과를 담고 출력하세요
		boolean result3 = (num1 + num2) > 50;
		System.out.println("num1 + num2 는 50보다 크다 : " + result3);

		// 7. num1과 num2 값 중 큰 수를 삼항 연산자를 사용해서
		// max 변수에 값을 담고 출력해주세요
		int max = (num1 > num2) ? num1 : num2;
		System.out.println("num1 과 num2 중 큰 수는 : " + max);

	} // end of main

} // end of class
