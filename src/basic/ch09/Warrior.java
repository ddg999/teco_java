package basic.ch09;

public class Warrior {

	int health;
	int attack;
	
	public Warrior(int atk, int heal) {
		health = heal;
		attack = atk;
	}
	public void toArc(Archer toArc) {
		toArc.health -= attack;
	}
	public void toDieArc(Archer toArc) {
		while (health > 0 || toArc.health > 0) {
			toArc.health-=attack;
			health-=toArc.attack;
		}
	}
	public void toMag(Magician toMag) {
		toMag.health -= attack;
	}
	public void toDieMag(Magician toMag) {
		while (health > 0 || toMag.health > 0) {
			toMag.health-=attack;
			health-=toMag.attack;
		}
	}
	public void showInfo() {
		System.out.println("전사의 남은 체력 : " + health);
	}
}
