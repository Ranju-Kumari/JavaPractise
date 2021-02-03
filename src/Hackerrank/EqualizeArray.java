package Hackerrank;

import java.util.Scanner;

public class EqualizeArray {

	public static void main(String [] a) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println(equalizeArray(arr));
		
	}
	
	
	public static int equalizeArray(int [] array) {
		
		int [] freqOfArray = frequency(array);
		int noOfDel = 0;
		int max =0;
		for(int i=0;i<freqOfArray.length;i++) {
			if(freqOfArray[i]>max) {
				max=freqOfArray[i];
			}
		}
		noOfDel = array.length-max;
		return noOfDel;
	}
	
	
	public static int [] frequency(int []a) {
		int [] freq = new int[(int) Math.pow(10, 4)];
		for(int i =0 ;i<freq.length;i++) {
			freq[i] = 0;
		}
		
		for(int i=0;i<a.length;i++) {
				freq[a[i]] =freq[a[i]]+1;
		}
		return freq;
	}
}
