package Leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicates {

	public static void main(String [] a) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(containsDuplicate(arr));
		scan.close();
	}

	//O(1)
	public static boolean containsDuplicate(int [] nums) {
		
		Set<Integer> set = new HashSet<>();
		
		for(int n : nums) {
			if(!(set.add(n))) {
				return true;
			}
		}
		return false;
	}
	
	// Same approach
	/*public boolean containsDuplicate(int[] nums) {
	    Set<Integer> set = new HashSet<>(nums.length);
	    for (int x: nums) {
	        if (set.contains(x)) return true;
	        set.add(x);
	    }
	    return false;
	}*/
	
	
	//O(nlogn) solution after sorting
	/*public boolean containsDuplicate(int[] nums) {
	    Arrays.sort(nums);
	    for (int i = 0; i < nums.length - 1; ++i) {
	        if (nums[i] == nums[i + 1]) return true;
	    }
	    return false;
	}*/
	
	
	//O(n^2) solution...
	/*public static boolean containsDuplicate(int [] nums) {
		int flag=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					flag=1;break;
				}
			}
		}
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}*/
}
