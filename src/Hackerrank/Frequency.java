package Hackerrank;
import java.util.Scanner;

public class Frequency {

	public static void main(String [] a) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		frequency(arr);
		
	}
	
	public static void frequency(int []a) {
		int [] freq = new int[(int) Math.pow(10, 4)];
		for(int i =0 ;i<freq.length;i++) {
			freq[i] = 0;
		}
		
		for(int i=0;i<a.length;i++) {
				freq[a[i]] =freq[a[i]]+1;
		}
		
		for(int i =0; i<freq.length;i++) {
			if(freq[i]!=0) {
				System.err.println(i+" : "+freq[i]);
			}
			
		}
	}
}
