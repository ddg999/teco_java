package basic.ch18;

public class ComputerTest {

	public static void main(String[] args) {

		Computer computer1 = new Computer();
		CPU cpu1 = new CPU();
		computer1.setCPU(cpu1);

		System.out.println("---------------------");
	}

}
