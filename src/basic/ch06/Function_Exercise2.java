package basic.ch06;

public class Function_Exercise2 {

	static void greet(String name) {
		System.out.println("안녕하세요, [" + name + "]님!");
	}

	static int square(int i) {
		return i * i;
	}

	static Boolean checkAdult(int age) {
		Boolean checkAge = (age >= 18);
		return checkAge;
	}

	static void signOfNumber(int num) {
		if (num > 0) {
			System.out.println("positive");
		} else if (num < 0) {
			System.out.println("negative");
		} else {
			System.out.println("zero");
		}
	}

	static int findMax(int n1, int n2) {
		int result = (n1 > n2) ? n1 : n2;
		return result;
	}
	
}
