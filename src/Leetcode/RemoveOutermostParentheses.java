package Leetcode;

import java.util.Scanner;

public class RemoveOutermostParentheses {

	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		System.out.println(removeOuterParentheses(s));
		sc.close();
				
	}
	
	
	public static String removeOuterParentheses(String string) {
		char s[] = string.toCharArray();
		char res[]= new char[s.length] ;
		String resString="";
		int j=0;
		for(int i=0;i<s.length-1;i++) {
			if(s[i]=='(' && s[i+1]==')') {
				res[j]=s[i];
				res[j+1]=s[i+1];
				j=j+2;i++;
			}
		}
		for(int i=0;i<j;i++) {
			resString+=res[i];
		}
		return resString;
	}
}
