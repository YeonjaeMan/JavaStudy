package 최종;

import java.util.Scanner;

public class problem_24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 >> ");
		int n = sc.nextInt();
		System.out.print("X 입력 >> ");
		int x = sc.nextInt();
		
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print((i + 1) + "번째 정수 입력 >> ");
			array[i] = sc.nextInt();
		}
		
		System.out.print("결과 >> ");
		for(int i = 0; i < n; i++) {
			if(array[i] < x) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
