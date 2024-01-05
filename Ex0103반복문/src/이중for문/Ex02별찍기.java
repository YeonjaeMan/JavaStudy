package 이중for문;

public class Ex02별찍기 {

	public static void main(String[] args) {
		int cnt = 1;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < cnt; j++) {
				System.out.print("*");
			}
			cnt++;
			System.out.println();
		}
	}

}
