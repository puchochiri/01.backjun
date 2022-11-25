package No8958_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//갯수
		int n;

		n = sc.nextInt();
		
		String insert;
		
		ArrayList<String> arr = new ArrayList<>();
		String [] prearr = null;
		for (int i = 0; i < n; i++) {
			insert = sc.next();
			//System.out.println("insert: " + insert);
			prearr = insert.split("");
			//System.out.println("prearr : " + prearr[0]);
			arr.clear();
			for (int j = 0; j < prearr.length; j++) {
				arr.add(prearr[j].toUpperCase());
			}
			//System.out.println("arr : " + arr);

				//점수 카운트
				int count = 1;
				int result = 0;
				String save = null;
				for (String string : arr) {
					save = string;
					if(save.equals("O")) {
						
											
						result += count;
						count ++;
						//System.out.println("result:" + result);
						//System.out.println("count:" + count);
					} else {
						count = 1;

					};
				}
				System.out.println(result);

			
		}
		

	}
}
