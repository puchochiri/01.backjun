package No3052;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력한 번호
		int a;
		
		// 입력한 번호 배열
		ArrayList<Integer> totalArr = new ArrayList<Integer>();

		// 나눈 번호
		ArrayList<Integer> resultArr = new ArrayList<Integer>();

		
		
		for (int i = 0; i < 10; i++) {
			a = sc.nextInt();
			totalArr.add(a);	
		}

		int result;
		
		ArrayList<Integer> duplCheck = new ArrayList<Integer>();
		//나누기
		
		for (int i : totalArr) {
			result = i%42;
			resultArr.add(result);
			
		}
		
		int cnt =0;
		for (int i : resultArr) {
			if(!duplCheck.contains(i)) {
				duplCheck.add(i);
				cnt++;
				
			}
		}
		
		System.out.println(cnt);
		
	}	
}
