package structure.ch04;

import java.util.LinkedList;

public class MyLinkedList {

	private Node head; // 요소의 맨 처음을 가리킴
	private int count; // linkedlist의 요소 갯수

	// MyLinkedList 맨 처음 생성시 노드는 없는 상태
	public MyLinkedList() {
		head = null;
		count = 0;
	}

	// 저장된 Node 갯수를 반화하는 메서드
	public int getCount() {
		return count;
	}

	// 새로운 노드(Node)를 1개 추가하는 메서드를 만들자
	public Node addElement(String data) {

		Node createNode = new Node(data);
		if (head == null) {
			// 맨 처음 저장하는 동작
			head = createNode;
		} else {
			// 항상 요소 찾기는 head 부터 시작
			Node preNode = head;
			while (preNode.next != null) {
				preNode = preNode.next;
			}
			// 핵심 코드
			preNode.next = createNode;
		}
		count++;
		return createNode; // 추후 수정
	}

	public Node removeElement(int index) {
		// 방어적 코드
		if (index >= count) {
			System.out.println("삭제할 위치 오류, 현재 리스트 갯수는 " + count + "입니다");
			return null;
		}

		// 맨 앞 요소를 삭제 요청시
		// 항상 요소를 찾을 때 시작은 head부터 시작이다
		Node tempNode = head;
		if (index == 0) {
			// 코드 시작 전 모습
			// [야스오][티모.주소값] --> [티모][null]
			head = tempNode.next;
			// 코드 수행 후 모습
			// [티모][null]
		} else {
			// 코드 시작 전 모습 : position -> 2 이라고 가정 --> n - 1 --> [1]
			// [야스오][티모.주소값] --> [티모][소라카.주소값] --> [소라카][null]
			Node preNode = null;
			for (int i = 0; i < index; i++) {
				preNode = tempNode;
				tempNode = tempNode.next; //
			}
			preNode.next = tempNode.next; // 제거함
		} // end of if
		count--;
//		System.out.println(position + "번째 요소를 삭제 했습니다.");
		return tempNode; // todo - 추후 수정
	}

	// 전체 출력하는 기능 만들기
	public void printAll() {
		if (count == 0) {
			System.out.println("출력할 내용이 없습니다");
			return;
		}
		Node temp = head;
		temp.getData();
		while (temp != null) {
			System.out.print(temp.getData());
			temp = temp.next;
			if (temp != null) {
				System.out.print("-->");
			}
		}
		System.out.println();

	}

	// 지정한 위치의 노드 하나만 출력하기
	public Node getNodeByIndex(int index) {
		if (index >= count) {
			System.out.println("검색 위치 오류 - 잘못된 요청");
			return null;
		}
		Node tempNode = head;
		if (index == 0) {
			return head;
		}
		for (int i = 0; i < index; i++) {
			tempNode = tempNode.next; // 다음 요소는 무조건 next 에 담겨 있다.
		}
		return tempNode;
	}

	// 전체 삭제
	public void removeAll() {
		head = null;
		count = 0;
	}

	// 테스트 코드
	public static void main(String[] args) {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.addElement("야스오");
		linkedList.addElement("티모");
		linkedList.addElement("소라카");
		linkedList.addElement("애쉬");
		linkedList.addElement("가렌");
		linkedList.printAll();

		linkedList.removeElement(1);
		linkedList.printAll();

		System.out.println(linkedList.getNodeByIndex(3).getData());
//		System.out.println(linkedList.getCount());

		linkedList.removeAll();
		linkedList.printAll();

	} // end of main
} // end of class
