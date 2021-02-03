package Hackerrank;

import java.util.Scanner;

public class AlternatingCharacters {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		while(t-->0) {
			String s =sc.next();
			System.out.println(alternatingCharacters(s));
		}
		sc.close();
	}
	
	public static int alternatingCharacters(String s) {

		char c[]=s.toCharArray();
		int count=0;
		for(int i=0;i<c.length-1;i++) {
			if(c[i]==c[i+1]) {
				count++;
			}
		}
		return count;
    }
	
	
}
