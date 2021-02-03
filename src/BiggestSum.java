import java.util.Scanner;

public class BiggestSum {

	
	public static void main(String []a) {
		Scanner scan  = new Scanner(System.in);
		int n = scan.nextInt();
		long [] arr = new long[n];
		
		for(int i =0;i<n;i++) {
			arr[i] = scan.nextLong();
		}
		
		System.out.println(sumOfArr(arr));
	}
	
	public static long sumOfArr(long[] arr) {
		long sum =0;
		for(long ele : arr) {
			sum=sum+ele;
		}
		return sum;
		
	}
}
