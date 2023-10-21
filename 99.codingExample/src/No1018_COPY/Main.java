package No1018_COPY;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	private void solition1018() {

		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

			int n = Integer.parseInt(stringTokenizer.nextToken()); // 행
			int m = Integer.parseInt(stringTokenizer.nextToken()); // 열
			String[] bwArr = new String[8];
			String[] wbArr = new String[8];
			
			
			String[] readlines = new String[n];
			for (int i = 0; i < n; i++) {
				readlines[i] = bufferedReader.readLine();
				
			
			}
			
			

			for (int i = 1; i <= 8; i++) {
				// 홀수
				if ((i % 2) != 0) {
					bwArr[i - 1] = "B";
					wbArr[i - 1] = "W";

				} else {
					bwArr[i - 1] = "W";
					wbArr[i - 1] = "B";

				}

			}
			
			
			String gapArr[] = null;
			// 색칠할 수 담을 list 선언
			List<String> countList = new ArrayList<String>();

			int count1 = 0;
			int count2 = 0;
			int min = n*m;
			int datumx = 0;
			// 기준점 잡기
			for (int i = 0; i < n - 7; i++) {
				if(i == n -7) {
					break;
				}
				

				// n : 행의 기준점
				// n - 7 : 본인 포함 가능한 기준점
				for (int j = 0; j < m - 7; j++) {
					if(j == m -7) {
						break;
					}
					// m - 7 : 본인 포함 가능한 기준점

					


					// 기준점에서 다시 색칠해야하는 칸 세기
					for (int k = 0; k < 8; k++) { // 8*8 행
						// 한글자식 배열에 담기
						gapArr = readlines[k].split("");
						System.out.println(Arrays.toString(gapArr) + i);
						datumx = j - 1;
						for (int l = 0; l < 8; l++) { // 8*8 열
							datumx = datumx + 1;
							// 8*8판에서 홀수 일때
							if (k % 2 == 0) {

								// gapArr와 bwArr간의 다시칠할칸 수 구하기(count1세기)
								//System.out.println("datumx:  " +datumx);
								//System.out.println("l:  " +l);
								if (!gapArr[datumx].equals(bwArr[l])) {
									count1++;
								}
								// gapArr와 wbArr간의 다시칠할칸 수 구하기(count2세기)
								if (!gapArr[datumx].equals(wbArr[l])) {
									count2++;
								}

								// 8*8판에서 짝수 일때
							} else if (k % 2 == 1) {
								// gapArr와 wbArr간의 다시칠할칸 수 구하기(count1세기)
								if (!gapArr[datumx].equals(wbArr[l])) {
									count1++;
								}
								// gapArr와 bwArr간의 다시칠할칸 수 구하기(count2세기)
								if (!gapArr[datumx].equals(bwArr[l])) {
									count2++;
								}
							}

						}
						



					}
					System.out.println("count1:" + count1);
					System.out.println("count2:" + count2);
					// 기준점에 대한 다시 칠해야하는 수 배열에 저장
					if (count1 >= count2) {
						countList.add("" + count2);
						count1 = 0;
						count2 = 0;
					} else {
						countList.add("" + count1);
						count1 = 0;
						count2 = 0;
					}
					

				}

			}
			
		
			
			System.out.println("countList:  " +countList);
			System.out.println("countList:  " +countList.size());


			  
			  
			  for (int i = 0; i < countList.size(); i++) 
			  { if(Integer.parseInt(countList.get(i)) <= min) 
			  	{
				  min = Integer.parseInt(countList.get(i));
			  	}
			  }
			  

//			System.out.println(Collections.min(countList));
			System.out.println(min);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Main().solition1018();

	}

}
