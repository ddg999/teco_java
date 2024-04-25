package exercise.toy;

import java.util.Scanner;

public class ToyMachineTest {

	public static void main(String[] args) {
		final int SAVE = 1;
		final int SEARCH = 2;
		final int DRAW = 3;
		final int END = 0;

		ToyMachine toymachine1 = new ToyMachine();
		boolean flag = true;

		while (flag) {
			System.out.println("1.저장 2.조회 3.뽑기 0.종료");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			if (choice == SAVE) {
				toymachine1.addProducts();
			} else if (choice == SEARCH) {
				toymachine1.showInfo();
			} else if (choice == DRAW) {
				toymachine1.draw();
			} else if (choice == END) {
				flag = false;
			}
		}

	} // end of main

}
