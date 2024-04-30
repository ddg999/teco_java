package useful.ch04;

import exercise.test01.C;

public class ManualCar extends Car {

	@Override
	void drive() {
		System.out.println("사람이 운전을 합니다");
	}

	@Override
	void stop() {
		System.out.println("브레이크를 밟습니다");
	}

}
