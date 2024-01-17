package day6;

import java.util.Iterator;
import java.util.Scanner;

public class problem_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		int[][] array = new int[n][n];
		int num = 1;

		for (int i = 0; i < array.length; i++) {

			if (i % 2 == 0)
				for (int j = 0; j < array.length; j++)
					array[i][j] = num++;
			else
				for (int j = array.length - 1; j >= 0; j--)
					array[i][j] = num++;
	
		}
		
		for(int i = 0; i <array.length; i++) {
			for(int j = 0; j <array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
