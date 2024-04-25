package starcraft.ver05;

public class Marine extends Unit {

	// 생성자
	public Marine(String name) {
		super(name);
		super.name = name;
		super.power = 6;
		super.hp = 40;
		// super(name); <-- 오류, 순서 제일 위에 있어야함
	}

}
