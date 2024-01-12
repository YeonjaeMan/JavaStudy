package 최종;

import java.util.Scanner;

public class problem_15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		int hang = 1;
		
		for(int i = 1; i <= n; i++) {
			System.out.print(hang + " ");
			hang += i;
		}
		
	}

}
