package basic.ch10;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean isDie;

	// getter, setter 메서드를 만들어주세요
	public String getName() {
		return this.name;
	}

	public int getHp() {
		return this.hp;
	}

	public int getPower() {
		return this.power;
	}

	public double getDefense() {
		return this.defense;
	}

	public boolean getIsDie() {
		if (isDie = true) {
		System.out.println("죽었습니다");
		} else {
			System.out.println("안죽었습니다");
		}
		return this.isDie;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHp(int hp) {
		if (hp <= 0) {
			System.out.println("잘못된 HP 설정입니다");
			return;
		}
		this.hp = hp;
	}

	public void setPower(int power) {
		if (power <= 0) {
			System.out.println("잘못된 POWER 설정입니다");
			return;
		}
		this.power = power;
	}

	public void setDefense(double defense) {
		this.defense = defense;
	}

	public void setIsDie(boolean isDie) {
		this.isDie = isDie;
	}

}
