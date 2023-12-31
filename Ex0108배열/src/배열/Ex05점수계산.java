package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05점수계산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print((i+1) + "번째 입력 >> ");
			array[i] = sc.nextInt();
		}
		
		int max = array[0];
		int min = array[0];
		int sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(max < array[i])
				max = array[i];
			if(min > array[i])
				min = array[i];
			
			sum += array[i];
		}
		
		System.out.println("입력된 점수 : " + Arrays.toString(array));
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (double)sum / array.length);
		
	}

}
