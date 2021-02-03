package Practice;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String [] arr) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a =new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		int target = sc.nextInt();
		
		int targetIndex = binarySearch(a,target);
//		int targetIndex = binarySearch(a,0,n-1,target);
		System.out.println("target found at "+targetIndex );
	}
	
	public static int binarySearch(int [] a,int target) {
		
		int low = 0;
		int high = a.length-1;
		
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(a[mid]==target)
				return mid;
			else if(target<a[mid]) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return -1;//If target not found
	}
	
	//Recursive
	/*public static int binarySearch(int [] a,int low,int high,int target) {
		
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(a[mid]==target)
				return mid;
			else if(target<a[mid]) {
				return binarySearch(a,low,mid-1,target);
			}else {
				return binarySearch(a,mid+1,high,target);
			}
		}
		return -1;//If target not found
	}*/
}
