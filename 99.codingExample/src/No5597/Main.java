package No5597;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 제출한 번호
		int a;
		
		// 전체 번호 수
		ArrayList<Integer> totalArr = new ArrayList<Integer>();

		
		
		for (int i = 0; i < 30; i++) {
			totalArr.add(i + 1);	
		}
		
		//숫자뺴기
		for (int i = 0; i < 28; i++) {
			a = sc.nextInt();
			totalArr.remove(Integer.valueOf(a));
			

		}
		System.out.println(totalArr.get(0));
		System.out.println(totalArr.get(1));
		
	}	
}
