package exercise;

import java.util.Iterator;
import java.util.Scanner;

public class PhoneBook {

	private String name;
	private String phoneNumber;

	public PhoneBook(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// 저장
	public static void save(Scanner sc, PhoneBook[] phonebook) {
		int indexCount = PhoneBook.indexCount(phonebook);
		if (indexCount >= phonebook.length) {
			System.out.println("=========================================");
			System.out.println("더 이상 연락처를 저장할 공간이 없습니다.");
			System.out.println("=========================================");
			return;
		}

		System.out.println(">>> 연락처 저장하기");
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		System.out.println("번호 입력 : ");
		String phoneNumber = sc.nextLine();
		PhoneBook phoneBook = new PhoneBook(name, phoneNumber);

		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i] == null) {
				phonebook[i] = phoneBook;
				break;
			}
		}
		System.out.println("=========================================");
		System.out.println("연락처가 저장 되었습니다");
		System.out.println("=========================================");
	}

	// 전체 조회
	public static void searchAll(PhoneBook[] phonebook) {
		System.out.println(">>> 전체 조회하기 실행");

		int indexCount = PhoneBook.indexCount(phonebook);
		System.out.println("연락처가 " + indexCount + "개 있습니다");
		System.out.println("=========================================");
		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i] != null) {
				System.out.println(phonebook[i].getName() + "\t" + phonebook[i].getPhoneNumber());
			}
		}
		System.out.println("=========================================");

	}

	// 이름 조회
	public static void searchByName(Scanner sc, PhoneBook[] phonebook) {
		System.out.println(">>> 연락처 찾기");
		System.out.println("누구의 연락처를 찾을까요?(이름 입력)");
		String name = sc.nextLine();

		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i] != null && phonebook[i].getName().equals(name)) {
				System.out.println("=========================================");
				System.out.println(phonebook[i].getName() + "\t" + phonebook[i].getPhoneNumber());
				System.out.println("=========================================");
				return;
			}
		}
		System.out.println("=========================================");
		System.out.println("해당 이름의 연락처가 없습니다");
		System.out.println("=========================================");

	}

	// 연락처 조회
	public static void searchByPhoneNumber(Scanner sc, PhoneBook[] phonebook) {
		System.out.println(">>> 연락처 찾기");
		System.out.println("어떤 번호의 이름을 찾을까요?(번호 입력)");
		String phoneNumber = sc.nextLine();

		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i] != null && phonebook[i].getPhoneNumber().equals(phoneNumber)) {
				System.out.println("=========================================");
				System.out.println(phonebook[i].getName() + "\t" + phonebook[i].getPhoneNumber());
				System.out.println("=========================================");
				return;
			}
		}
		System.out.println("=========================================");
		System.out.println("해당 번호의 연락처가 없습니다");
		System.out.println("=========================================");

	}

	// 수정
	public static void modify(Scanner sc, PhoneBook[] phonebook) {
		System.out.println(">>> 연락처 수정");
		System.out.println("누구의 연락처를 수정할까요(이름 입력)");
		String name = sc.nextLine();

		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i] != null && phonebook[i].getName().equals(name)) {
				System.out.println("현재 연락처 : " + phonebook[i].getName() + "\t" + phonebook[i].getPhoneNumber());
				System.out.println("어떤 이름으로 수정할까요?");
				String modifyName = sc.nextLine();
				phonebook[i].setName(modifyName);
				System.out.println("어떤 번호로 수정할까요?");
				String modifyPhoneNumber = sc.nextLine();
				phonebook[i].setPhoneNumber(modifyPhoneNumber);
				System.out.println("=========================================");
				System.out.println(">>> 수정 완료");
				System.out.println("=========================================");
				return;
			}
		}
		System.out.println("해당 이름의 연락처가 없습니다");

	}

	// 전체 삭제
	public static void deleteAll(PhoneBook[] phonebook) {
		System.out.println("=========================================");
		System.out.println(">>> 전체 삭제 완료");
		System.out.println("=========================================");
		for (int i = 0; i < phonebook.length; i++) {
			phonebook[i] = null;
		}
	}

	// 연락처 삭제
	public static void deleteByName(Scanner sc, PhoneBook[] phonebook) {
		System.out.println("누구의 연락처를 삭제할까요?(이름 입력)");
		String name = sc.nextLine();

		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i] != null && phonebook[i].getName().equals(name)) {
				System.out.println("=========================================");
				System.out.println(">>> 해당 연락처 삭제 완료");
				System.out.println("=========================================");
				phonebook[i] = null;
				return;
			}
		}
		System.out.println("해당 이름의 연락처가 없습니다");
	}

	// 연락처 개수
	public static int indexCount(PhoneBook[] phonebook) {
		int indexCount = 0;
		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i] != null) {
				indexCount++;
			}
		}
		return indexCount;
	}
}
