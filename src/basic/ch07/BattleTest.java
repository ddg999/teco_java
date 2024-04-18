package basic.ch07;

public class BattleTest {

	public static void main(String[] args) {

		Battle orc = new Battle();
		orc.health = 100;
		orc.attackPoint = 6;
		orc.defensePoint = 1;
		
		Battle human = new Battle();
		human.health = 50;
		human.attackPoint = 8;
		human.defensePoint = 3;
		
		while (orc.health >= 0 && human.health >= 0) {
			orc.health = orc.health - (human.attackPoint - orc.defensePoint);
			human.health = human.health - (orc.attackPoint - human.defensePoint);
		}
		if (orc.health > human.health) {
			System.out.println("오크 승리");
		} else if ( human.health > orc.health){
			System.out.println("인간 승리");
		} else {
			System.out.println("무승부");
		}
		System.out.println("인간 체력 : " + human.health);
		System.out.println("오크 체력 : " + orc.health);
		
	}

}
