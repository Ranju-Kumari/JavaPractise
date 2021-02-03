package Leetcode;

import java.util.Scanner;

public class TwoSum {

	public static void main(String[] arr) {
		Scanner scan =  new Scanner(System.in);
		int target = scan.nextInt();
		int n =scan.nextInt();
		long a [] = new long[n];
		
		for(int i=0;i<n;i++) {
			a[i] = scan.nextLong();
		}
		
		twoSum(a,target);
	}
	
	public static void twoSum(long[] a,int target) {
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]+a[j]==target) {
					System.out.println(i+" "+j);
				}
			}
		}
	}
}
