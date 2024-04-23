package exercise;

import java.util.Scanner;

public class PhoneBookManager {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PhoneBook[] phonebook = new PhoneBook[100];

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_NAME = "3";
		final String SEARCH_BY_PHONENUMBER = "4";
		final String MODIFY = "5";
		final String DELETE_ALL = "6";
		final String DELETE_BY_NAME = "7";
		final String END = "0";

		boolean flag = true;

		while (flag) {

			System.out.println("----- 전화번호부 메뉴 선택 -----");
			System.out.println("1.저장 2.전체조회 3.이름조회 4.번호조회 5.수정 6.전체삭제 7.연락처삭제 0.종료");
			String selectedNumber = sc.nextLine();
			if (selectedNumber.equals(SAVE)) {
				PhoneBook.save(sc, phonebook);
			} else if (selectedNumber.equals(SEARCH_ALL)) {
				PhoneBook.searchAll(phonebook);
			} else if (selectedNumber.equals(SEARCH_BY_NAME)) {
				PhoneBook.searchByName(sc, phonebook);
			} else if (selectedNumber.equals(SEARCH_BY_PHONENUMBER)) {
				PhoneBook.searchByPhoneNumber(sc, phonebook);
			} else if (selectedNumber.equals(MODIFY)) {
				PhoneBook.modify(sc, phonebook);
			} else if (selectedNumber.equals(DELETE_ALL)) {
				PhoneBook.deleteAll(phonebook);
			} else if (selectedNumber.equals(DELETE_BY_NAME)) {
				PhoneBook.deleteByName(sc, phonebook);
			} else if (selectedNumber.equals(END)) {
				System.out.println("프로그램을 종료합니다");
				flag = false;
			} else {
				System.out.println(">> 잘못된 선택입니다. <<");
			}

		}

	} // end of main

} // end of class
