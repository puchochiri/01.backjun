package No5622_StringArray.copy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// 1 2段
		// ABC 3段
		// DEF 4段
		// GHI 5段
		// JKL 6段
		// MNO 7段
		// PQRS 8段
		// TUV 9段
		// WXYZ 10段
		// WA 10 + 3 = 13段
		// UNUCIC 9 + 7 + 9 + 3 + 5 + 3 =36段
		
		String input = in.next();
		String [] arr = input.split("");
		List<String> arrList = new ArrayList<String>(Arrays.asList(arr));
		
		String [] check3 = {"A","B","C"};
		String [] check4 = {"D","E","F"};
		String [] check5 = {"G","H","I"};
		String [] check6 = {"J","K","L"};
		String [] check7 = {"M","N","O"};
		String [] check8 = {"P","Q","R","S"};
		String [] check9 = {"T","U","V"};
		String [] check10 = {"W","X","Y","Z"};
		List<String> check3List = new ArrayList<String>(Arrays.asList(check3));
		List<String> check4List = new ArrayList<String>(Arrays.asList(check4));
		List<String> check5List = new ArrayList<String>(Arrays.asList(check5));
		List<String> check6List = new ArrayList<String>(Arrays.asList(check6));
		List<String> check7List = new ArrayList<String>(Arrays.asList(check7));
		List<String> check8List = new ArrayList<String>(Arrays.asList(check8));
		List<String> check9List = new ArrayList<String>(Arrays.asList(check9));
		List<String> check10List = new ArrayList<String>(Arrays.asList(check10));
		
		
		

		String alphabet = null;
		int sum = 0;
		for (int i = 0; i < arrList.size(); i++) {
			alphabet = arr[i];
			if (check3List.contains(alphabet)) {
				sum += 3;
				
			} else if(check4List.contains(alphabet)) {
				sum += 4;
				
			} else if(check5List.contains(alphabet)) {
				sum += 5;
				
			} else if(check6List.contains(alphabet)) {
				sum += 6;
				
			} else if(check7List.contains(alphabet)) {
				sum += 7;
				
			} else if(check8List.contains(alphabet)) {
				sum += 8;
				
			} else if(check9List.contains(alphabet)) {
				sum += 9;
				
			} else if(check10List.contains(alphabet)) {
				sum += 10;
				
			}
			
		}
		
		System.out.println(sum);
		
	}
		
}








