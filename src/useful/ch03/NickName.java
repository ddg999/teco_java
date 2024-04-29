package useful.ch03;

public class NickName {

	private String nick;

	public String getNickName() {
		return nick;
	}

	public void setNickName(String nick) throws NickNameException {
		if (nick == null) {
			throw new NickNameException("닉네임은 null 값일 수 없습니다.");
		}
		if (nick.length() < 2) {
			throw new NickNameException("닉네임은 2글자 이상이어야 합니다.");
		}
		if (nick.matches("[\\W]*")) {
			throw new NickNameException("닉네임이 올바르지 않습니다.");
		}

		this.nick = nick;
	}

}
