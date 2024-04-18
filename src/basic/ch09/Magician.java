package basic.ch09;

public class Magician {

	int health;
	int attack;
	
	public Magician(int atk, int heal) {
		health = heal;
		attack = atk;
	}
	public void toWar(Warrior toWar) {
		toWar.health -= attack;
	}
	public void toDieWar(Warrior toWar) {
		while (health <= 0 || toWar.health <= 0) {
			toWar.health-=attack;
			health-=toWar.attack;
		}
	}
	public void toArc(Archer toArc) {
		toArc.health -= attack;
	}
	public void toDieArc(Archer toArc) {
		while (health <= 0 || toArc.health <= 0) {
			toArc.health-=attack;
			health-=toArc.attack;
		}
	}
	public void showInfo() {
		System.out.println("마법사의 남은 체력 : " + health);
	}
}
