package 최종;

import java.util.Random;

public class problem_18 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int[] array = new int[6];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(50) + 1;
			for(int j = 0; j < i; j++) {
				if(array[i] == array[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.print("행운의 숫자 : " + array[i]);
			System.out.println();
		}
		
	}

}
