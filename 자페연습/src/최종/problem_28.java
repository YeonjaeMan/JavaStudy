package 최종;

public class problem_28 {

	public static void main(String[] args) {
		
//		String str = "01001101";
		String str = "00101000";
		int cnt = 1;
		int sum = 0;
		
		for(int i = str.length() - 1; i >= 0; i--) {
			if(str.charAt(i) == '1') {
				sum += cnt;
			}
			cnt *= 2;
		}
		System.out.println(str + "(2)" + " = " + sum + "(10)");
	}

}
