package exercise;

import java.util.Random;

public class ArrayMinMax {

	public static void main(String[] args) {

		// int[] num = { 10, 55, 23, 2, 79, 101, 16, 82, 30, 45 };

		int[] num = new int[10];
		Random random = new Random();
		for (int i = 0; i < num.length; i++) {
			num[i] = random.nextInt(100) + 1;
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "  ");
		}
		System.out.println();
		System.out.println("=======================================");

		int max = num[0];
		int min = num[0];
		int maxPos = 0;
		int minPos = 0;

		// 최대값
		for (int i = 0; i < num.length; i++) {
			if (max <= num[i]) {
				max = num[i];
				maxPos = i;
			}
		}
		System.out.println("가장 큰 값은 " + (maxPos + 1) + "번째의 " + max + "입니다.");

		// 최소값
		for (int i = 0; i < num.length; i++) {
			if (min >= num[i]) {
				min = num[i];
				minPos = i;
			}
		}
		System.out.println("가장 작은 값은 " + (minPos + 1) + "번째의 " + min + "입니다.");
	}

}
