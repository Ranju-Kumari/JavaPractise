package Leetcode;

import java.util.Scanner;

public class ReverseVowels {
	
	public static void main(String [] arr) {
		Scanner scan =new Scanner(System.in);
		
		String s = scan.nextLine();
		
		System.out.println(reverseVowels(s));
	}

	public static String reverseVowels(String s) {
		
		char [] stringArray = s.toCharArray();
		int i = 0;
		int j = s.length()-1;
		
		while(i<j) {
			if(!(isVowel(stringArray[i]))) {
				i+=1;
			}
			if(!(isVowel(stringArray[j]))) {
				j-=1;
			}
			if((isVowel(stringArray[i]))&& (isVowel(stringArray[j]))) {
				char temp = stringArray[i];
				stringArray[i++] = stringArray[j];
				stringArray[j--] = temp;
			}
		}
		
		String newString = "";
		for(int k=0;k<s.length();k++) {
			newString+= stringArray[k];
		}
		return newString;
	}
	
	public static boolean isVowel(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			return true;
		}else
		{
			return false;
		}
	}
}
