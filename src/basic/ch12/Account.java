package basic.ch12;

public class Account {
	private static int account;

	public void depositMoney(int money) {
		System.out.println(money + "만큼 입금했습니다.");
		account += money;
	}

	public void withdrawMoney(int money) {
		System.out.println(money + "만큼 출금했습니다");
		account -= money;
	}

	public int getAccount() {
		return account;
	}
}
