package No2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int input = Integer.parseInt(stringTokenizer.nextToken());
		
		
		int xValue = 2;
		int yValue = 1;
		
		int result = 1;
		
		for (int i = 0; i < input; i++) {
			result = result + 1;

			xValue = xValue + 6 * i;
			yValue = yValue + 6 *(i+1);
			
			
			if(input == 1) {
				result = 1;
				break;
			}
			
			
			if(xValue <= input && input <= yValue) {
	
				break;
			}
			
		}
		
		System.out.println(result);

		
	}
}
