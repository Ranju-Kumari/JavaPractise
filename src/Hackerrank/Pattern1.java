package Hackerrank;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String [] arr) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			char ch =99;
			for(int j=2*(n-i);j>=1;j--) {
				System.out.print("- ");
			}
			for(int k=1;k<=(2*i)-1;k++) {
				if(k>=i) {
					System.out.print(ch++ +" - ");
				}
				else {
					System.out.print(ch-- +" - ");
				}
				
			}
			for(int l= 2*(n-i);l>1;l--) {
				System.out.print("- ");
			}
			System.out.println();
		}
	}
}
