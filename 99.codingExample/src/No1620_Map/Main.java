package No1620_Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		//System.out.println(n);
		//System.out.println(m);
		HashMap<String, Integer> nameMap = new HashMap<String, Integer>();
		String[] nameArr = new String[n + 1];
		StringBuilder sb = new StringBuilder();
		
		// 입력
		for (int i = 1; i < n+1 ; i++) {
			String name = br.readLine();
			nameMap.put(name, i);
			nameArr[i] = name;
		}
		//System.out.println(nameMap);
		//System.out.println(Arrays.asList(nameArr));
		
		
		while(m --> 0) {
			String findStr = br.readLine();
			if(isStringNumber(findStr)) { // 숫자(인덱스)를 입력받은 경우
				int index = Integer.parseInt(findStr);
				sb.append(nameArr[index]);
				
			} else { // 문자열을 입력받은경우
				 sb.append(nameMap.get(findStr));
				
			}
			sb.append("\n");
			
		}
		
		System.out.println(sb.toString());
	
		

	}

	private static boolean isStringNumber(String findStr) {
		try {
			Double.parseDouble(findStr);
			return true;
		} catch (NumberFormatException e) {
			return false;
			
		}
	}
}





