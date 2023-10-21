package No1436;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	private void solution1436() {
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			//ÀÔ·Â°ª
			int inputNum = Integer.parseInt(stringTokenizer.nextToken());
			
			int  comNum = 665;
			
			int threeCount =0;
			
			while(threeCount != inputNum) {
				comNum++;
				if(String.valueOf(comNum).contains("666")) {
					threeCount++;
				}
				
				
			}
			System.out.println(comNum);
		
		} catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public static void main(String[] args) {
		new Main().solution1436();
		
	}
	
	
}