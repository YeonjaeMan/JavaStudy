package day1;

import java.util.Arrays;
import java.util.Scanner;

public class prac {

	public static void main(String[] args) {

		int[][] array = new int[5][5];
		int num = 1;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = array.length - 1; j >= 0; j--) {
				array[j][i] = num++;
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j <array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
