package day5;

import java.util.Scanner;

public class problem_7 {

	public static void main(String[] args) {

		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번째 수 입력 : ");
			array[i] = sc.nextInt();
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		
		System.out.println("정렬 후");
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}

}
