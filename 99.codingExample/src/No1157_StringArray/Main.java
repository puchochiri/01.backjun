package No1157_StringArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word = input.next();
		int[] arr = new int[26];
		int check;
		for (int i = 0; i < word.length(); i++) {
			if(65 <= word.charAt(i) && word.charAt(i)<= 90) {
				check = arr[word.charAt(i) - 'A']++;
				//System.out.println("i:" + i + "  " + "check1:" + check);
				
				
				//arr[word.charAt(i) - 65]++;
			} else {
				check = arr[word.charAt(i) - 'a']++;
				//System.out.println("i:" + i + "  " + "check2:" + check);
				//arr[word.charAt(i) - 97]++;
			}
		}
		
		int max = -1;
		char ch = '?';
		
		for (int i = 0; i < 26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char) (i+65);
			} else if (arr[i] == max) {
				ch = '?';

			}
			
			
		}
		System.out.println(ch);
	}
}





