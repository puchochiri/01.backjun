package No27323;

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
		
		int width = Integer.parseInt(br.readLine());
		int height = Integer.parseInt(br.readLine());
		
		int result = width * height;
		
		System.out.println(result);
		
	}

}



