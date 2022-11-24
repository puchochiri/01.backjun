package No2480;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int x = 0;
		int max = 0;

		
		
		
		// ab가 같을 때
		if(a==b) {
			
			//bc가 같을 때 ==> 3개가 동일
			if(b==c) {
				
				x = 10000 + a * 1000;
				
		
				
				//bc가 다를때 ==> 2개가 동일
			} else if(b!=c) {
				
				x = 1000 + a * 100;
				
			
				
			}
		// ab가 다를 때
		} else if (a!=b) {
			
			//bc가 같음 ==> 2개가 동일
			if(b==c) {
				
				x = 1000 + b * 100;
				
			// bc가 다름
			} else if(b!=c) {
				
				
				// ac가 같을때 ==> 2개가 동일
				if(a==c) {
					x = 1000 + a * 100;

					// ac가 다를때 ==> 모두 다름
				} else if(a!=c) {
					int [] arr = { a ,b ,c };
					for (int i = 0; i < arr.length; i++) {
						if(arr[i] > max) {
							max = arr[i];
						}
						x = max * 100; 
						
					}

				}
				
			}
			
			
		}
		
		System.out.println(x);
		
	
	
		
	}	
}
