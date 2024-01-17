package 최종;

public class problem_13 {

	public static void main(String[] args) {
		
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		
		for(int i = 0; i < score.length(); i++) {
			if(score.charAt(i) == 'A')
				a++;
			else if(score.charAt(i) == 'B')
				b++;
			else if(score.charAt(i) == 'C')
				c++;
			else if(score.charAt(i) == 'D')
				d++;
			else if(score.charAt(i) == 'F')
				f++;
		}
		
		System.out.println("A : " + a + "명");
		System.out.println("B : " + b + "명");
		System.out.println("C : " + c + "명");
		System.out.println("D : " + d + "명");
		System.out.println("F : " + f + "명");
		
	}

}
