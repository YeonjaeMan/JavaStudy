package 최종;

import java.util.Random;
import java.util.Scanner;

public class problem_29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int chance = 0;
		
		while(chance < 5) {
			int num1 = rand.nextInt(10);
			int num2 = rand.nextInt(10);
			
			System.out.print(num1 + " + " + num2 + " = ");
			int input = sc.nextInt();
			
			if(num1 + num2 == input) {
				System.out.println("SUCCESS!");
			}
			else {
				System.out.println("Fail...");
				chance++;
			}
			
			if(chance == 5) {
				System.out.println("GAME OVER!");
			}
			
		}
	}

}
