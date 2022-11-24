package No2530;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// x: 영수증에 적힌 총 금액
		// n: 영수증에 적힌 물건 종류 수
		// a: 물건의 가격
		// b: 물건의 갯수
		// c: 계산값
		int x,n,a,b;
		
		x = sc.nextInt();
		n = sc.nextInt();

		int c = 0;
		boolean d = false;
		
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c += a * b;
		}
		
		d = x == c;
		if(d) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
			
		}
		
	}	
}
