package No3009;

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
		
		ArrayList<Integer> points = new ArrayList<Integer>() ;

		
		int count = 0;
		while(count < 3) {
			StringTokenizer st =  new StringTokenizer(br.readLine());
			points.add(Integer.parseInt(st.nextToken()));
			points.add(Integer.parseInt(st.nextToken()));
			count ++;


		}

		int x =0;
		int y =0;
		if(points.get(0).equals(points.get(2))) {
			
			x = points.get(4);
		} else if(points.get(0).equals(points.get(4))) {
			x = points.get(2);
		} else {
			x = points.get(0);

		}
		
		
		
		if(points.get(1).equals(points.get(3))) {
			
			y = points.get(5);
		} else if(points.get(1).equals(points.get(5))) {
			y = points.get(3);
		} else {
			y = points.get(1);

		}
		StringBuilder sb = new StringBuilder();
		
		sb.append(x + " " + y + " ");
		System.out.print(sb);

		
		
	}

}



