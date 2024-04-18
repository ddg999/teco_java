package starcraft.ver01;

public class Barrack {

	private int barrackNumber;
	private int count;

	public Barrack(int barrackNumber) {
		this.barrackNumber = barrackNumber;
	}

	// 마린 생산하기
	public Marine createMarine(String name) {
		count++;
		return new Marine(name);
	}

	public int getBarrackNumber() {
		return barrackNumber;
	}

	public int getCount() {
		return count;
	}

}
