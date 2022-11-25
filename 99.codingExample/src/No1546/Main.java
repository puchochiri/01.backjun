package No1546;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 제출할 갯수
		int n;
		
		// 전체 번호 수
		ArrayList<Double> totalArr = new ArrayList<Double>();

		n = sc.nextInt();
		
		double a;
		//숫자 넣기
		for (int i = 0; i < n; i++) {
			a = sc.nextDouble();
			totalArr.add(a);
			

		}
		//System.out.println(totalArr);
		double max = 0;
		// 최댓값 찾기
		for (double i : totalArr) {
			if(i > max) {
				max = i;
			}
			
		}
		
		ArrayList<Double> resultArr = new ArrayList<Double>();
		
		// 평균 값 수정
		double chgres;
		for (double i : totalArr) {
			chgres = (i*100)/max;
			resultArr.add(chgres);
			
		}
		
		
		//System.out.println(resultArr);
		
		//평균 구하기
		double avr =0 ;
		for (double i : resultArr) {
			avr += i;
		}
		
		
		System.out.println(avr/n);
	}	
}
