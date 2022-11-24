package No2562;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 9개 자연수
		int a;
		
		// 9개 자연수 배열
		int [] arr = new int[9];
		
		for (int i = 0; i < 9; i++) {
			a = sc.nextInt();
			
			arr[i] = a;
		}
		// 최댓 값
		int max = 0;
		// 몇변쨰 수
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				n = i + 1;
				
				
			}
			
			if(i == arr.length -1 ) {
				//최댓값
				System.out.println(max);
				//몇번재수
				System.out.println(n);
			}

			
		}

		
	

		
	}	
}
