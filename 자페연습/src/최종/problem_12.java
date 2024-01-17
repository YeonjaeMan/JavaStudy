package 최종;

import java.util.Scanner;

public class problem_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		int[][] array = new int[n][n];
		int cnt = 1;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				array[j][i] = cnt++;
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
