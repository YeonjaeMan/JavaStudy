package for문;

import java.util.Scanner;

public class Ex04구구단 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 입력 : ");
		int num = sc.nextInt();
		
		System.out.print("어느 단까지 출력 : ");
		int dan = sc.nextInt();
		
		for(int i = 1; i <= dan; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}

}
