package basic.ch04;

public class WhileTest2_1 {

	public static void main(String[] args) {

		// 1부터 5까지 덧셈 연산을 하라
		// 1+2+3+4+5
		
		int start = 1;
		int end = 5;
		int sum = 0;
		boolean flag = true;
		
		while(flag) {
			sum += start;
			System.out.println("sum(" + start + "): " + sum);
			if (start == end) {
				flag = false;
			}
			start++;
		}
	}

}
