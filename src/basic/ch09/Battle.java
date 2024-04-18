package basic.ch09;

import java.util.Scanner;

public class Battle {

	public static void main(String[] args) {

		Warrior war1 = new Warrior(5, 100);
		Magician mag1 = new Magician(8, 80);
		Archer arc1 = new Archer(6, 90);

		war1.toDieArc(arc1);
		
		war1.showInfo();
		mag1.showInfo();
		arc1.showInfo();
	} // end of main

}
