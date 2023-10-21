package No1018;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	private void solution1018_copy()
	{
		try {
			BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in) );
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			
			//행
			int n = Integer.parseInt(stringTokenizer.nextToken());
			//열
			int m = Integer.parseInt(stringTokenizer.nextToken());
			
			
			//int 최대값을 min 최솟값으로 등록
			int min = Integer.MAX_VALUE;
			
			
			// 라인 등록
			String[] readLines = new String[n];
			for (int i = 0; i <n; i++) {
				readLines[i] = bufferedReader.readLine();
			}
			
			for (int i = 0; i <= n - 8; i++) {
				for (int j = 0; j <= m - 8; j++) {
					int comMin = solved(i,j,readLines);
					
					if(min > comMin) {
						min = comMin;
					}
					
				}
			}
			
			
			
			
			System.out.println(min);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	
	private int solved(int datum_row, int datum_col, String[] readLines){
		String[] chessLines = {"WBWBWBWB","BWBWBWBW"};
 		int solvedComMin= 0;
 		
 		for (int i = 0; i < 8; i++) {
 			int x = datum_row + i; 
			for (int j = 0; j < 8; j++) {
				int y = datum_col + j;
				
				if(readLines[x].charAt(y) != chessLines[x % 2].charAt(j)) {
					solvedComMin++;
				}
				
			}
		}
		
		
		
		
		return Math.min(solvedComMin, 64 - solvedComMin);
	}
	
	
	public static void main(String[] arg) 
	{
		new Main().solution1018_copy();
	}
}
