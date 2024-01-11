package 메소드;

import java.util.Scanner;

public class Ex05완전수구하기 {

	public static void main(String[] args) {
		
		// 완전수
		// : 자기 자신을 제외한 약수들의 합이 자기 자신인 수!
		// ex) 6 -> 1 + 2 + 3 = 6
		// 	   10 -> 1 + 2 + 5 = 8 (완전수 X)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("num1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 입력 : ");
		int num2 = sc.nextInt();
		boolean divisor = isDivisor(num1, num2);
		System.out.println(divisor);
		
		System.out.println(getSum(7));
		
		System.out.println(isPerfect(6));
	}
	
	// 3. 완전수인지 확인하는 메소드
	// 메소드명 : isPerfect
	// 매개변수 : int 1개
	// 리턴타입 : boolean
	
	private static boolean isPerfect(int n) {
		boolean result = false;
		
		if(getSum(n) == n)
			// n은 완전수!
			result = true;
		
		return result;
	}

	// 2. 자신을 제외한 약수의 총합을 구하는 메소드
	// 메소드명 : getSum
	// 매개변수 : int, 1개
	// 리턴타입 : int
	
	private static int getSum(int n) {
		int result = 0;
		// 1. 입력된 숫자의 약수를 구한다 -> 1 ~ num 중에 num을 제외한 범위
		// 2. 나 자신을 제외한 숫자들의 합을 구한다 ---> 누적합계
		for(int i = 1; i < n; i++) {
			// ** 기존 로직
//			if(n % i == 0)
			// i는 num의 약수 !
//				result += i;
			// ** 메소드를 호출한 로직
			// 메소드 구조 안에 메소드를 새롭게 구현할 수는 없으나
			// 메소드 자체를 호출하여 사용하는 것은 가능하다!
			if(isDivisor(n, i) == true)
				result += i;
		}
		return result;
	}

	// 1. 약수 찾기 메소드
	// 메소드명 : isDivisor
	// 매개변수 : 2개 int
	// 리턴타입 : boolean
	private static boolean isDivisor(int num1, int num2) {
		boolean result = false;
		if(num1 % num2 == 0) {
			result = true;
		}
		return result;
	}
}
