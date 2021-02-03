package Leetcode;

import java.util.Scanner;
import java.util.TreeSet;

public class ContaindDuplicate3 {

	public static void main(String [] a) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int k = scan.nextInt();
		int t= scan.nextInt();
		System.out.println(containsNearbyAlmostDuplicate(arr,k,t));
		scan.close();
	}
	
	//O(nlog(min(n,k)))
	public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		
		TreeSet<Long> treeSet = new TreeSet<>();
		for(int i=0;i<nums.length;i++) {
			Long floor = treeSet.floor((long)nums[i]);// floor returns the greatest element in this set less than or equal tothe given element, or null if there is no such element
			if(floor !=null && nums[i]-floor<=t) {
				return true;
			}
			Long ceiling = treeSet.ceiling((long)nums[i]);// ceiling returns the least element in this set greater than or equal tothe given element, or null if there is no such element.
			if(ceiling !=null && ceiling-nums[i]<=t) {
				return true;
			}
			treeSet.add((long)nums[i]);
			if(treeSet.size()>k) {
				treeSet.remove((long)nums[i-k]);
			}
		}
		return false;
    }
	
	
	
	// O(n^2) solution TIME LIMIT EXCEEDED
	/*public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				long diff1= (long)nums[i]-(long)nums[j];
				long diff2= i-j;
				if(Math.abs(diff1)<=t && Math.abs(diff2)<=k) {
					return true;
				}
			}
		}
		return false;
    }
*/}
