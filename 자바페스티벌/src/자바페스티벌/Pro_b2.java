package 자바페스티벌;

public class Pro_b2 {

	public static void main(String[] args) {
		
		System.out.println(getMiddle("power"));
		
	}

	private static String getMiddle(String str) {
		
		String result = "";
		
		if(str.length() % 2 == 0) {
			result = result + str.charAt(str.length() / 2 - 1) + str.charAt(str.length() / 2);
		} else {
			result = result + str.charAt(str.length() / 2);
		}
		
		return result;
	}
}
