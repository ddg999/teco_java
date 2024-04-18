package starcraft.ver01;

public class Zealot {

	private String name;
	private int power;
	private int hp;

	// 생성자
	public Zealot(String name) {
		this.name = name;
		power = 5;
		hp = 80;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	// 질럿이 마린을 공격합니다.
	public void attackMarine(Marine m) {
		System.out.println(this.name + "이 " + m.getName() + "을 공격합니다.");
		m.beAttacked(this.power);
	}

	// 질럿이 저글링을 공격합니다.
	public void attackZergling(Zergling z) {
		System.out.println(this.name + "이 " + z.getName() + "을 공격합니다.");
		z.beAttacked(this.power);
	}

	// 자신이 공격을 당합니다.
	public void beAttacked(int power) {
		// 방어적코드 작성
		if (this.hp <= 0) {
			System.out.println("[" + this.name + "] 이미 사망하였습니다");
			this.hp = 0;
			return;
		}
		this.hp -= power;
	}

	// 상태창
	public void showInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
	}

}
