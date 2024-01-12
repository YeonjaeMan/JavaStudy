package 최종;

public class bonus_6 {

	public static void main(String[] args) {
		
		int base = 10;
		int n = 2;
		int result = powerN(base, n);
		System.out.println("결과 확인 : " + result);
	}

	public static int powerN(int base, int n) {
		
		return (int)Math.pow(base, n);
	}
}
