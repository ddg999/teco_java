package basic.ch12;

public class Card {

	// 멤버 변수, static 변수
	String name;
	static int cardNumber = 10000;

	// 생성자
	public Card(String name) {
		this.name = name;
		++cardNumber;
	}
	//getter
	public int getCardNumber() {
		return cardNumber;
	}

	// 코드 테스트 ( 메인 함수 )
	public static void main(String[] args) {

		Card card1 = new Card("박1");
		System.out.println(card1.getCardNumber());
		Card card2 = new Card("김2");
		System.out.println(card2.getCardNumber());
		Card card3 = new Card("홍3");
		System.out.println(card3.getCardNumber());

	} // end of main

} // end of clas
