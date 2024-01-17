package day1;

import java.util.Scanner;

public class problem_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총금액 입력 : ");
		int money = sc.nextInt();
		
		System.out.println("잔돈 : " + money + "원");
		int money1 = money / 10000;
		int money2 = (money % 10000) / 5000;
		int money3 = (money % 5000) / 1000;
		int money4 = (money % 1000) / 500;
		int money5 = (money % 500) / 100;
		
		System.out.println("10000원 : " + money1 + "개");
		System.out.println("5000원 : " + money2 + "개");
		System.out.println("1000원 : " + money3 + "개");
		System.out.println("500원 : " + money4 + "개");
		System.out.println("100원 : " + money5 + "개");
	}

}
