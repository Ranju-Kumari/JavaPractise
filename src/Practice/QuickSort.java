package Practice;

import java.util.Scanner;

public class QuickSort {

   public static void main(String [] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		int a [] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		quickSort(a,0,a.length-1);
		
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void quickSort(int [] a,int low,int high) {
		
		if(low<high) {
			int pI = partition(a,low,high);	
			quickSort(a,low,pI-1);
			quickSort(a,pI+1,high);
		}
	}
	
	public static int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int pi = (low-1); // index of smaller element 
        for (int i=low; i<high; i++) 
        { 
            // If current element is smaller than the pivot 
            if (arr[i] < pivot) 
            { 
                pi++; 
                // swap arr[pi] and arr[i] 
                int temp = arr[pi]; 
                arr[pi] = arr[i]; 
                arr[i] = temp; 
            } 
        } 
  
        // swap arr[pi+1] and arr[high] (or pivot) 
        int temp = arr[pi+1]; 
        arr[pi+1] = arr[high]; 
        arr[high] = temp; 
  
        return pi+1; 
    } 
}
