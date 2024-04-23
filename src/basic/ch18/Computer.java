package basic.ch18;

public class Computer {

	private CPU cpu;

	public Computer() {
		cpu = new CPU(); // composition 관계
		cpu.setName("인텔10");
	}

	void start() {
		System.out.println("컴퓨터를 ON 합니다");
		cpu.process();
	}

	// 필요하다면 setter 메서드를 만들 수 있다.
	public void setCPU(CPU cpu) {
		this.cpu = cpu;
	}

	// 외부에서 접근 가능한 getter
	public CPU getCPU() {
		return cpu;
	}
}
