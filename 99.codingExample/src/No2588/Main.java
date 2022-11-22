package No2588;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		int x,y,z;
		a = sc.nextInt();
		b = sc.nextInt();
		for(int i=0; i<3; i++) {
			
			if(i==0) {
				x = b % 10;
				System.out.println(a*x);
			}
			if(i==1) {
				y = (b % 100)/10;
				System.out.println(a*y);
			}
			if(i==2) {
				z = b/100;
				System.out.println(a*z);
				System.out.println(a*b);
			}
			
		}
		
	}	
}
