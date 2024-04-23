package exercise.test01;

public class MainTest1 {

	public static void main(String[] args) {

		A a = new A();

		// a 참조변수로 시작해서 D의 name 값을
		// 화면에 출력하시오
		System.out.println(a.b.c.d.getName());
		a.b.c.d.setName("D 입니다");
		System.out.println(a.b.c.d.getName());

	} // end of main

} // end of class
