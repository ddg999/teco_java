package basic.ch10;

public class Academy {
	private String name;
	private String subject;
	private int numStudent;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getNumStudent() {
		return numStudent;
	}

	public void setNumStudent(int num) {
		numStudent = num;
	}

	public void showInfo() {
		System.out.println("학원명 : " + name);
		System.out.println("과목명 : " + subject);
		System.out.println("학생수 : " + numStudent + "명");
	}

}
