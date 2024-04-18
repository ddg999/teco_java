package basic.ch08;

public class UserInfo {

	public String userId;
	public String userPassword;
	public String userName;
	public String userAddress;
	public String phoneNumber;

	// 생성자 오버로딩이란
	// 생성자의 개수가 여러개 있다다

	// 기본 생성자 형태 만들어보기
	public UserInfo() {
	}

	public UserInfo(String id) {
		userId = id;
	}

	public UserInfo(String id, String name) {
		userId = id;
		userName = name;
	}

	// 매개 변수 3개를 받는 생성자를 만들어보세요
	public UserInfo(String id, String pw, String name) {
		userId = id;
		userPassword = pw;
		userName = name;
	}

	// 매개 변수 4개를 받는 생성자를 만들어보세요
	public UserInfo(String id, String pw, String name, String Address) {
		userId =id;
		userPassword = pw;
		userName = name;
		userAddress = Address;
	}
	
	// 매개 변수 5개를 받는 생성자를 만들어보세요
	public UserInfo(String id, String pw, String name, String Address, String num) {
		userId = id;
		userPassword = pw;
		userName = name;
		userAddress = Address;
		phoneNumber = num;
	}

} // end of class
