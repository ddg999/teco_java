package basic.ch07;

public class Book {

	String bookName;
	String bookGenre;
	int price;
	int page;
	
	public void buyBook() {
		System.out.println("책 사러가기");
	}
	
	public void sellBook() {
		System.out.println("책 팔러가기");
	}
	
	public void showInfo() {
		System.out.println("----------책 정보----------");
		System.out.println("이름 : " + bookName);
		System.out.println("장르 : " + bookGenre);
		System.out.println("가격 : " + price);
		System.out.println("페이지수 : " + page);
	}
	
	
}
