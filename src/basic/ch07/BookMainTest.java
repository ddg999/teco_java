package basic.ch07;

public class BookMainTest {

	public static void main(String[] args) {

		Book book1 = new Book();
		book1.bookName = "만들면서 배우는 플러터 앱 프로그래밍";
		book1.bookGenre = "컴퓨터/IT";
		book1.price = 22000;
		book1.page = 386;
		
		book1.buyBook();
		book1.sellBook();
		book1.showInfo();
	}

}
