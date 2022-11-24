package No10807;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// n 정수의 갯수
		int n;
		
		n = sc.nextInt();
		String a;
		String [] arr;
		
		a = sc.nextLine();
		a = sc.nextLine();
		arr = a.split(" ");
		
		// 찾을려는 수
		int v;
		v = sc.nextInt();
		// 카운트
		int c = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int d = Integer.parseInt(arr[i]);
			if(d == v) {
				c++;
			}
		}
		
		System.out.println(c);
		
		
	}	
}
