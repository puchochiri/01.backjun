package No1157_StringArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input = in.nextLine();
		
		String [] arr = input.split(" ");
		
		List<String> arr1 = new ArrayList<String>(Arrays.asList(arr));
				
		
		//System.out.println(arr1);
		
		arr1.removeAll(Arrays.asList("", null));
		
		//System.out.println(arr1);
		System.out.println(arr1.size());
		
	
	}
		
}








