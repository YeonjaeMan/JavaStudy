package 최종;

import java.util.Scanner;

public class problem_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		int[][] array = new int[n][n];
		int cnt = 1;
		
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < n; j++) {
					array[i][j] = cnt++;
				}
			} else {
				for(int j = n - 1; j >= 0; j--) {
					array[i][j] = cnt++;
				}
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
