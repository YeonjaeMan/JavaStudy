package day2;

import java.util.Random;
import java.util.Scanner;

public class problem_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int count = 0;
		while(count < 5) {
			int num1 = rand.nextInt(10);
			int num2 = rand.nextInt(10);
			System.out.print(num1 + " + " + num2 + " = ");
			int answer = sc.nextInt();
			if(answer == (num1 + num2)) {
				System.out.println("SUCCESS!");
			} else {
				System.out.println("Fail...");
				count++;
				if(count == 5)
					System.out.println("GAME OVER!");
			}
		}
	}

}
