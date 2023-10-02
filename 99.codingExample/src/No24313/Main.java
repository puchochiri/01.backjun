package No24313;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	private void solution() {
		try {
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			long a1 = Integer.parseInt(stringTokenizer.nextToken());
			long a0 = Integer.parseInt(stringTokenizer.nextToken());
			long c = Integer.parseInt(bufferedReader.readLine());
			long n0 = Integer.parseInt(bufferedReader.readLine());
			
			bufferedReader.close();
			
			long fn = a1 * n0 +  a0;
			long gn = n0 * c;
					
			if(fn <= gn && c >= a1) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}


			
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}

		
		
	}
	
	public static void main(String[] args) {
		new Main().solution();
		
	}


} 