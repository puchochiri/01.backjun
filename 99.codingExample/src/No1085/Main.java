package No1085;

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
		StringTokenizer st  = new StringTokenizer(br.readLine());
		
		
		int [] arr =  new int[4];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int [] resultArr =  new int[4];
		for (int i = 0; i < resultArr.length; i++) {
			if(i == 0) {
				resultArr[i] = arr[0];
			} else if (i == 1) {
				resultArr[i] = arr[1];
			} else if (i == 2) {
				resultArr[i] = arr[2] - arr[0];
			} else if (i == 3) {
				resultArr[i] = arr[3] - arr[1];
			}
			
		}
		
		
		
		int shortest = 1000;
		for (int i = 0; i < resultArr.length; i++) {
			for (int j = i + 1; j < resultArr.length; j++) {
				if(resultArr[i] <= shortest) {
					if(resultArr[i] <= resultArr[j]) {
						shortest = resultArr[i];
					} else {
						shortest = resultArr[j];
					}
				}
			}
			
		}
		
		System.out.println(shortest);
		
		
	}

}



