package 최종;

import java.util.Scanner;

public class problem_25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		String num = sc.next();
		int sum = 0;

		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) == '0')
				sum += 6;
			else if (num.charAt(i) == '1')
				sum += 2;
			else if (num.charAt(i) == '2')
				sum += 5;
			else if (num.charAt(i) == '3')
				sum += 5;
			else if (num.charAt(i) == '4')
				sum += 4;
			else if (num.charAt(i) == '5')
				sum += 5;
			else if (num.charAt(i) == '6')
				sum += 6;
			else if (num.charAt(i) == '7')
				sum += 3;
			else if (num.charAt(i) == '8')
				sum += 7;
			else if (num.charAt(i) == '9')
				sum += 6;
		}
		
		System.out.println("대시('_')의 총 합 >> " + sum);
	}

}
