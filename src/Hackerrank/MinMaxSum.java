package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {

	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		
		long a[]=new long[5];
		
		for(int i=0;i<5;i++) {
			a[i]=sc.nextLong();
		}
		minMax(a);
	}
	public static void minMax(long[] a) {
		long minSum=0;
		long maxSum=0;
		Arrays.sort(a);
		
		for(int i=0;i<4;i++) {
			minSum+=a[i];
		}
		for(int i=a.length-1;i>a.length-5;i--) {
			maxSum+=a[i];
		}
		
		System.out.print(minSum+" "+maxSum);
	}
	
	
	/*long min = 0, max = 0;
	for(int i = 0, j = arr.length - 1; i < arr.length - 1; i++, j--){
	            max = max + arr[j];
	            min = min + arr[i];
	        }
	        System.out.println(min + " " + max);*/
}
