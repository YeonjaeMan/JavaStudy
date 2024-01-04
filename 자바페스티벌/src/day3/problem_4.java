package day3;

import java.util.Scanner;

public class problem_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		
		int sum = 1;
		for(int i = 0; i < 7; i++) {
			sum += i;
			System.out.print(sum + " ");
		}
	}

}
