package day3;

import java.util.Scanner;

public class problem_5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		int div = 10000000;
		for(int i = 1; i < 9; i++) {
			sum = sum + (num / div);
			num = num - (num / div) * div;
			div = div / 10;
		}
		System.out.println("합은 " + sum + "입니다.");
	}
}
