package No9086_StringArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String [] arr = new String[num];
		
		for (int i = 0; i < num; i++) {
			String input = sc.next();
			arr[i] = input;
			// String 
			
		}
		for (int i = 0; i < arr.length; i++) {
			String string = arr[i];
			// 첫글짜 마지막글자
			char firstLetter = string.charAt(0);
			char lastLetter = string.charAt(string.length() -1);
			char[] charArray = new char[2];
			charArray[0] = firstLetter;
			charArray[1] = lastLetter;
			
			String assy = new String(charArray);
			
			System.out.println(assy);
			
		}
		

	}
}





