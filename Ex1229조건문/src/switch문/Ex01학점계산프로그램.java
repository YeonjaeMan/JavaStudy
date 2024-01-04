package switch문;

import java.util.Scanner;

public class Ex01학점계산프로그램 {

	public static void main(String[] args) {
		// 1. 입력 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 입력받기
		System.out.print("점수 입력 : ");
		int totalScore = sc.nextInt();
		// 3. 학점 계산하기 ---> switch문
		char grade = 'A';
		switch (totalScore / 10) {
		case 9 :
			grade = 'A';
			break;
		case 8 :
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		default :
			grade = 'D';
			break;
		}
		System.out.println(grade + "학점입니다!");
	}

}
