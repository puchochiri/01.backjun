package No24264;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private void solution() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		long n = Integer.parseInt(stringTokenizer.nextToken());
		System.out.println(n*n);
		System.out.println(2);
		
		
	}

	
	public static void main(String[] args) throws IOException {
		new Main().solution();

		
	
	}
}
