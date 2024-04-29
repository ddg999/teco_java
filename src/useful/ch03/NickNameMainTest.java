package useful.ch03;

public class NickNameMainTest {

	public static void main(String[] args) {

		NickName nick = new NickName();

		String inputNick = null;
		inputNick = "";

		try {
			nick.setNickName(inputNick);
		} catch (NickNameException e) {
			System.out.println("사용자 정의한 예외처리 완료");
			nick.setNickName(inputNick);
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}

	}

}
