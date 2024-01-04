package switch문;

import java.util.Scanner;

public class Ex02자판기프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		int money = sc.nextInt();
		
		System.out.println("메뉴를 고르세요.");
		System.out.print("1.아우터(700원) 2.이구동성(1000원) 3.에그몽(500원) >> ");
		int menu = sc.nextInt();
		int change = money;
		switch (menu) {
		case (1) :
			if (money < 700) {
				System.out.println("돈이 부족해요. ㅠㅠ");
			} else {
				change = money - 700;
			}
			break;
		case (2) :
			if (money < 1000) {
				System.out.println("돈이 부족해요. ㅠㅠ");
			} else {
				change = money - 1000;
			}
			break;
		case (3) :
			if (money < 500) {
				System.out.println("돈이 부족해요. ㅠㅠ");
			} else {
				change = money - 500;
			}
			break;
		default :
			System.out.println("메뉴를 다시 골라주세요.");
		}
		
		System.out.println("잔돈 : " + change + "원");
		
		int ten_hund, five_hund, one_hund = 0;
		ten_hund = change / 1000;
		five_hund = (change % 1000) / 500;
		one_hund = (change % 500) / 100;
		System.out.println("천원 : " + ten_hund + "개, " + "오백원 : " + five_hund + "개, " + "백원 : " + one_hund + "개");
	}

}
