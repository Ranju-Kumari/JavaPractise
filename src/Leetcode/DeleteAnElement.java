package Leetcode;

import java.util.Scanner;

public class DeleteAnElement {

	public static void main(String [] a) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int[n];
		int x = scan.nextInt();
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		int newArrayLength = deleteEle(arr,x);
		
		for(int i=0;i<newArrayLength;i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	public static int deleteEle(int [] nums,int val) {
		
		int j=0;
		for(int i =0;i<nums.length;i++) {
			if(nums[i]!=val) {
				nums[j++]=nums[i];
			}
		}
		return j;
	}
}

/*
Consider the given array is arr[] and the initial size of the array is N, that is the array can contain a maximum of N elements and the length of the array is len. That is, there are len number of elements already present in this array.

Deleting an element K from the array arr[]: Search the element K in the array arr[] to find the index at which it is present.
for(i = 0; i < N; i++)
{
    if(arr[i] == K)
        idx = i; return;
    else
        Element not Found;
}
Now, to delete the element present at index idx, left shift all of the elements present after idx by one place and finally reduce the length of the array by 1.
for(i = idx+1; i < len; i++)
{
    arr[i-1] = arr[i];
}

len = len-1;

Time Complexity in worst case of this insertion operation can be linear i.e. O(N) as we might have to shift all of the elements by one place to the left.
*/