package useful.ch04;

public class CompanyTest {

	public static void main(String[] args) {
		
		// 생성불가
		//Company company = new Company();
		// 고민! Company 객체를 어떻게 접근 할 수 있을까?
		
		// A클래스에서 활용
		Company company = Company.getInstance();
		System.out.println(company);
		
		// B클래스에서 활용
		Company company2 = Company.getInstance();
		System.out.println(company2);
		
	}
	
}
