package Practice;

import java.util.Scanner;

public class MergeSort {

	public static void main(String [] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		int a [] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		mergeSort(a,0,a.length-1);
		
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void mergeSort(int []a,int left,int right) {
		
		int mid = left+(right-left)/2;
		
		if(left<right) {
			mergeSort(a,left,mid);
			mergeSort(a,mid+1,right);
			
			merge(a,left,mid,right);
		}
	}
	
	public static void merge(int []a, int left,int mid,int right) {
		int m = mid-left+1;
		int n = right-mid;
		
		int i=0;//Initial index of left array
		int j=0;//Initial index of right array
		int k=left;//Initial index of merged array
		
		//creating temp arrays
		int L[] = new int[m];
		int R[] = new int[n];
		
		for(int itr=0;itr<m;itr++) {
			L[itr] = a[left+itr];
		}
		for(int itr=0;itr<n;itr++) {
			R[itr] = a[mid+1+itr];
		}
		
		while(i<m && j<n) {
			if(L[i]<=R[j]) {
				a[k]=L[i];i++;
			}else {
				a[k]=R[j];j++;
			}
			k++;
		}
		//copying the remaining left array elemnts if thers is any
		while(i<m) {
			a[k]=L[i];i++;k++;
		}
		//copying the remaining right array elemnts if thers is any
		while(j<n) {
			a[k]=R[j];j++;k++;
		}
	}
}
