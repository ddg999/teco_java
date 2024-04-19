package basic.ch13;

public class LottoGame3 {

	public static void main(String[] args) {

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
		System.out.println("----------------------------------------------");

		while (gameNumber1 == gameNumber2) {
			gameNumber2 = LottoNumberMaker.makeNumber();
		}
		while (gameNumber1 == gameNumber3) {
			gameNumber3 = LottoNumberMaker.makeNumber();
		}
		while (gameNumber1 == gameNumber4) {
			gameNumber4 = LottoNumberMaker.makeNumber();
		}
		while (gameNumber1 == gameNumber5) {
			gameNumber5 = LottoNumberMaker.makeNumber();
		}
		while (gameNumber1 == gameNumber6) {
			gameNumber6 = LottoNumberMaker.makeNumber();
		}

		while (gameNumber2 == gameNumber3) {
			gameNumber3 = LottoNumberMaker.makeNumber();
		}
		while (gameNumber2 == gameNumber4) {
			gameNumber4 = LottoNumberMaker.makeNumber();
		}
		while (gameNumber2 == gameNumber5) {
			gameNumber5 = LottoNumberMaker.makeNumber();
		}
		while (gameNumber2 == gameNumber6) {
			gameNumber6 = LottoNumberMaker.makeNumber();
		}

		while (gameNumber3 == gameNumber4) {
			gameNumber4 = LottoNumberMaker.makeNumber();
		}
		while (gameNumber3 == gameNumber5) {
			gameNumber5 = LottoNumberMaker.makeNumber();
		}
		while (gameNumber3 == gameNumber6) {
			gameNumber6 = LottoNumberMaker.makeNumber();
		}

		while (gameNumber4 == gameNumber5) {
			gameNumber5 = LottoNumberMaker.makeNumber();
		}
		while (gameNumber4 == gameNumber6) {
			gameNumber6 = LottoNumberMaker.makeNumber();
		}

		while (gameNumber5 == gameNumber6) {
			gameNumber6 = LottoNumberMaker.makeNumber();
		}

		int tempBox = 0;

		for (int i = 1; i <= 5; i++) {
			if (gameNumber1 > gameNumber2) {
				tempBox = gameNumber1;
				gameNumber1 = gameNumber2;
				gameNumber2 = tempBox;
			}
			if (gameNumber2 > gameNumber3) {
				tempBox = gameNumber2;
				gameNumber2 = gameNumber3;
				gameNumber3 = tempBox;
			}
			if (gameNumber3 > gameNumber4) {
				tempBox = gameNumber3;
				gameNumber3 = gameNumber4;
				gameNumber4 = tempBox;
			}
			if (gameNumber4 > gameNumber5) {
				tempBox = gameNumber4;
				gameNumber4 = gameNumber5;
				gameNumber5 = tempBox;
			}
			if (gameNumber5 > gameNumber6) {
				tempBox = gameNumber5;
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

	} // end of main

}
