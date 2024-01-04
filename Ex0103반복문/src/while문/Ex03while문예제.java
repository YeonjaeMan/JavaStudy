package while문;

import java.util.Scanner;

public class Ex03while문예제 {

	public static void main(String[] args) {
		// 1. 입력받는 도구 꺼내기
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int sum = 0;
		while (true) {
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			sum += input;
			System.out.println("누적결과 : " + sum);
			if(input == -1) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}

}
