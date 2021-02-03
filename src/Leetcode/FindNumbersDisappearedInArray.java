package Leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FindNumbersDisappearedInArray {

	public static void main(String [] args) throws InterruptedException {
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int a[] =new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		List<Integer> missingNums = findDisappearedNumbers(a);
		Thread.sleep(4);
		for(int number : missingNums) {
			System.out.println(number);
		}
		sc.close();
	}
	
	public static List<Integer> findDisappearedNumbers(int[] nums) {
	      List<Integer> ll = new LinkedList<>();
	        int [] r = new int [nums.length];
	        
	        for(int i=0;i<nums.length;i++){
	        	r[nums[i]-1]=nums[i];
	        }
	        for(int i =0;i<r.length;i++){
	            if(r[i]==0){
	            	ll.add(i+1);
	            }
	        }
	        
	        return ll;
	    }
	
   /*public static List<Integer> findDisappearedNumbers(int [] nums){
	   Arrays.sort(nums);
	   Set<Integer> hash = new HashSet<Integer>();
	   
	   for(int i=0;i<nums.length;i++) {
		   if(hash.contains(nums[i])) {
			   continue;
		   }
		   hash.add(nums[i]);
	   }
	   
		List<Integer > missingNums = new ArrayList<Integer>();
		int i=1;
		for(int ele : hash) {
			if(ele!=i) {
				missingNums.add(i);
			}
			i++;
		}
		return missingNums;
	}*/
	
	
	
	/*public static List<Integer> findDisappearedNumbers(int [] nums){
		
		Arrays.sort(nums);
		List<Integer > missingNums = new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=i+1 && nums[i-1]!=nums[i]) {
				missingNums.add(i+1);
			}
		}
		return missingNums;
	}*/
}
