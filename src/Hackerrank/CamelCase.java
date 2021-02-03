package Hackerrank;

import java.util.Scanner;

public class CamelCase {

	public static void main(String [] arr) {
		Scanner scan = new Scanner(System.in);
		String s =scan.nextLine();
		
		System.out.println(noOfWords(s));
	}
	
	public static int noOfWords(String s) {
		int count =1;
		char []arr = s.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>= 65&& arr[i]<=90) {
				count = count +1;
			}
		}
		return count;
	}
}
