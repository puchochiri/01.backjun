package No1978;

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
		
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;
		for (int i = 0; i < num; i++) {
		
			int check = Integer.parseInt(st.nextToken());
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for (int j = 1; j <= check; j++) {
				if(check%j ==0) {
					arr.add(j);
				}
				
			}
			if(arr.size()==2) {
				count++;
			}
			
		}
		
		
		
		System.out.println(count);
		
		
		
	
	}

}



