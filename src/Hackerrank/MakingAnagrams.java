package Hackerrank;

import java.util.Scanner;

public class MakingAnagrams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(makingAnagrams(s1,s2));
		
		sc.close();
	}
	
	
	static int makingAnagrams(String s1, String s2) {
		
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		int c1=0,c2=0,res=0;
		
		
		for(int i=0;i<a.length;i++) {
			int flag=0;
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					b[j]='$';
					flag=1;break;
				}
			}
			if(flag==0) {
				c1++;
			}
		}

		for(int i=0;i<b.length;i++) {
			if(b[i]=='$') {
				c2++;
			}
		}
		res=c1+(b.length-c2);
		return res;
    }
	
}
