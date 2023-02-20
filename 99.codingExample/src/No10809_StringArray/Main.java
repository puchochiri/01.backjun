package No10809_StringArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26];
		
		
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
			
		}
		
		String letter = sc.nextLine();
		
		for (int j = 0; j < letter.length(); j++) {
			char ch = letter.charAt(j);
			if(arr[ch - 'a'] == -1) { // arr 원소 값이 -1인 경우에만 초기화
				arr[ch - 'a'] = j;
			}
			
			
		}
		
		for (int val : arr) {
			System.out.print(val + " ");
		}
		
		
	}
}





