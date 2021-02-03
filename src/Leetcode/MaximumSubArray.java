package Leetcode;

import java.util.Scanner;

public class MaximumSubArray {

	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a [] =new int[n];
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}
		
		System.out.println(maxSubArray(a));
		scan.close();
	}
	
	public static int maxSubArray(int[] nums) {
        
		if(nums.length==1) {
			return nums[0];
		}
		
		int maxSum = nums[0];int sum = 0;
		for(int i =0;i<nums.length;i++) {
			sum+=nums[i];
			if(sum>=maxSum) {
				maxSum = sum;
			}
			if(sum<0) {
				sum = 0;
			}
		} 
		return maxSum;
    }
}
