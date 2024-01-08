package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex04가장큰수찾기 {

	public static void main(String[] args) {
		int[] num = new int[5];
		int max = 0;
		Random ran = new Random();
		
		for(int i = 0; i < num.length; i++)
			num[i] = ran.nextInt(10) + 1;

		for(int i = 0; i < num.length; i++)
			if(num[i] > max)
				max = num[i];

		System.out.println("배열 안에 들어있는 값 : " + Arrays.toString(num));
		System.out.println("가장 큰 값은 " + max + "입니다.");
	}

}
