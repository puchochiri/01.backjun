package No2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
	private void solution2798() {
		
		
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			
			// 첫줄 첫번째 수
			int n = Integer.parseInt(stringTokenizer.nextToken());
			// 첫줄 두번째 수
			int m = Integer.parseInt(stringTokenizer.nextToken());
			
			int[] cardArr = new int[n];
			
			StringTokenizer stringTokenizer2 = new StringTokenizer(bufferedReader.readLine()); 
			
			// 2째줄 배열에 담기
			for (int i = 0; i < n; i++) {
				int a = Integer.parseInt(stringTokenizer2.nextToken());
				cardArr[i] = a;
			}
			
			
			
			int a1 = 0;
			int a2 = 0;
			int a3 = 0;
			int sum = 0;
			int gap = 0;
			int nnew = m;
			// 5 6 7 8
			// m에 가까운 수 찾기
			for (int i = 0; i < cardArr.length - 2; i++) {
				// 5
				a1 = cardArr[i];
				
				for (int j = i+1; j < cardArr.length; j++) {
					if(j != i) {
						a2 = cardArr[j];
						
					}

					
					for (int j2 = j + 1; j2 < cardArr.length; j2++) {
						// 7
						if(j2 != j) {
							
						}
						a3 = cardArr[j2];
						if(a1 + a2 + a3 <= m) {
							
							
							gap = m - a1 -a2 -a3;
							
							if( gap <= nnew) {
								sum = a1 + a2 + a3;
								nnew = gap;
								if(nnew == 0) {
									break;
									
								}
								
							}
							
						}
						
						
						
						
					}
					
				}
				
			}
			
			
			System.out.println(sum);

			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		new Main().solution2798();
		

	}
}





