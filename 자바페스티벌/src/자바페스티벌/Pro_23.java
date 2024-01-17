package 자바페스티벌;

public class Pro_23 {

	public static void main(String[] args) {
		
		int[][] array = new int[5][5];
		int num = 1;
		
		for(int i = 0; i <array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				array[i][j] = num++;
			}
		}
		
		for(int i = array.length - 1; i >= 0; i--) {
			for(int j = 0; j < array.length; j++) {
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
		}
	}

}
