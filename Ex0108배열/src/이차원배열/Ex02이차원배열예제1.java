package 이차원배열;

public class Ex02이차원배열예제1 {

	public static void main(String[] args) {
		
		int[][] array = new int[5][5];
		int num = 20;
		
		for (int i = 0; i < array.length; i++) {
			num++;
			for (int j = 0; j < array.length; j++) {
				array[i][j] = num + (j * 5);
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
