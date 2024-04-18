package basic.ch03;

public class Operation2 {

	public static void main(String[] args) {

		int result1 = 5 + 3;
		int result2 = 5 - 3;
		int result3 = 5 * 3;
		// 5.0 이나 3.0 으로 적어야 실수로 계산됨
		// int result4 = 5 / 3;
		double result4 = 5 / 3.0;
		int result5 = 5 % 3;
		
		System.out.println("result1 " + result1);
		System.out.println("result2 " + result2);
		System.out.println("result3 " + result3);
		System.out.println("result4 " + result4);
		System.out.println("result5 " + result5);
		
		// 문제
		// 1. (12 + 3) / 3 값을 화면에 출력해 보세요
		// 변수명, 데이터 유형 스스로 결정하고 식을 만들어보세요
		int a = 12;
		int b = 3;
		int resultab = (a + b) / 3;
		System.out.println(resultab);
		
		// 2. (25 % 2) 값을 화면에 출력해 보세요
		// 어떤 수를 2로 나누었을 때 나머지가 0이면 짝수 1이면 홀수
		int c = 25;
		int resultc = c % 2;
		System.out.println(resultc);
		
		// 3. 15를 4로 나눈 후, 그 결과의 절대값을 출력하세요
		double d = 15;
	    double e = 4;
		System.out.println(Math.abs(d / e));
		
		// 도전 문제
		// 직접 산술 연산자 문제 만들기 (2문제 생성)
		
		// 8조각의 피자가 있는데
		// 철수가 3조각, 민재가 2조각을 먹었다.
		// 몇 조각이 남았을까?
		int pizza = 8;
		int man1 = 3;
		int man2 = 2;
		int leftpizza = pizza - (man1 + man2);
		System.out.println("남은 피자 : " + leftpizza + "조각");
		
		// 길동이의 이번 중간고사 결과는 
		// 국어 88점, 수학 93점, 영어 85점이다.
		// 세 과목의 평균점수는 몇 점일까?
		int lang = 88;
		int math = 93;
		int eng = 85;
		double avg = (double)(lang + math + eng ) / 3;
		// double avg = (lang + math + eng ) / 3.0;
		// double avg = (lang + math + eng ) / (double)3;
		System.out.println("중간고사 평균점수 : " + avg + "점");
		
		
	} // end of main

} // end of class
