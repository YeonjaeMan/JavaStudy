package 이중for문;

public class Ex04공포의별찍기 {

	public static void main(String[] args) {
		
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j < i; j++)
				System.out.print(" ");
			for (int j = 0; j < 5 - i; j++)
				System.out.print("*");
			System.out.println();
		}
		
	}

}
