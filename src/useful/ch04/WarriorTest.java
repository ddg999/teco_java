package useful.ch04;

public class WarriorTest {

	public static void main(String[] args) {

		Warrior warrior = Warrior.getInstance();
		Warrior warrior2 = Warrior.getInstance();
		Warrior warrior3 = Warrior.getInstance();
		Warrior warrior4 = Warrior.getInstance();
		System.out.println(warrior);
		System.out.println(warrior2);
		System.out.println(warrior3);
		System.out.println(warrior4);
	}

}
