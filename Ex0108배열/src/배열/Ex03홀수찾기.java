package 배열;

import java.util.ArrayList;
import java.util.Random;

public class Ex03홀수찾기 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		int cnt = 0;
		Random ran = new Random();
		
		System.out.print("array에 들어있는 홀수는 ");
		for(int i = 0; i < arr.length; i++) {
			int randNum = ran.nextInt(100) + 1;
			arr[i] = randNum;
			if(arr[i] % 2 == 1) {
				System.out.print(arr[i] + " ");
				cnt++;
			}
		}
		
		System.out.println("이며,");
		System.out.println("총" + cnt + "개 입니다.");
	}

}
