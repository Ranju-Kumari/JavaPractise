package Leetcode;

import java.util.Scanner;

public class SuffleTheArray {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[2*n];
		
		for(int i=0;i<2*n;i++) {
			a[i] = sc.nextInt();
		}
		
		int b[] = shuffle(a,n);
		
		for(int i=0;i<2*n;i++) {
			System.out.println(b[i]);
		}
		
		sc.close();
	}
	
	public static int[] shuffle(int [] nums,int n) {
		int arr [] = new int[nums.length];
		int j=0,k=n;
		for(int i=0;i<nums.length;i=i+2) {
			arr[i]=nums[j++];
		}
		for(int i=1;i<nums.length;i=i+2) {
			arr[i]=nums[k++];
		}
		
		return arr;
	}
}
