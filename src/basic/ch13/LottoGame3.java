package basic.ch13;

public class LottoGame3 {

	public static void main(String[] args) {

		// 난수 6개 생성
		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();

		// 출력
		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2 + "\t");
		System.out.print(gameNumber3 + "\t");
		System.out.print(gameNumber4 + "\t");
		System.out.print(gameNumber5 + "\t");
		System.out.print(gameNumber6 + "\t");
		System.out.println();
		System.out.println("-------------------------------------------");

		// 중복 제거
		while (gameNumber1 == gameNumber2 || gameNumber1 == gameNumber3 || gameNumber1 == gameNumber4
				|| gameNumber1 == gameNumber5 || gameNumber1 == gameNumber6 || gameNumber2 == gameNumber3
				|| gameNumber2 == gameNumber4 || gameNumber2 == gameNumber5 || gameNumber2 == gameNumber6
				|| gameNumber3 == gameNumber4 || gameNumber3 == gameNumber5 || gameNumber3 == gameNumber6
				|| gameNumber4 == gameNumber5 || gameNumber4 == gameNumber6 || gameNumber5 == gameNumber6) {

			gameNumber2 = LottoNumberMaker.makeNumber();
			gameNumber3 = LottoNumberMaker.makeNumber();
			gameNumber4 = LottoNumberMaker.makeNumber();
			gameNumber5 = LottoNumberMaker.makeNumber();
			gameNumber6 = LottoNumberMaker.makeNumber();
		}

		// 출력
		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2 + "\t");
		System.out.print(gameNumber3 + "\t");
		System.out.print(gameNumber4 + "\t");
		System.out.print(gameNumber5 + "\t");
		System.out.print(gameNumber6 + "\t");
		System.out.println();
		System.out.println("-------------------------------------------");

		// 오름차순
		for (int i = 1; i <= 5; i++) {
			if (gameNumber1 > gameNumber2) {
				int tempBox = gameNumber1;
				gameNumber1 = gameNumber2;
				gameNumber2 = tempBox;
			}
			if (gameNumber2 > gameNumber3) {
				int tempBox = gameNumber2;
				gameNumber2 = gameNumber3;
				gameNumber3 = tempBox;
			}
			if (gameNumber3 > gameNumber4) {
				int tempBox = gameNumber3;
				gameNumber3 = gameNumber4;
				gameNumber4 = tempBox;
			}
			if (gameNumber4 > gameNumber5) {
				int tempBox = gameNumber4;
				gameNumber4 = gameNumber5;
				gameNumber5 = tempBox;
			}
			if (gameNumber5 > gameNumber6) {
				int tempBox = gameNumber5;
				gameNumber5 = gameNumber6;
				gameNumber6 = tempBox;
			}
		}

		// 출력
		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2 + "\t");
		System.out.print(gameNumber3 + "\t");
		System.out.print(gameNumber4 + "\t");
		System.out.print(gameNumber5 + "\t");
		System.out.print(gameNumber6 + "\t");
		System.out.println();
		System.out.println("----------------------------------------------");

//		// 중복 제거 --> 잘못된 로직
//		for (int i = 1; i <= 5; i++) {
//			while (gameNumber1 == gameNumber2) {
//				gameNumber2 = LottoNumberMaker.makeNumber();
//			}
//			while (gameNumber2 == gameNumber3) {
//				gameNumber3 = LottoNumberMaker.makeNumber();
//			}
//			while (gameNumber3 == gameNumber4) {
//				gameNumber4 = LottoNumberMaker.makeNumber();
//			}
//			while (gameNumber4 == gameNumber5) {
//				gameNumber5 = LottoNumberMaker.makeNumber();
//			}
//			while (gameNumber5 == gameNumber6) {
//				gameNumber6 = LottoNumberMaker.makeNumber();
//			}
//
//		}
//
//		System.out.print(gameNumber1 + "\t");
//		System.out.print(gameNumber2 + "\t");
//		System.out.print(gameNumber3 + "\t");
//		System.out.print(gameNumber4 + "\t");
//		System.out.print(gameNumber5 + "\t");
//		System.out.print(gameNumber6 + "\t");
//		System.out.println();
//		System.out.println("----------------------------------------------");
//
//		// 오름차순
//		for (int i = 1; i <= 5; i++) {
//			if (gameNumber1 > gameNumber2) {
//				int tempBox = gameNumber1;
//				gameNumber1 = gameNumber2;
//				gameNumber2 = tempBox;
//			}
//			if (gameNumber2 > gameNumber3) {
//				int tempBox = gameNumber2;
//				gameNumber2 = gameNumber3;
//				gameNumber3 = tempBox;
//			}
//			if (gameNumber3 > gameNumber4) {
//				int tempBox = gameNumber3;
//				gameNumber3 = gameNumber4;
//				gameNumber4 = tempBox;
//			}
//			if (gameNumber4 > gameNumber5) {
//				int tempBox = gameNumber4;
//				gameNumber4 = gameNumber5;
//				gameNumber5 = tempBox;
//			}
//			if (gameNumber5 > gameNumber6) {
//				int tempBox = gameNumber5;
//				gameNumber5 = gameNumber6;
//				gameNumber6 = tempBox;
//			}
//		}
//
//		// 출력
//		System.out.print(gameNumber1 + "\t");
//		System.out.print(gameNumber2 + "\t");
//		System.out.print(gameNumber3 + "\t");
//		System.out.print(gameNumber4 + "\t");
//		System.out.print(gameNumber5 + "\t");
//		System.out.print(gameNumber6 + "\t");
//		System.out.println();
//		System.out.println("-------------------------------------------");

	} // end of main

}
