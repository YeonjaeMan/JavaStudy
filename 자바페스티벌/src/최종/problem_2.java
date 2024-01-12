package 최종;

import java.util.Scanner;

public class problem_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		int total = 0;
		
		if(time > 8) {
			total = (8 * 5000) + (int)((time - 8) * 5000 * 1.5);
		} else {
			total = time * 5000;
		}
		
		System.out.println("총 임금은 " + total + "원 입니다.");
		
	}

}
