package Leetcode;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int x = sc.nextInt();
		System.out.println(isPalindrome(x));
		sc.close();
	}
	
	public static boolean isPalindrome(int x) {
		
		if(x<0)
			return false;
		int reverseNum = 0;
		int num = x;
		while(x>0) {
			reverseNum = (reverseNum*10)+(x%10);
			x = x/10;
		}
		
		if(num!=reverseNum) {
			return false;
		}
		return true;
	}
}
