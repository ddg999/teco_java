package basic.ch13;

import java.util.Random;

public class LottoNumberMaker {

	// 멤버 변수
	private String version = "1.0.0";

	// main 함수
	public static void main(String[] args) {

		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");
		System.out.print(makeNumber() + "\t");

	} // end of main

	// 인스턴스에 속하지 않는 함수 만들기
	public static int makeNumber() {

		// static 함수 안에 멤버 변수를 사용할 수 없다.
		// System.out.println("ver : " + version);

		Random random = new Random();
		int num = random.nextInt(45) + 1; // 0 ~~~~ 44
		return num;
	}

	// 배열을 이용해 로또번호 생성
	public static int[] makeNumbers() {
		int[] numbers = new int[6];
		Random random = new Random();

		for (int i = 0; i < 6; i++) {
			numbers[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					i--;
					break;
				}
			}
		}
		return numbers;
	}

}
