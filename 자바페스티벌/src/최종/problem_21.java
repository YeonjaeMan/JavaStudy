package 최종;

import java.util.Arrays;

public class problem_21 {

	public static void main(String[] args) {
		
		int[] point = {11,2,6,5};
		int min = point[0];
		int[] index = new int[2];
		
		for(int i = 0; i < point.length; i++) {
			for(int j = i + 1; j < point.length; j++) {
				int dist = point[i] - point[j];
				dist = Math.abs(dist);
				
				if(min > dist) {
					min = dist;
					index[0] = i;
					index[1] = j;
				}
			}
		}
		
		System.out.println("result = " + Arrays.toString(index));
	}

}
