package No5073;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int [] intArr = new int[3];

						
			int a = 0;
			int b = 0;
			int c = 0;
			int max = 0;
			for (int i = 0; i < 3; i++) {
				
				intArr[i] = Integer.parseInt(st.nextToken());
				
				
			
			}
			
			Arrays.sort(intArr);
			
			a = intArr[0];
			b = intArr[1];
			c = intArr[2];

			
			if(a==0 && b==0 && c==0) {
				break;
			}
			
			if(a+b > c) {
				if(a==b) {
					if(b==c) {
						sb.append("Equilateral \n");
					} else {
						sb.append("Isosceles \n");
					}
				} else {
					if(b==c) {
						sb.append("Isosceles \n");
					} else {
						if(a==c) {
							sb.append("Isosceles \n");
							
						} else {
							
							sb.append("Scalene \n");
						}
						
					}
					
				}
				
				
			} else {
				sb.append("Invalid \n");
			}
			
			
		}
		
		System.out.println(sb);
	}

}



