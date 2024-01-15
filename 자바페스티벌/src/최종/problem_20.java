package 최종;

import java.util.Scanner;

public class problem_20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		int num = sc.nextInt();
		String result = "";
<<<<<<< HEAD
		
		while(num > 0) {
			result = result + (num % 2);
			num = num / 2;
		}
		
=======

		while(num > 0) {
			result = (num % 10) + " " + result;
			num = num / 10;
		}

>>>>>>> 440e92d1ad1e10e4057afe334311019689584577
		System.out.println(result);
	}

}
