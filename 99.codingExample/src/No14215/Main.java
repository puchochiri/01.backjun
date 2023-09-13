package No14215;

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
		
		String input = br.readLine();
		
		int [] inArr = new int[3];
		
		StringTokenizer st = new StringTokenizer(input);
		int result = 0;
		for (int i = 0; i < inArr.length; i++) {
			inArr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(inArr);
	 	
		if(inArr[2] >= (inArr[0] + inArr[1])) {
			result = inArr[0] *2 + inArr[1]* 2 -1;
		} else {
			result = inArr[0] + inArr[1] + inArr[2];
		}
		
		System.out.println(result);		
		
	}

}



