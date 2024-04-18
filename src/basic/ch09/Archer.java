package basic.ch09;

public class Archer {

	int health;
	int attack;
	
	public Archer(int atk, int heal) {
		health = heal;
		attack = atk;
	}
	public void toWar(Warrior toWar) {
		toWar.health -= attack;
	}
	public void toDieWar(Warrior toWar) {
		while (health > 0 || toWar.health > 0) {
			toWar.health-=attack;
			health-=toWar.attack;
		}
	}
	public void toMag(Magician toMag) {
		toMag.health -= attack;
	}
	public void toDieMag(Magician toMag) {
		while (this.health > 0 || toMag.health > 0) {
			toMag.health-=this.attack;
			this.health-=toMag.attack;
		}
	}
	public void showInfo() {
		System.out.println("궁수의 남은 체력 : " + health);
	}
}
