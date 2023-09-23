package No24262;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int a = Integer.parseInt(stringTokenizer.nextToken());
		int b = Integer.parseInt(stringTokenizer.nextToken());
		int v = Integer.parseInt(stringTokenizer.nextToken());
		int stack = 0;
		
		int day = (v - b) / (a -b);
		
		if((v - b) % (a - b) != 0) {
			day++;
		}
		
		
		System.out.println(day);
	
	}
}
