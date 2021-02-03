package Leetcode;

import java.util.Scanner;

public class MergeSortedArray {

	public static void main(String [] args) {
		
		Scanner sc =new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int nums1[] = new int[m+n];
		int nums2[] = new int[n];
		
		for(int i = 0;i<m;i++) {
			nums1[i]=sc.nextInt();
		}
		
		for(int i = 0;i<n;i++) {
			nums2[i]=sc.nextInt();
		}
		
		merge(nums1, m, nums2, n);
		for(int l=0;l<nums1.length;l++) {
			System.out.println(nums1[l]);
		}
		
	}
	
  public static void merge(int[] nums1, int m, int[] nums2, int n) {
		
		int firstIndex = m-1;int secondIndex =n-1;
		
		for(int i =m+n-1;i>=0;i--) {
			if(secondIndex<0)
				break;
			if(i>=0 && nums1[firstIndex]>=nums2[secondIndex]) {
				nums1[i]=nums1[firstIndex];
				firstIndex--;
			}else {
				nums1[i]=nums2[secondIndex];
				secondIndex--;
			}
		}
	}
	
	
	/*public static void merge(int[] nums1, int m, int[] nums2, int n) {
		
		int i=0;int j=0;
		int c[] =new int[m+n];
		for(int k=0;k<m+n;k++) {
			if(i<m && nums1[i]<=nums2[j]) {
				c[k]=nums1[i++];
			}else {
				c[k]=nums2[j++];
			}
		}
		
		for(int l=0;l<nums1.length;l++) {
			System.out.println(c[l]);
		}
	}*/
	
	/*public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0,i=0,j=0;
        int c[] =new int[m+n];
		while(i<m && j<n) {
			if(nums1[i]<=nums2[j]) {
				c[k]=nums1[i];
				k++;i++;
			}
			else {
				c[k]=nums2[j];
				k++;j++;
			}
		}
		while(i<m) {
			c[k]=nums1[i];
			k++;i++;
		}
		while(j<n) {
			c[k]=nums2[j];
			k++;j++;
		}
		
		for(int l=0;l<nums1.length;l++) {
			System.out.println(nums1[l]);
		}
    }*/
}
