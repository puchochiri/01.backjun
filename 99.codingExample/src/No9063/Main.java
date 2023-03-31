package No9063;

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
		
		int [] xArr = new int[num];
		int [] yArr = new int[num];
			
			
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			xArr[i] = Integer.parseInt(st.nextToken());
			yArr[i] = Integer.parseInt(st.nextToken());
		}
		

		Arrays.sort(xArr);	
		Arrays.sort(yArr);	
		

			
		System.out.println((xArr[num -1] - xArr[0]) * (yArr[num -1] - yArr[0]));
	}

}



