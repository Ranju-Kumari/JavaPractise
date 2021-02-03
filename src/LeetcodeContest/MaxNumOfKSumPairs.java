package LeetcodeContest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxNumOfKSumPairs {

	public static void main(String[] arr) {
		Scanner scan =  new Scanner(System.in);
		int target = scan.nextInt();
		int n =scan.nextInt();
		int a [] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}
		System.out.println(maxOperations(a,target));
	}
	
	
	public static int maxOperations(int[] nums, int k) {
    	int left= 0;
    	int right=nums.length-1;
    	Arrays.sort(nums);
    	int count=0;
    	while(left<right) {
    		if((nums[left]+nums[right])==k) {
    			count++;
    			left++;right--;
    		}
    		else if((nums[left]+nums[right])<k) 
    			left++;
    		else 
    			right--;
    	}
    	return count;
     }
	
	/*public static int maxOperations(int[] nums, int k) {
    	Map<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
    	int count =0;
    	for(int i =0;i<nums.length;i++) {
    		if(hashMap.containsKey(k-nums[i])) {
//    			nums[i]=-99;
    			count++;
    		}
    		hashMap.put(nums[i], i);
    	}
    	return count;
     }*/
	
     /*public static int maxOperations(int[] nums, int k) {
    	int sum = 0;
 		int count=0;
 		for(int i=0;i<nums.length;i++) {
 			for(int j=i+1;j<nums.length;j++) {
 				if(nums[i]+nums[j]==k) {
 					count++;
 					nums[i]=-99;nums[j]=-99;
 				}
 			}
 		}
 		return count;
     }*/
		
     
}
