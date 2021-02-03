package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class SingleNumber {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println(singleNumber(a));
	}
	
	public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i =0;i<nums.length-1;i++){
            if (nums[i] != nums[i+1]){
                return nums[i];
            }else{
                i++;
            }
        }
        return nums[nums.length-1];
    }
	
	
	/*public static int singleNumber(int[] nums) {
        
		int f[] = frequency(nums);
		
		for(int i=0;i<f.length;i++) {
			if(f[i]==1)
				return i;
		}
		return -1;
    }
	
	public static int[] frequency(int []a) {
		int [] freq = new int[(int) Math.pow(10, 4)];
		for(int i =0 ;i<freq.length;i++) {
			freq[i] = 0;
		}
		
		for(int i=0;i<a.length;i++) {
				freq[a[i]] =freq[a[i]]+1;
		}
		return freq;
	}*/
}
