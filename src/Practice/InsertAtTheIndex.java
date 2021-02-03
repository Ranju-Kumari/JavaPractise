package Practice;

import java.util.Scanner;

public class InsertAtTheIndex {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []a = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int index = sc.nextInt();
		int ele = sc.nextInt();
		
		int [] result = insertAt(a,index,ele);
		
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
	}
	
	public static int [] insertAt(int [] a,int index,int ele) {
		
		int [] result = new int[a.length+1];
		
		for(int i=0,j=0;i<a.length;i++) {
			if(i==index) {
				result[j++]=ele;
			}
			
			result[j++]=a[i];
		}
		return result;
	}
}
