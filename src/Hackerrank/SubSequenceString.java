package Hackerrank;

import java.util.Scanner;

public class SubSequenceString {

	public static void main(String [] arr) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t>0) {
			String string1 =sc.next();
			subSequence(string1);
			t--;
		}
//		sc.close();
	}
	
	
	public static void subSequence(String string1) {
		String string2 ="hackerrank";
		int j=0;
		char [] s1= string1.toCharArray();
		char [] s2=string2.toCharArray();
		
		for(int i=0;i<s1.length;i++) {
			if(s1[i]==s2[j]) {
				j++;
				if(j==s2.length) {
					break;
					
				}
			}
		}
		if(j==s2.length) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
