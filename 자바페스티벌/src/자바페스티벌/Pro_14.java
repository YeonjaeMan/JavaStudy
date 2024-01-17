package 자바페스티벌;

import java.util.Random;
import java.util.Scanner;

public class Pro_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 N 입력 : ");
		int n = sc.nextInt();
		int[][] array = new int[n][n];
		int num = 1;
		
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < n; j++) {
					array[i][j] = num++;
				}
			} else {
				for(int j = n - 1; j >= 0; j--) {
					array[i][j] = num++;
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
