package Hackerrank;

import java.util.Scanner;

public class TheHurdleRace {

	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k =scan.nextInt();
		int a[] = new int[n];
		int flag=0;
		
		for(int i =0;i<n;i++) {
			a[i] = scan.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			if((a[i]>k)) {
				flag = 1;
				break;
			}
		}
		
		if(flag==1) {
			System.out.println(max(a,k));
		}
		else {
			System.out.println(0);
		}
		
		
	}
	
	public static int max(int [] a,int k) {
		 int max = a[0];
	        for(int i=1;i<a.length;i++) {
	            if(max<a[i]) {
	                max = a[i];
	            }
	        }
	        return max-k;
	}
}
