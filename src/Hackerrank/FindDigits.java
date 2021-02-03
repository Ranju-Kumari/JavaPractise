package Hackerrank;

import java.util.Scanner;

public class FindDigits {

	public static void main(String [] arr) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int n =sc.nextInt();
			System.out.println(findDigits(n));
		}
		sc.close();
	}
	
	
	public static int findDigits(int n) {
		
		String number = Integer.toString(n);//to find the number of digits in the number
		int len = number.length();
		int digits[] = new int[len];
		int tempNum = n;
		int k=0,count=0;
		while(tempNum>0) {
			digits[k++]=tempNum%10;
			tempNum=tempNum/10;
		}
		
		for(int i=0;i<digits.length;i++) {
			if(digits[i]==0) {
				continue;
			}
			else if (n%digits[i]==0) {
				count++;
			}
		}
		return count;
	}
}
