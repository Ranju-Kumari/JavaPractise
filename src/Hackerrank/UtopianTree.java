package Hackerrank;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String [] args) {
		
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			System.out.println(utopianTree(n));
		}
		
		sc.close();
	}
	
	public static int utopianTree(int n) {
		int h=1;
		if(n==0)
			return h;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				h=2*h;
			}
			else {
				h=h+1;
			}
		}
		return h;
	}
}
