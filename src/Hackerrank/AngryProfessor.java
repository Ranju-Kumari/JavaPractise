package Hackerrank;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int k =sc.nextInt();
			int a[] = new int[n];
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			
			System.out.println(angryProfessor(k, a));
		}
		
		
		sc.close();
	}
	
	
	public static String angryProfessor(int k, int[] a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<=0) {
				count++;
			}
		}
		if(count>=k) {
			return "NO";
		}
		else {
			return "YES";
		}
    } 
}
