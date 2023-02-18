package No11720_StringArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int sum = 0;
		String str = sc.next();
		sc.close();
		int check;
		
		for (int i = 0; i < a; i++) {
			
			check = str.charAt(i)-'0';
			sum += check;
			
		}
		System.out.println(sum);
		
		
		

	}
}





