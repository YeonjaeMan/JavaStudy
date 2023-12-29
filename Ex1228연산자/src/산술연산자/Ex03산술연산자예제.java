package 산술연산자;

import java.util.Scanner;

public class Ex03산술연산자예제 {

	public static void main(String[] args) {
		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 정수입력 출력하기 (개행없이)
		System.out.print("정수입력 : ");
		// 3. 정수 입력 받기
		int num = sc.nextInt();
		// 4. 백의자리 이하를 버리기
		// ---> 백의 자리 이하를 버리는 걸 어떻게 머리에서 계산했는지 생각해보기!
		// ---> 코드로 작성하는 게 어려울 거에요!
		num = num - num % 100;
		// 5. 결과값 출력하기
		System.out.println("결과 값 : " + num);
	}

}
