package Hackerrank;

import java.util.Scanner;

public class LongestSubsequence {

	public static void main(String [] a) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println(longestSubSeq(arr));
		
	}
	
	public static int longestSubSeq(int []a) {
		int max = 1;
		for(int i=0;i<a.length;i++) {
			int c1=1;int c2 =1;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]==a[i]-1 || a[j]==a[i]) {
					c1++;
				}
				if(a[j]==a[i]+1 || a[j]==a[i]) {
					c2++;
				}
				if(c1>max) {
					max=c1;
				}
				if(c2>max) {
					max=c2;
				}
			}
		}
		return max;
	}
}
