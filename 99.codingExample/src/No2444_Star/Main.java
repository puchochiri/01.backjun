package No2444_Star;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int input = in.nextInt();
		
		int inputRevise = input * 2 -1;
		
		
		for (int i = 1; i <= inputRevise; i++) {
			
			for (int j = 1; j <= inputRevise; j++) {
				int check = Math.abs(j - input);
				
				if(i<=input) {
					if(check <= i-1) {
						System.out.print("*");
						
						
					} else {
						System.out.print(" ");
					}
				
					
				} else {
					int overInput = Math.abs(i - input - input);
					
					int check1 = Math.abs(j - input);
					
					
					if(check1 <= overInput-1) {
						
						System.out.print("*");
						
					} else {
						System.out.print(" ");
					}
				}
					
			}
			if(i<input * 2 -1 ) {
				System.out.println();
				
			}
			
			
			
		}
		
		
	}
		
}
