package No2720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader brbr = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stst = new StringTokenizer(brbr.readLine());
		
		int n = Integer.parseInt(stst.nextToken());
		// n == 0 ==> 4
		int r = 2;
		int num = 2;
		for (int i = 0; i < n ; i++) {
			num = (r + (r -1));
			r = num;
		
			
			
		}
		// n == 1 ==> 9
		// n == 1 ==> 9
		
		int answer = (int) Math.pow((num), 2);
		System.out.println(answer);
		
				
				

		
		
	}
}
