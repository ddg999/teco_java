package basic.ch05;

public class OrderProgram {

	public static void main(String[] args) {

		Order order1 = new Order();
		order1.menu = "피자";
		order1.userName = "석지웅";
		order1.userAddress = "부산진구 가야동";
		
		System.out.println(order1.menu);
		System.out.println(order1.userName);
		System.out.println(order1.userAddress);
	}

}
