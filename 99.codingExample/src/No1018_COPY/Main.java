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

			int n = Integer.parseInt(stringTokenizer.nextToken()); // ��
			int m = Integer.parseInt(stringTokenizer.nextToken()); // ��
			String[] bwArr = new String[8];
			String[] wbArr = new String[8];
			
			
			String[] readlines = new String[n];
			for (int i = 0; i < n; i++) {
				readlines[i] = bufferedReader.readLine();
				
			
			}
			
			

			for (int i = 1; i <= 8; i++) {
				// Ȧ��
				if ((i % 2) != 0) {
					bwArr[i - 1] = "B";
					wbArr[i - 1] = "W";

				} else {
					bwArr[i - 1] = "W";
					wbArr[i - 1] = "B";

				}

			}
			
			
			String gapArr[] = null;
			// ��ĥ�� �� ���� list ����
			List<String> countList = new ArrayList<String>();

			int count1 = 0;
			int count2 = 0;
			int min = n*m;
			int datumx = 0;
			// ������ ���
			for (int i = 0; i < n - 7; i++) {
				if(i == n -7) {
					break;
				}
				

				// n : ���� ������
				// n - 7 : ���� ���� ������ ������
				for (int j = 0; j < m - 7; j++) {
					if(j == m -7) {
						break;
					}
					// m - 7 : ���� ���� ������ ������

					


					// ���������� �ٽ� ��ĥ�ؾ��ϴ� ĭ ����
					for (int k = 0; k < 8; k++) { // 8*8 ��
						// �ѱ��ڽ� �迭�� ���
						gapArr = readlines[k].split("");
						System.out.println(Arrays.toString(gapArr) + i);
						datumx = j - 1;
						for (int l = 0; l < 8; l++) { // 8*8 ��
							datumx = datumx + 1;
							// 8*8�ǿ��� Ȧ�� �϶�
							if (k % 2 == 0) {

								// gapArr�� bwArr���� �ٽ�ĥ��ĭ �� ���ϱ�(count1����)
								//System.out.println("datumx:  " +datumx);
								//System.out.println("l:  " +l);
								if (!gapArr[datumx].equals(bwArr[l])) {
									count1++;
								}
								// gapArr�� wbArr���� �ٽ�ĥ��ĭ �� ���ϱ�(count2����)
								if (!gapArr[datumx].equals(wbArr[l])) {
									count2++;
								}

								// 8*8�ǿ��� ¦�� �϶�
							} else if (k % 2 == 1) {
								// gapArr�� wbArr���� �ٽ�ĥ��ĭ �� ���ϱ�(count1����)
								if (!gapArr[datumx].equals(wbArr[l])) {
									count1++;
								}
								// gapArr�� bwArr���� �ٽ�ĥ��ĭ �� ���ϱ�(count2����)
								if (!gapArr[datumx].equals(bwArr[l])) {
									count2++;
								}
							}

						}
						



					}
					System.out.println("count1:" + count1);
					System.out.println("count2:" + count2);
					// �������� ���� �ٽ� ĥ�ؾ��ϴ� �� �迭�� ����
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
