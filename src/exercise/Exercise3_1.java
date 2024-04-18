package exercise;

public class Exercise3_1 {

	public static void main(String[] args) {

		for (int row = 1; row <= 3; row++) {
			for (int col = 0; col <= 2; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

		System.out.println("=========");

		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("=========");

		// j = ( i * 2 ) - 1

		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("=========");

		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
