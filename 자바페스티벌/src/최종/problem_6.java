package 최종;

public class problem_6 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i < 78; i++) {
			sum = sum + (i * (78 - i));
		}
		
		System.out.println(sum);
		
	}

}
