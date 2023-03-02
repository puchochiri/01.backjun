package No2908_StringArray;

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
		
		
		arr1.removeAll(Arrays.asList("",null));
				
		String numberfirst = arr1.get(0);
		String numbersecond = arr1.get(1);
		// 첫번째 숫자 뒤집기
		//String [] digitArr = numberfirst.split("");
		//System.out.println(Arrays.asList(digitArr));
		
		List<String> digitList = Arrays.asList(numberfirst.split(""));
		
		
		int sum = 0;
		
		int digit = 0;
		for (int i = digitList.size() -1; i >= 0 ; i--) {
			int multiple = (int) Math.pow(10, i);
			
			sum += Integer.parseInt(digitList.get(i)) * multiple;
			
					
			
		}
		
		// 두번째 숫자 뒤집기
		List<String> digitList1 = Arrays.asList(numbersecond.split(""));
		int sum1 = 0;
		int digit1 = 0;

		for (int i = digitList1.size() -1; i >= 0 ; i--) {
			int multiple = (int) Math.pow(10, i);
			
			sum1 += Integer.parseInt(digitList1.get(i)) * multiple;
			
					
		
			
		}
		
		int result = 0;
		if(sum >= sum1) {
			result = sum;
		} else {
			result = sum1;
			
		}
		
		System.out.println(result);
	
	}
		
}








