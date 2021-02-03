package Hackerrank;

import java.util.Scanner;

public class StringConstruction {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s =sc.next();
			frequency(s);
		}
	}
	
	public static void frequency(String s) {
		
		char ch [] = s.toCharArray();
		int freq[] = new int[(int) Math.pow(10,4)];
		
		for(int i=0;i<freq.length;i++) {
			freq[i]=0;
		}
		
		for(int i=0;i<ch.length;i++) {
			freq[ch[i]]=freq[ch[i]]+1;
		}
		int count=0;
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>=1)
				count++;
		}
		
		System.out.println(count);
	}
}
