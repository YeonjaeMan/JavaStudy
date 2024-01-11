package day5;

import java.util.Scanner;

public class problem_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 채점하기 ====");
		String str = sc.next();
		
		int sum = 0;
		int score = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == 'o') {
				score++;
			} else if(str.charAt(i) == 'x') {
				score = 0;
			}
			sum += score;
			
//			if(i == 0) {
//				sum += score;
//				continue;
//			}
//			
//			if(str.charAt(i-1) == 'o' && str.charAt(i) == 'o') {
//				score++;
//				sum += score;
//			} else if (str.charAt(i) == 'o') {
//				sum++;
//			} else {
//				score = 1;
//			}
		}
		System.out.println(sum);
	}

}
