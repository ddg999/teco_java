package exercise;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {

		System.out.println("성적을 입력하세요 (0-100)");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char grade = 'X';
		String Message = "";
		
		if (score <= 100 && score >= 90) {
			grade = 'A';
			Message = "우수한 성적이네요! 계속 좋은 성적 유지하길 바랍니다.";
		} else if (score < 90 && score >= 80) {
			grade = 'B';
			Message = "좋은 성적입니다. 조금만 더 노력하면 A도 가능해요!";
		} else if (score < 80 && score >= 70) {
			grade = 'C';
			Message = "괜찮은 성적이지만, 더 높은 등급을 위해 노력해봅시다.";
		} else if (score < 70 && score >= 60) {
			grade = 'D';
			Message = "학습에 더 집중할 필요가 있어요. 도움이 필요하면 말해주세요.";
		} else if (score < 60 && score >= 0) {
			grade = 'F';
			Message = "불합격입니다. 부족한 부분을 파악하고, 추가 학습이 필요해요.";
		} else {
			Message = "잘못된 입력입니다. 성적은 0에서 100사이로 입력해주세요";
		}

		System.out.println("'" + grade + "'" + " 학점: " + "\"" + Message + "\"");

		sc.close();
	}

}
