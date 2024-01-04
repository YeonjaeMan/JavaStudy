package day3;

public class problem_2 {

	public static void main(String[] args) {
		int answer = 0;
		for(int i = 1; i < 78; i++) {
			answer = answer + i * (78 - i);
		}
		System.out.println(answer);
	}

}
