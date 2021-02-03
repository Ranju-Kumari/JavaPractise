package Hackerrank;

import java.util.Scanner;

public class CanBeAnagramOrNot {

	public static void main(String[] a) {
		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0) {
			String s = scan.next();
			System.out.println(noOfChanges(s));
		}
		
		scan.close();

	}

	public static int noOfChanges(String string) {
		int flag = 0, count = 0;
		if (string.length() % 2 != 0)
			return -1;

		else {
			char s[] = string.toCharArray();
			int mid = s.length/2;
			char s1[] = new char[mid];
			char s2[] = new char[mid];
			for (int i = 0; i <mid; i++) {
				s1[i] = s[i];
			}
			int k = 0;
			for (int i = mid ; i <s.length ; i++) {
				s2[k++] = s[i];
			}
			//Comparing chararcters of first char array to each chararcters of 2nd char array
			for (int i = 0; i < s1.length; i++) {
				for (int j = 0; j < s1.length; j++) {
					if (s1[i] == s2[j]) {
						s2[j]='$';//whenever the match id found, replace that character in 2nd array with any non letter character to consider the case when like "aabdca"
						flag=0;
						break;
					} else {
						flag = 1;
					}
				}
				if (flag == 1) {
					count++;
					flag=0;
				}
			}
		}
		return count;
	}
}
