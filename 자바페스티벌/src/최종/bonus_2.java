package 최종;

public class bonus_2 {

	public static void main(String[] args) {
		
		System.out.println(getMiddle("test"));
		
	}

	private static String getMiddle(String str) {
		String result = "";
		int index = 0;
		
		if(str.length() % 2 == 0) {
			index = str.length() / 2;
			result = result + str.charAt(index - 1) + str.charAt(index);
		} else {
			index = str.length() / 2;
			result = result + str.charAt(index);
		}
		
		return result;
	}
}
