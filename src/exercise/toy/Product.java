package exercise.toy;

public class Product {

	String name;
	int num;
	

	public String getName() {
		return name;
	}

	public int getNum() {
		return num;
	}

	public void showInfo() {
		System.out.println("상품명 : " + name + " | 상품번호 : " + num);
	}

}
