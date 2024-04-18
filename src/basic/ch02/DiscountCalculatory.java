package basic.ch02;

public class DiscountCalculatory {

	public static void main(String[] args) {

		// 제품의 원래 가격과 할인율 상수로 선언
		final double ORIGINAL_PRICE = 59.99;
		final double DISCOUNT_RATE = 0.3;
		double discountedPrice;

		// 할인된 가격을 계산 (비지니스 로직)
		discountedPrice = ORIGINAL_PRICE * (1 - DISCOUNT_RATE);

		int finalPrice = (int)discountedPrice;
		// 최종 가격 정수형으로 출력
		System.out.println("최종 가격 : " + finalPrice);
		System.out.println("최종 가격(소수점) : " + discountedPrice);

	}

}
