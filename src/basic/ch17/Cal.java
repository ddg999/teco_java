package basic.ch17;

public class Cal {

	public Cal() { // 생성자 확인용도
		System.out.println("Cal() 부모 생성자 호출");
	}
	
	
	public int sum(int n1, int n2) {
		return n1 + n2;
	}

	public int multiply(int n1, int n2) {
		System.out.println("2. 호출");
		System.out.println("여기는 부모 클래스 메서드");
		return n1 * n2;
	}

	// 코드 테스트
	public static void main(String[] args) {

		Cal2 cal2 = new Cal2(); // heap 메모리에 부모클래스, 자식클래스 순서로 둘 다 생성됨
		System.out.println(cal2.sum(5, 3));
		System.out.println(cal2.minus(10, 3));
		System.out.println(cal2.multiply(10, 0));

	} // end of main

}

class Cal2 extends Cal {
	
	public Cal2() {
		System.out.println("Cal2() 자식 생성자 호출");
	}

	public int minus(int n1, int n2) {
		return n1 - n2;
	}

	// 부모 코드의 기능을 변경하고 싶다면 --> 재정의 한다
	// 오버라이드 처리 한다.
	// 그대로 복사해서 넣으면 자식 클래스의 메서드가 호출됨
//	public int multiply(int n1, int n2) {
//		if (n1 == 0 || n2 == 0) {
//			System.out.println("0을 입력하지 마세요");
//		}
//		return n1 * n2;
//	}
	@Override // <-- 애노테이션(어노테이션) --> 주석 + 힌트
	public int multiply(int n1, int n2) {
		System.out.println("1. 호출");
		return super.multiply(n1, n2); // super. <-- 부모클래스 호출
	}
	

}