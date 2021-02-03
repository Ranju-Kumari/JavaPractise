package Hackerrank;

import java.util.Scanner;

public class StringCanBeAPalindromeOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		palindromeOrNot(s);

	}

	public static int[] frequency(String s) {
		char a[] = s.toCharArray();

		int[] f = new int[150];

		for (int i = 0; i < f.length; i++) {
			f[i] = 0;
		}

		for (int i = 0; i < a.length; i++) {
			f[a[i]] = f[a[i]] + 1;
		}
		return f;
	}

	public static void palindromeOrNot(String s) {
		int count =0 , flag =0;
		int countOfEachLetter[] = frequency(s);
		for (int j = 0; j < countOfEachLetter.length; j++) {
			if(countOfEachLetter[j]!=0) { // To exclude those letters whose freq is zero
				if (countOfEachLetter[j] % 2 != 0) {
					count++;
					if (count > 1) {
						flag=1;
						break;
					}
				}	
			}
		}
		if (flag == 1) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}
