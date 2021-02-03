package Practice;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String [] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		int a [] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		int sortedArr [] = selectionSort(a);
		
		for(int i=0;i<n;i++) {
			System.out.println(sortedArr[i]);
		}
	}
	
	public static int [] selectionSort(int [] a) {
		int n = a.length;
		for(int i=0;i<n;i++) {
			int minIndex = i;
			
			for(int j=i+1;j<n;j++) {
				if(a[minIndex]>a[j]) {
					minIndex = j;
				}
			}
			int temp = a[minIndex];
			a[minIndex] = a[i];
			a[i] = temp;
		}
		return a;
	}
}
