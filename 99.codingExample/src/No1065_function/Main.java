package No1065_function;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int number = in.nextInt();
		
		System.out.println(machine(number));
		in.close();
		
		
	}
	
	static int machine(int number) {
		
		int cnt = 0;
		
		if (number < 100) {
			return number;
		}
		
		else {
			cnt = 99;
			
			for (int i =100; i <= number; i++) {
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;
				
				if((hun - ten) == (ten - one)) {
					cnt ++;
				}
			}
			
		}
		
		
		return cnt;
		
		
		
		
	}
}