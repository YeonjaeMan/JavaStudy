package dowhile문;

import java.util.Scanner;

public class Ex02몸무게관리프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재몸무게 : ");
		int now = sc.nextInt();
		
		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();
		
		int count = 1;
		
		do {
			System.out.print(count + "주차 감량 몸무게 : ");
			count++;
			
			int weight = sc.nextInt();
			now -= weight;
			
			if(now <= goal)
				System.out.println(now + "kg 달성!! 축하합니다!!");
				
		} while(now > goal);
	}

}
