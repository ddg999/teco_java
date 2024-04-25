package basic.ch21;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer1 = new DeskTop();
		Computer computer2 = new MyNoteBook();

		computer1.turnOn();
		computer1.display();
		computer1.typing();
		computer1.turnOff();

		System.out.println("====================");

		computer2.turnOn();
		computer2.display();
		computer2.typing();
		computer2.turnOff();

		Computer[] computer = new Computer[5];
		computer[0] = computer1;
		computer[1] = computer2;
		
		computer[0].display();
		computer[0].typing();
		computer[1].turnOn();
		((DeskTop)computer[0]).mouse();
		((NoteBook)computer[1]).wifi();
	}

}
