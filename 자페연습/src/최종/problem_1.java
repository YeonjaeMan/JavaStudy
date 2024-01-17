package 최종;

import java.util.Scanner;

public class problem_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int now = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();
		int week = 0;
		
		while(now >= goal) {
			week++;
			System.out.print(week + "주차 감량 몸무게 : ");
			int minus = sc.nextInt();
			
			now = now - minus;
		}
		
		System.out.println(now + "kg 달성!! 축하합니다!");
		
	}

}
