package No2581;

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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int firstNum = Integer.parseInt(st.nextToken());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int secondNum = Integer.parseInt(st1.nextToken());
		
		
		ArrayList<Integer> listArr = new ArrayList<Integer>();
		for (int i = firstNum; i <= secondNum; i++) {
			listArr.add(i);
			
		}
		
		ArrayList<Integer> primeNumberList = new ArrayList<Integer>();
		ArrayList<Integer> primeNumberCheck = new ArrayList<Integer>();
		for (int i = 0; i < listArr.size(); i++) {
			for (int j = 1; j <= listArr.get(i); j++) {
				
				if(listArr.get(i)%j == 0) {
					primeNumberCheck.add(j);
				}
				
			}
			if(primeNumberCheck.size()==2) {
				primeNumberList.add(listArr.get(i));
			};
			primeNumberCheck.clear();
		}
		
		int sum = 0;
		for (int i = 0; i < primeNumberList.size(); i++) {
			sum += primeNumberList.get(i);
			
		}
		if(primeNumberList.size()>=1) {
			System.out.println(sum);
			System.out.println(primeNumberList.get(0));
			
		} else {
			System.out.println("-1");

		}
		
	
	}

}



