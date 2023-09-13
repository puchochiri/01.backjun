package No10101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		ArrayList<Integer> angleArrayList =  new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			int angle = Integer.parseInt(br.readLine());
			angleArrayList.add(angle);
		}
		
		int a = angleArrayList.get(0);
		int b = angleArrayList.get(1);
		int c = angleArrayList.get(2);
		
		if((a + b + c) == 180) {

			if(a==b) {
				
				if(a==c) {
					System.out.println("Equilateral");
				}  else {
					System.out.println("Isosceles");
				}
				
			} else if(a!=b) {
				if(a==c) {
					System.out.println("Isosceles");
				} else {
					if(b==c) {
						System.out.println("Isosceles");
					} else {
						System.out.println("Scalene");
					}
					
					
				}
				
			}
			
		} else {
			System.out.println("Error");
		}
		
		
			
		
		
		
	
	}

}



