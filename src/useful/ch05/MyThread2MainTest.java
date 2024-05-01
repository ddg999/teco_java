package useful.ch05;

public class MyThread2MainTest {

	// 메인 작업자
	public static void main(String[] args) {
		System.out.println("main start");

		// 문제 MyThread2 를 메모리에 올리고
		MyThread2 myThread2 = new MyThread2();
		// 새로운 작업자를 생성해서 위임 시킬때는
		// Thread 안에 있는 start() 메서드를 호출해야 한다.
		Thread th1 = new Thread(myThread2);
		// 그 안에 정의된 run() 메서드를 호출하시오
		
		
		th1.start();

		// 힌트 --> Thread 문서를 반드시 확인하시오
		System.out.println("end main thread");
	}
}
