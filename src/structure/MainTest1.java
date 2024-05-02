package structure;

public class MainTest1 {

	public static void main(String[] args) {

		TencoIntArray tencoIntArray = new TencoIntArray();
		tencoIntArray.addElement(100);
		tencoIntArray.addElement(200);
		tencoIntArray.addElement(300);
		tencoIntArray.addElement(400);
		tencoIntArray.insertElement(0, 50);
		tencoIntArray.removeElement(0);
		tencoIntArray.printAll();
		System.out.println("-----------------");
		System.out.println(tencoIntArray.getElement(0));
		System.out.println("-----------------");
		System.out.println(tencoIntArray.getCountSize());
		System.out.println("-----------------");
		System.out.println(tencoIntArray.isEmpty());
		System.out.println("-----------------");
		tencoIntArray.removeAll();
		tencoIntArray.printAll();
	}

}
