package Leetcode;

import java.util.Scanner;

public class ReverseString2 {

public static void main(String [] arr) {
		
		Scanner scan =  new Scanner(System.in);
		String s = scan.nextLine();
		int k = scan.nextInt();
		
		System.out.println(reverseStr(s,k));
		
	}
	
	 public static String reverseStr(String s, int k) {
		 char stringArr[] = s.toCharArray();
		 String newString = "";
		 if(k>=s.length()) {
			 for(int i=0;i<stringArr.length/2;i++) {
					char temp =stringArr[i];
					stringArr[i]=stringArr[stringArr.length-i-1];
					stringArr[stringArr.length-i-1] = temp;
				}
		 }
		 else {
			 int countOfChars=stringArr.length;
			 for(int i=0;countOfChars>=k;i=i+(2*k)) {
				 char t = stringArr[i];
				 stringArr[i] = stringArr[i+(k-1)];
				 stringArr[i+(k-1)] = t;
				 for(int j=i+1;j<k/2;j++) {
					 char temp =stringArr[j];
						stringArr[j]=stringArr[k-j-1];
						stringArr[k-j-1] = temp;
				 }
				 countOfChars = countOfChars-(2*k);
			 }
		 }
		 for(int i=0;i<stringArr.length;i++) {
			 newString = newString+stringArr[i]; 
		 }
		 return newString; 
	  }
}
