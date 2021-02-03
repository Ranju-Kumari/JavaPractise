package Practice;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		/*int fiboArr [] = fibo(n);
		for(int i=0;i<n;i++) {
			System.out.println(fiboArr[i]);
		}
		*/
		
		for(int i=0;i<n;i++) {
			System.out.println(fibo(i));
		}
	}
	
	//Recursive
	public static int fibo(int num) {
		if(num<=1)
			return num;
		
		return fibo(num-1)+fibo(num-2);
	}
	
	//Iterative
	/*public static int [] fibo(int num) {
		int a=0, b=1;
		int sum = 0;
		int arr[] = new int[num];
		arr[0] = 0; arr[1] = 1;
		
		for(int i=2;i<num;i++) {
			sum = a+b;
			a = b;
			b = sum;
			arr[i] = sum;
		}
		return arr;
	}*/
}
