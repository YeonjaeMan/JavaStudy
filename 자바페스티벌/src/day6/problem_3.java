package day6;

import java.util.Scanner;

public class problem_3 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int n = sc.nextInt();
		
		int[][] array = new int[5][5];
		int num = 1;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = array.length - 1; j >= 0; j--) {
				array[j][i] = num++;
			}
		}

		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
