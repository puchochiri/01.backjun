package No4344_array;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int[] arr;
		
		int testcase = sc.nextInt();
		
		for (int i = 0; i < testcase; i++) {
			int N = sc.nextInt(); // 학생수
			arr = new int[N];
			
			double sum = 0; // 성적 누적 합 변수
			
			//성적 입력 부분
			for (int j = 0; j < N; j++) {
				int val = sc.nextInt(); // 성적 입력
				arr[j] = val;
				sum += val;
				
			}
			
			double mean = (sum / N);
			double count = 0; // 평균 넘는 학생 수 변수
			
			// 평균 넘는 학생 비율 찾기
			for (int j = 0; j < N; j++) {
				if(arr[j] > mean) {
					count++;
				}
				
				
			}
			System.out.printf("%.3f%%\n",(count/N)*100);
			
		}
		sc.close();
		
		
		

	}
}
