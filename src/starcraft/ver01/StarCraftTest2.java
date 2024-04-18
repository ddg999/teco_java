package starcraft.ver01;

import java.util.Scanner;

public class StarCraftTest2 {

	public static void main(String[] args) {

		final int ZEALOT = 1;
		final int MARINE = 2;
		final int ZERGLING = 3;
		final int GAME_END = 0;

//		GateWay gateway1 = new GateWay(1);
//		GateWay gateway2 = new GateWay(2);
//		
//		Zealot zealot1 = gateway1.createZealot("질럿1");
//		Zealot zealot2 = gateway1.createZealot("질럿2");
//		System.out.println(gateway1.getGateWayNumber() + "번 : " + gateway1.getCount());
//		System.out.println(gateway2.getGateWayNumber() + "번 : " + gateway2.getCount());
//		System.out.println("---------------------------");
		
//		Hive hive1 = new Hive(1);
//		Zergling zergling1 = hive1.createZergling("저글링1");
//		Zergling zergling2 = hive1.createZergling("저글링1");
//		Zergling zergling3 = hive1.createZergling("저글링1");
//		Zergling zergling4 = hive1.createZergling("저글링1");
//		Zergling zergling5 = hive1.createZergling("저글링1");
//
//		System.out.println(hive1.getCount());
//		System.out.println(hive1.getHiveNumber());
		
		Barrack barrack1 = new Barrack(1);

		Marine marine1 = barrack1.createMarine("마린");
		Marine marine2 = barrack1.createMarine("마린");
		Marine marine3 = barrack1.createMarine("마린");
		Marine marine4 = barrack1.createMarine("마린");
		Marine marine5 = barrack1.createMarine("마린");
		
		System.out.println(barrack1.getCount());
		
		
		Scanner sc = new Scanner(System.in);
		int unitChoice = -1;

		do {
			System.out.println("유닛을 선택하세요");
			System.out.println("1.질럿\t 2.마린\t 3.저글링\t 0.게임종료");
			unitChoice = sc.nextInt();

			if (unitChoice == ZEALOT) {
				
			} else if (unitChoice == MARINE) {

			} else if (unitChoice == ZERGLING) {

			} else {
				System.out.println("프로그램을 종료합니다.");
				unitChoice = GAME_END;
			}

		} while (unitChoice != GAME_END);

	} // end of main

}
// end of class
