package 최종;

import java.util.Arrays;
import java.util.Scanner;

public class problem_30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 알파벳 빈도수 구하기 ====");
		System.out.print("입력 >> ");
		String input = sc.nextLine(); // 엔터 칠 때까지 입력받아옴(.next()는 띄어쓰기 뒤는 안가져옴)
		input = input.toLowerCase(); // 대소문자 구별하기위해 문자열 모두 소문자로 바꿈

		int[] array = new int[26];
		
		for(int i = 0; i < input.length(); i++) {
			for(int j = 97; j < 123; j++) { // 소문자 a ~ z 는 아스키 코드표로 97 ~ 122
				if(input.charAt(i) == (char)j) {
					array[j - 97]++;
					break;
				}
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println((char)(i + 97) + " : " + array[i]);
		}
	}

}
