package day1;

import java.util.Scanner;

public class problem_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num % 10 <= 4) {
			num = num - (num % 10);
		} else {
			num = num + (10 - num % 10);
		}
		
		System.out.println("반올림 수 : " + num);
	}

}
