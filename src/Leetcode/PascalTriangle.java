package Leetcode;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		printPascal(n);
		
	}
	
	public static void printPascal(int n) {
		int[][]a =new int[n+1][n+1];
		for(int i =1;i<=n;i++) {
			int k=1;
			for(int space = n-i;space>=1;space--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				if(j==1||j==i) {
					System.out.print(k+" ");
					a[i][j]=k;
				}else {
					a[i][j]=a[i-1][j-1]+a[i-1][j];
					System.out.print(a[i-1][j-1]+a[i-1][j]+" ");
				}
			}
			System.out.println();
		}
	}
}
