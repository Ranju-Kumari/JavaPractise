package Leetcode;

import java.util.Scanner;

public class MajorityElement {

	public static void main(String [] a) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println(majorityElement(arr));
		
	}
	
	
	public static int majorityElement(int [] nums) {
		int majorityEle = nums.length/2;
		int [] freqArray = frequency(nums);
		int i=0;
		while(i++<freqArray.length){
			if(freqArray[i]>majorityEle){
				break;
			}
		}
		return i;
	}
	
	
	public static int [] frequency(int []a) {
		int freq[] =new int[100];
		
		boolean alreadyCounted[] =new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			int count =1;
			if(alreadyCounted[i]==true) {
				continue;
			}
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					alreadyCounted[j]=true;
					count++;
					
				}
			}
			freq[i]=count;
		}
		return freq;
	}

	
	/*public int majorityElement(int[] nums) {

        for (int n : nums) {
            int count = 0;
            for (int elem : nums) {
                if (elem == n) {
                    count += 1;
                }
            }

            if (count > nums.length/2) {
                return n;
            }

        }

        return -1;    
    }*/
	
	
	/*public static int [] frequency(int []a) {
		int [] freq = new int[(int) Math.pow(10, 4)];
		for(int i =0 ;i<freq.length;i++) {
			freq[i] = 0;
		}
		
		for(int i=0;i<a.length;i++) {
				freq[a[i]] =freq[a[i]]+1;
		}
		return freq;
	}
*/}
