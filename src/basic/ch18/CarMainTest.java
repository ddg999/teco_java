package basic.ch18;

public class CarMainTest {

	public static void main(String[] args) {

		Car car1 = new Car(); // heap 메모리에 engine 도 올라감
		car1.startCar();

		// Engine 의 속성인 name 변수의 값을 초기화 해보자.
		car1.engine.name = "V8";
		car1.engine.price = 40_000_000;
		// null_pointer 에러 --> 객체를 생성했는가??, 주소값을 참조했는가??

		System.out.println(car1.engine.name);
		System.out.println(car1.engine.price);

	}

}
