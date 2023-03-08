package No2444_Star_review;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int input = in.nextInt();
		
		StringBuilder sb = new StringBuilder();
	
		for (int i = 1; i <= input; i++) {
		//	sb.append(i);
			for (int j = 1; j <= input-i; j++) {
			//	sb.append(j);
				sb.append(" ");
				
			}
			for (int j = 1; j <= 2*i-1; j++) {
			//	sb.append(j);
				sb.append("*");
				
			}
			
			
			sb.append("\n");
		}
		
		//    123456789
		// 1  ----*
		// 2  ---***
		// 3  --*****
		// 4  -*******
		// 5  *********
		//    123456789
		// 6  -*******
		// 7  --*****
		// 8
		// 9
		
		for (int i = input+1; i <= input*2 -1; i++) {
		//	sb.append(i);
			
			for (int j = 1; j <= i - input; j++) {
	//			sb.append(j);

				sb.append(" ");
			}
			for (int j = 1; j <= (input - (i -input))*2 -1 ; j++ ) {
//				sb.append(j);
				
				
				
				sb.append("*");

			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		
				
			
			
		}
		
		
	}
		
