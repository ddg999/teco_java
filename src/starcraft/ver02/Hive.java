package starcraft.ver02;

public class Hive {

	private int hiveNumber;
	private int count;
	
	// 생성자
	public Hive(int hiveNumber) {
		this.hiveNumber = hiveNumber;
		count = 0;
	}
	
	// 저글링 생산하기
	public Zergling createZergling(String name) {
		count++;
		return new Zergling(name);
	}
	
	public int getHiveNumber() {
		return hiveNumber;
	}
	
	public int getCount() {
		return count;
	}
	
}
