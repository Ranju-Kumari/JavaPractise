package Leetcode;

import java.util.Scanner;

public class SortZeroesOnesTwos {

	public static void main(String []args) {
		
		Scanner sc= new  Scanner(System.in);
		int n=sc.nextInt();
		int [] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		sortColors(a);
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
		sc.close();
	}
	
	
	public static void sortColors(int[] nums) {
      int low=0,mid=0,high=nums.length-1;
      int temp;
      while(mid<=high) {
    	  switch(nums[mid]) {
    	  case 0:
    		  temp=nums[low];
    		  nums[low]=nums[mid];
    		  nums[mid]=temp;
    		  low++;mid++;    		  
    		  break;
    	  case 1:
    		  mid++;
    		  break;
    	  case 2 :
    		  temp=nums[mid];
    		  nums[mid]=nums[high];
    		  nums[high]=temp;
    		  high--;
    		  break;
    	  }
      }
    }
}
