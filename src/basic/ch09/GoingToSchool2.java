package basic.ch09;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class GoingToSchool2 {

	// 메인 함수
	public static void main(String[] args) {

		// 설계된 클래스를 가지고 본인이 의도한대로 실행의 흐름을 만들어보자

		// 스캐너를 활용해서 1번을 누르면 버스를 태워서 실행의 흐름을 만들고
		// 2번을 누르면 지하철을 태우는 실행의 흐름을 만들어보자.

		Bus bus1 = new Bus(100);
		Bus bus2 = new Bus(200);
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		Subway subway3 = new Subway(3);

		System.out.println("이름 입력 :");
		Scanner stName = new Scanner(System.in);
		String name = stName.next();

		System.out.println("소지금 입력 :");
		Scanner stMoney = new Scanner(System.in);
		int money = stMoney.nextInt();
		Student s1 = new Student(name, money);

		while (true) {
			System.out.println("1.버스 2.지하철");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			if (i == 1) {
				System.out.println("100, 200");
				Scanner scBusNum = new Scanner(System.in);
				int bus = scBusNum.nextInt();
				if (bus == 100) {
					s1.takeBus(bus1);
					break;
				} else if (bus == 200) {
					s1.takeBus(bus2);
					break;
				} else {
					System.out.println("다시 입력");
				}
			} else if (i == 2) {
				System.out.println("1, 2, 3");
				Scanner scSubWay = new Scanner(System.in);
				int subway = scSubWay.nextInt();
				if (subway == 1) {
					s1.takeSubway(subway1);
					break;
				} else if (subway == 2) {
					s1.takeSubway(subway2);
					break;
				} else if (subway == 3) {
					s1.takeSubway(subway3);
					break;
				} else {
					System.out.println("다시 입력");
				}
			} else {
				System.out.println("다시 입력");
			}
		}
		s1.showInfo();

	} // end of main

} // end of class
