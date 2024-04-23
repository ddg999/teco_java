package basic.ch18;

public class Car {

	String name;
	int price;
	Engine engine; // 포함관계 composition

	public Car() {
		// 객체 안에 필요한 객체를 직접 생성할 경우
		// Composition 관계라고 합니다.
		engine = new Engine();
		// Car라는 객체가 생성이 될 때
		// Engine 객체도 함께 생성이 된다
	}

	public void startCar() {
		engine.start();
		System.out.println("자동차가 출발합니다.");
	}

	public void stopCar() {
		engine.stop();
		System.out.println("자동차가 멈춥니다.");
	}

}
