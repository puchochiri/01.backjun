package No10798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char [][] arr = new char[5][15];
		int max = 0;
		
		
		for (int i = 0; i < 5; i++) {
			 String test = br.readLine();
			 if(max < test.length()) max = test.length();
			 
			 
			 for (int j = 0; j < test.length(); j++) {
				arr[i][j] = test.charAt(j);
			}

		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < 5; j++) {
				if (arr[j][i] == '\0') { 
					continue;
					
				}
				sb.append(arr[j][i]);
				
			}

		}
		System.out.println(sb);

	}
}
