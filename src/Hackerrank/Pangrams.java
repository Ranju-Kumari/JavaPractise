package Hackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangrams {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(pangramOrNot(s));
		sc.close();
	}

	public static String pangramOrNot(String string) {

		string=string.replaceAll(" ", "");
		string=string.toLowerCase();
		
		char[] s = string.toCharArray();
		Set<Character> present = new HashSet<>();
		int len = 0;
		for (char c : s) {
		    if (present.add(c)) {
		        s[len++] = c;
		    }
		}
		
		if (len == 26)
			return "pangram";
		else
			return "not pangram";
	}
}
