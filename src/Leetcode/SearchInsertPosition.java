package Leetcode;

import java.util.Scanner;

public class SearchInsertPosition {

	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n=scan.nextInt();
		int []a =new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		
		int target =scan.nextInt();
		System.out.println(insertPosition(a, target));
	}
	
	public static int insertPosition(int [] nums,int target) {
		
		int i=0;
		while(i<nums.length) {
			if(nums[i]==target ||nums[i]>target) {
				return i;
			}else {
				i++;
			}
		}
		return i;
	}
	
	
}
