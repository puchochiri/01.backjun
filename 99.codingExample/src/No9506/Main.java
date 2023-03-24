package No9506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 StringBuilder sb = new StringBuilder();

		 while(true) {
			 StringTokenizer st = new StringTokenizer(br.readLine());
			 int first = Integer.parseInt(st.nextToken());
			 
			 if(first == -1) {
				 break;
			 }
			 int [] arr =  new int[first];

			 int sum = 0;
			 
			 int finalindex =0;
			 for (int i = 1; i < first; i++) {
				 
				 if(first%i == 0) {
					 arr[i] = i;
					 sum += i;
					 finalindex =i;
					}	 
				 
			 }	 
				 if(first==sum) {
					 sb.append(first + " = ");
					 for (int j = 0; j <  arr.length; j++) {
						 if(arr[j] != 0) {
							 if(j==finalindex) {
								
								 sb.append(arr[j]);
								 sb.append("\n");
							 } else {
								 sb.append(arr[j] + " + ");
	
							 }
							 
						 }
						 
					}
				
				 } else {
					 sb.append(first + " is NOT perfect. \n");

				 }
				
			
			
			
			 



		}
		System.out.println(sb);
		

	}

}



