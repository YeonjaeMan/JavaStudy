package day1;

import java.util.Scanner;

public class problem_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		int money = 5000;
		int total = 0;
		if (time > 8) {
			total = (int)(money * 8 + money * 1.5 * (time - 8));
		} else {
			total = money * time;
		}
		System.out.println("총 임금은 " + total + "원 입니다.");
	}

}
