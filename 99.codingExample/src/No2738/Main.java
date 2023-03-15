package No2738;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] arr = new int [N][M];
		
		    
		for (int j = 0; j < N; j++) {
			for (int j2 = 0; j2 < M; j2++) {
				arr[j][j2] += sc.nextInt();
				
			}
		}
		
		int[][] arr2 = new int [N][M];
		for (int j = 0; j < N; j++) {
			for (int j2 = 0; j2 < M; j2++) {
				arr2[j][j2] += sc.nextInt();
				
			}
		}
		
		int first =0;
		int second =0;
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				first = arr[i][j];
				second = arr2[i][j];
				
				sum = first + second;
				System.out.print(sum + " ");
				
			}
			System.out.println();
			
		}
		
		

	}
}





