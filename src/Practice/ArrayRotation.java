package Practice;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String [] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int k =sc.nextInt();
		
		int [] resultArr = rotateArr(a, k);
		for(int i=0;i<n;i++) {
			System.out.println(resultArr[i]);
		}
	}
	
	//Using extra array
	//Time Comp: O(n)    ,Space Comp: O(n)
	/*public static int [] rotateArr(int [] a,int k) {
		
		int [] temp = new int[k];
		
		for(int i=0;i<k;i++) {
			temp[i] = a[i];
		}
		
		for(int i=0;i<a.length-k;i++) {
			a[i] = a[i+k];
		}
		
		for(int i=a.length-k,j=0;i<a.length;i++) {
			a[i] = temp[j++];
		}
		return a;
	}*/
	
	
	//Without Using extra array
	//Time Comp: O(n*k)    ,Space Comp: O(1)
	public static int [] rotateArr(int [] a,int k) throws InterruptedException {
		
		for(int i=0;i<k;i++) {
			int temp = a[0];
			for(int j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1] = temp;
			
			for(int j=0;j<a.length;j++) {
				System.err.print(a[j]+"");
			}
		}
		return a;
	}
}
