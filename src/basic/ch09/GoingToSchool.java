package basic.ch09;

public class GoingToSchool {

	public static void main(String[] args) {

		Bus bus1 = new Bus(100);
		Bus bus2 = new Bus(200);
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		Subway subway3 = new Subway(3);

		Student student1 = new Student("홍길동", 10_000);
		student1.showInfo();
		System.out.println("--------------------");

		student1.takeBus(bus2);
		student1.showInfo();
		System.out.println("--------------------");
		bus2.showInfo();
		System.out.println("--------------------");
		student1.takeSubway(subway1);
		student1.showInfo();
		subway1.showInfo();
		System.out.println("--------------------");
		subway2.showInfo();

	}

}