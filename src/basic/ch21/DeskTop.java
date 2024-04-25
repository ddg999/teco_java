package basic.ch21;

public class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("데스크톱 화면");
	}

	@Override
	public void typing() {
		System.out.println("데스크톱 타자치기");
	}

	public void mouse() {
		System.out.println("데스크톱 마우스 연결");
	}
	
	public void keyboard() {
		System.out.println("데스크톱 키보드 연결");
	}
	
}
