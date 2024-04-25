package exercise.toy;

import java.util.Random;
import java.util.Scanner;

// 클래스 - 인형뽑기
// 상품들이 존재 가능
// 사자인형, 곰인형, 에어팟
// -요구 조건-
// 배열을 활용해서 객체들을 담아 주세요

public class ToyMachine {

	Product[] products;
	int count;

	public ToyMachine() {
		products = new Product[10];
		count = 0;
	}

	// 사장이 상품을 넣다
	public void addProducts() {
		AirPods airpods = new AirPods();
		BearToy beartoy = new BearToy();
		LionToy liontoy = new LionToy();

		if (count >= 10) {
			System.out.println("가득 찼습니다");
			return;
		}

		System.out.println("몇 번 상품을 넣을까요?");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();

		for (int i = 0; i < products.length; i++) {
			if (products[i] == null && num.equals("1")) {
				products[i] = airpods;
				System.out.println("에어팟을 넣었습니다");
				count++;
				return;
			} else if (products[i] == null && num.equals("2")) {
				products[i] = beartoy;
				System.out.println("곰인형을 넣었습니다");
				count++;
				return;
			} else if (products[i] == null && num.equals("3")) {
				products[i] = liontoy;
				System.out.println("사자인형을 넣었습니다");
				count++;
				return;
			}

		}
		System.out.println("잘못된 입력입니다");

	}

	public void addProduct(Product product) {
	}

	// 사용자가 돈을 넣고 게임을 한다
	// 저장한 상품 중 뽑기
	public void draw() {
		if (count == 0) {
			System.out.println("상품이 없습니다");
			return;
		}
		Random random = new Random();
		int num = random.nextInt(count);
		if (products[num] != null) {
			System.out.println("===== 뽑기 결과 =====");
			products[num].showInfo();
			System.out.println("=====================");
			count--;
			products[num] = null;
		}

	}

	public void draw1(Product[] product) {
		Random random = new Random();
		int num = random.nextInt(3);
		if (product[num].getNum() == 1) {
			System.out.println("에어팟을 뽑았다");
		} else if (product[num].getNum() == 2) {
			System.out.println("곰인형을 뽑았다");
		} else if (product[num].getNum() == 3) {
			System.out.println("사자인형을 뽑았다");
		}
	}

	// 상품의 정보 출력
	public void showInfo() {
		for (int i = 0; i < products.length; i++) {
			if (products[i] != null) {
				System.out.println(products[i].getName() + " " + products[i].getNum());
			}
		}
	}

}
