package 최종;

import java.util.Scanner;

public class problem_27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 채점하기 ====");
		String input = sc.next();
		
		int score = 0;
		int total = 0;
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == 'o') {
				score++;
			} else if(input.charAt(i) == 'x') {
				score = 0;
			}
			total += score;
		}
		
		System.out.println(total);
	}

}
