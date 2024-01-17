package day3;

public class problem_1 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i < 101; i++) {
			
			if(i % 2 == 0) {
				sum -= i;
				System.out.print("-"+ i + " ");
			} else {
				sum += i;
				System.out.print(i + " ");
			}
			
		}
		System.out.println();
		System.out.print("결과 : " + sum);
	}

}
