package No19532;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
	private void solution19532() throws IOException {
		
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			
			//BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
			bufferedReader.close();
			
			int a = Integer.parseInt(stringTokenizer.nextToken());
			int b = Integer.parseInt(stringTokenizer.nextToken());
			int c = Integer.parseInt(stringTokenizer.nextToken());
			int d = Integer.parseInt(stringTokenizer.nextToken());
			int e = Integer.parseInt(stringTokenizer.nextToken());
			int f = Integer.parseInt(stringTokenizer.nextToken());
			
			int x = (c*e - b*f)/(a*e - b*d);
			int y = (c*d - a*f)/(b*d - a*e);
			
//			bufferedWriter.write((c*e - b*f)/(a*e - b*d) + " ");
//			bufferedWriter.write((c*d - a*f)/(b*d - a*e) + "");
//			bufferedWriter.flush();
//			bufferedWriter.close();
//			
			
			System.out.print(x + " " + y );
						

		
	
	}
	
	public static void main(String[] args) throws IOException {
		new Main().solution19532();
		
		
	}
	
}





