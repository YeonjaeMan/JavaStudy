package 자바페스티벌;

import java.util.Scanner;

public class Pro_27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 채점하기 ====");
		String str = sc.next();
		int score = 0;
		int cnt = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'o') {
				cnt++;
				score += cnt;
			} else {
				cnt = 0;
			}
				
		}
		System.out.println(score);
	}

}
