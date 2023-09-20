package No1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		
		//BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int input = Integer.parseInt(stringTokenizer.nextToken());
		
		int sum = 2;
		int count = 0;
		
		int x = 0;
		int y = 0;
		
		Loop1 :
		for (int i = 0; i < input; i++) {

			if(sum%2 == 0) {
				//Â¦¼ö
				x = sum -1;
			    y = 1;
			    if(x == 1) {
			    	count = count + 1;
			    	
			    } else {
				    for (int j = 0; j < sum - 1; j++) {
			    		if(x != 0) {
			    			count = count + 1;
			    		}
			    		if(count == input) {
			    			break Loop1;
			    		}

				    	if(x <= sum-1 && x >= 1) {

				    		if(x != 1) {
					    		x--;
					    		y++;
				    		}

				    		

				    	} 
					}
			    	
			    }
			    

				
				
			} else {
				//È¦¼ö
				x = 1;
			    y = sum - 1;
			    if(y == 1) {
			    	count = count + 1;
			    } else {
				    for (int j = 0; j < sum - 1; j++) {
				    	
			    		if(y != 0) {
			    			count = count + 1;
			    		}
			    		if(count == input) {
			    			break Loop1;
			    		}
				    	if(y <= sum - 1 && y >= 1) {
			
				    		if(y != 1) {
					    		x++;
					    		y--;
				    		}




				    	}
					}
			    	
			    }
			    

			}
			

			
		
			
			
			++sum;
		}

		System.out.println(x + "/" + y);
		

		
	}
}


