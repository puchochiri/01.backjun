package No2525;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		// 입력값 : 현재시,현재분,걸리는 시간
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		
		int d,e;
		// d 걸리는 시간
		d = c/60;
		// e 걸리는 분
		e = c%60;

		
		//결과 시간, 결과 분
		int f,g;
		f = a + d;
		g = b + e;

		if(g >= 60) {
			// 올림후 시간, 분
		
			
			int h,i;
			h = g/60;
			i = g%60;
			
			f = f + h;
			g = i;

		}
		
		if(f >= 24) {
			f = f - 24;
		}
		System.out.println(f);
		System.out.println(g);
		
	}	
}
