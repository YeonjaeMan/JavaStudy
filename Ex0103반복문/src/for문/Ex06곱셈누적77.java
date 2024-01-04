package for문;

public class Ex06곱셈누적77 {

	public static void main(String[] args) {
		int answer = 0;
		for(int i = 1; i < 78; i++) {
			answer = answer + i * (78 - i);
		}
//		int sum = 0;
//		for(int i = 77; i >= 1; i--) {
//			sum = i * (78 - i);
//			answer = answer + sum;
//		}
		System.out.println(answer);
	}

}
