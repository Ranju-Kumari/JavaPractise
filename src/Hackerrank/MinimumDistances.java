package Hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinimumDistances {

	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println(minimumDistances(a));
	}
	
	
	/*public static int minimumDistances(int [] a) {
		int flag=0;
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					flag=1;
					list.add(j-i);
				}
			}
		}
		Collections.sort(list);
		if(flag==0)
			return -1;
		return list.get(0);
	}*/
	
	
	public static int minimumDistances(int [] a) {
		int currentMin=Integer.MAX_VALUE;
		int flag=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					flag=1;
					currentMin=currentMin>j-i?j-i:currentMin;
				}
			}
		}
		if(flag==0)
			return -1;
		return currentMin;
	}
}
