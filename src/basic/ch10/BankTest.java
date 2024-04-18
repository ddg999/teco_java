package basic.ch10;

public class BankTest {

	// 코드의 시작점
	public static void main(String[] args) {

		Bank bank1 = new Bank();
		// bank1.name = "우리은행";

		bank1.deposit(10_000);
		int getMoney = bank1.withdraw(5_000);
		System.out.println(">>>>>>>> 출금 >>>>>>>>>");
		System.out.println("금액 : " + getMoney);

		// 신입 개발자가 실수로 멤버 변수에 접근해서 수정 ...
		// Bank에 돈을 넣어야 --> deposit() 기능으로 만들어져 있다.
		// bank1.balance = 100_000; <-- private으로 변경 후 정보 은닉 되었다.
		// 10만 5천원이 있어야 정상
		// 의도하지 않은 실수를 발생 시킬 수 있다.
		bank1.deposit(100_000);

		// 실행의 흐름을 만들 예정
		// 현재 은행의 전체 잔고가 200_000 이하라면 본점에 금액 요청상황
		System.out.println(bank1.getBalance());
		if (bank1.getBalance() <= 200_000) {
			System.out.println("본점에 금액을 요청해~~");
		}

		bank1.setName("그린은행");
		System.out.println(bank1.getName());
		bank1.setBalance(2_147_483_647);
		System.out.println(bank1.getBalance());

	} // end of main

} // end of class
