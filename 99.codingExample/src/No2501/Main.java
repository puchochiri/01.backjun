package No2501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		 //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		//8 16 ���
		// 6 3
		// 6�� ������� [1,2,3,6]�� 3��° ���� ���Ͻÿ�. 3
		
		//StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int first = Integer.parseInt(st.nextToken());
		int num = Integer.parseInt(st.nextToken());
		
		int i = 0; // ������
		int [] arr = new int[first];
		int n = 0; // �������
		while(true) {
			
			i++;
			
			if(i<=first) {
				if(first%i==0) {
					arr[n] = i;
					n++;		
				}
				
			} else {
				break;
			}
				
			
			
		}
		
		System.out.println(arr[num-1]);
		
	}
}
