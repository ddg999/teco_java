package basic.ch17;

public class Hero {

	String name;
	int hp;

	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public void attack() {
		System.out.println("공격!!");
	}

}

class Warrior extends Hero {
	public Warrior(String name, int hp) {
		super(name, hp);
	}

	public void attack() {
		System.out.println(name + "의 공격!!");
	}

	public void comboAttack() {
		System.out.println("연속 공격!!");
	}
}

class Archer extends Hero {
	public Archer(String name, int hp) {
		super(name, hp);
	}

	public void attack() {
		System.out.println(name + "의 공격!!");
	}

	public void fireArrow() {
		System.out.println("파이어 애로우!!");
	}
}

class Wizard extends Hero {
	public Wizard(String name, int hp) {
		super(name, hp);
	}

	public void attack() {
		System.out.println(name + "의 공격!!");
	}

	public void freezing() {
		System.out.println("프리징!!");
	}
}
