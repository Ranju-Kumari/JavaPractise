package LeetcodeContest;

import java.util.Scanner;

public class CountSortedVowelStrings {

	public static void main(String [] a) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		System.out.println(countVowelStrings(n));
		scan.close();
		
	}
	
	public static int countVowelStrings(int n) {
        char [] a = {'a','e','i','o','u'};
        String s="";
        while(n-->0) {
        for(int i=0;i<a.length;i++) {
        	for(int j=0;j<n;j++) {
        		
        			s=s+a[j];
        			
        		}
        	s=s+",";
        	}
        }
        
        String [] stringArray = s.split(",");
        
        for(int i=0;i<stringArray.length;i++) {
        	System.err.println(stringArray[i]);
        }
        return stringArray.length;
    }
}
