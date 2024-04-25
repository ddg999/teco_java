package basic.ch20;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.move();
		animal.eating();
		System.out.println("-------------------");

		Animal 주소2 = new Tiger();
		주소2.move();
		주소2.eating();
		System.out.println("-------------------");

		Animal 주소3 = new Human();
		주소3.move();
		주소3.eating();
		// 주소3.readBooks(); // 컴파일 시점에서의 오류
		((Human)주소3).readBooks();
		
	}

}
