package useful;

public class StringBufferTest {

	public static void main(String[] args) {

		String str1 = new String("Hello");
		String str2 = new String("World");

		StringBuffer bufferStr = new StringBuffer("Hello");
		System.out.println(bufferStr);
		System.out.println(System.identityHashCode(bufferStr)); // 원시 주소값

		bufferStr.append(str2); // 문자열 추가하기
		System.out.println(bufferStr);
		System.out.println(System.identityHashCode(bufferStr));

		// 1번 결과와 2번 결과에 주소값이 같다라는 의미는
		// 새로운 메모리를 할당 한 것이 아닌 변경한 것이다.

		// 활용
		String newStr = bufferStr.toString(); // toString 호출시 타입 -> String

		System.out.println(newStr);

	} // end of main

}
