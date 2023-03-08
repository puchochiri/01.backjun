package No_6_10812;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
		

        int[] arr = new int[n+1];
        int[] rot = new int[n+1];
		
        // n개 담기
        // 10 5
        // arr = [ 1 ,2 ,3 , 4, 5, 6, 7, 8, 9]
        for(int i = 1 ; i < arr.length ; i++){
            arr[i] = i;
        }
        //System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(rot));

        // m번 돌리기
        for(int i = 0 ; i < m ; i++){
            int begin = scan.nextInt();
            int end = scan.nextInt();
            int mid = scan.nextInt();

            //164
            //6-4+1=3
            //rot[1+0] = arr[4+1]
            //rot[1+1] = arr[4+2]
            //System.out.println(i);
           

            
            for(int j = 0 ; j < end-mid+1 ; j++){
                rot[begin+j] = arr[mid+j];
            }
            //System.out.println(Arrays.toString(rot));
            for(int j = 0 ; j < mid-begin ; j++){
                rot[begin+end-mid+1+j] = arr[begin+j];
            }
            //System.out.println(Arrays.toString(rot));
            for(int j = begin ; j <= end ; j++){
                arr[j] = rot[j];
            }
            //System.out.println(Arrays.toString(arr));

        }
        
        for(int i = 1 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
		
	scan.close();
		
	}
		
}
