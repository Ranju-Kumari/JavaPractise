package Leetcode;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String [] arr) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a [] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.err.println(removeDuplicates(a)+"\n");
		int len = removeDuplicates(a);
		for(int i=0;i<len;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static int removeDuplicates(int[] nums) {
		int firstPointer = 0;
		
       for(int i=1;i<nums.length;i++) {
    	   if(nums[firstPointer]!=nums[i]) {
    		   firstPointer++;
    		   nums[firstPointer]=nums[i];
    		  
    	   }
       }
       return firstPointer+1;
    }
}
