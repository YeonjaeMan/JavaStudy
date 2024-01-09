package day5;

import java.util.Arrays;
import java.util.Random;

public class problem_3 {

	public static void main(String[] args) {
		int[] array = new int[6];
		Random ran = new Random();
		
		for(int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(50) + 1;
			
			for(int j = 0; j < i; j++) {
				if(array[i] == array[j]) {
					i--;
					break;
				}
			}
			System.out.println(Arrays.toString(array));
			System.out.println("행운의 숫자 : " + array[i]);
		}
	}

}
