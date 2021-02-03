package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContainsDuplicate2 {
	
	public static void main(String [] a) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int k = scan.nextInt();
		System.out.println(containsNearbyDuplicate(arr,k));
		scan.close();
	}
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        
		Map<Integer,Integer> indexes = new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			int num = nums[i];
			if(indexes.containsKey(num) && i-indexes.get(num)<=k) {// i-indexes.get(num) will fetch the value with the key 'num'
				return true;
			}
			indexes.put(num, i);
		}
		return false;
    }
	
	
	//O(n^2) solution
	/*public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i =0;i<=nums.length;i++) {
        	for(int j=i+1;j<nums.length;j++) {
        		int diff = Math.abs(i-j);
        		if(nums[i]==nums[j] && diff==k) {
        			return true;
        		}
        	}
        }
        return false;
    }*/
	
	
	
}
