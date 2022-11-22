package No10430;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		for(int i=0; i<3; i++) {
			
			if(i==0) {
				System.out.println((a+b)%c);
			}
			if(i==1) {
				System.out.println(((a%c)+(b%c))%c);
			}
			if(i==2) {
				System.out.println((a*b)%c);
				System.out.println(((a%c)*(b%c))%c);
			}
			
		}
		
	}	
}
