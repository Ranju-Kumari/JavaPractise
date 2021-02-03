package Hackerrank;

import java.util.Scanner;

public class DivisibleSumPairs {

	public static void main(String [] ar) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int a[] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] =scan.nextInt();
		}
		
		System.out.println(divSumPairs(a,k));
		
	}
	
	public static int divSumPairs(int[] arr, int k) {
		int noOfPairs =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]+arr[j])%k==0) {
					noOfPairs = noOfPairs+1;
				}
			}
		}
		return noOfPairs;
	}
}
