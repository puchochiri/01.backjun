package No10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main2 {
	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		//int n = Integer.parseInt(st.nextToken());
		//int m = Integer.parseInt(st.nextToken());
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());
		System.out.println(n);
		
		// 상근이 숫자 카드
		String [] arr = new String[n];
		for (int i = 0; i < n-1; i++) {
			String findStr = st.nextToken();
			arr[i] = findStr;
			System.out.println(findStr);
			
		}
		System.out.println(Arrays.asList(arr));
		
		int m = Integer.parseInt(st.nextToken());
		

		System.out.println(m);
		
		String [] totalarr = new String[m];
		for (int i = 0; i < m-1; i++) {
			String findStr = st.nextToken();
			totalarr[i] = findStr;
			System.out.println(findStr);
			
		}
		System.out.println(Arrays.asList(totalarr));

		
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(arr[i].equals(totalarr[j])) {
					sb.append(1 + " ");
				} else {
					sb.append(0 + " ");
				}
				
			}
			
		}
		System.out.println(sb);
		
		
	}
}





