package Leetcode;

import java.util.Scanner;

public class ReverseString {

	public static void main(String [] arr) {
		
		Scanner scan =  new Scanner(System.in);
		String s = scan.nextLine();
		char [] stringArr = s.toCharArray();
		
		reverseString(stringArr);
		
	}
	
	public static void reverseString(char[] s) {
		for(int i=0;i<s.length/2;i++) {
			char temp =s[i];
			s[i]=s[s.length-i-1];
			s[s.length-i-1] = temp;
		}
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]);
		}
	}
}
