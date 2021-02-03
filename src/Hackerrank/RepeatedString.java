package Hackerrank;

import java.util.Scanner;

public class RepeatedString {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s=sc.next();
		long n=sc.nextLong();
		
		System.out.println(repeatedString(s, n));
	}
	
	
	static long repeatedString(String s, long n) {
	    long factor = n/s.length();
	    long remainder = n % s.length();

	    if(!s.contains("a")) 
	    	return 0;
	    long count =0;
	    count=	s.length()>n? countA(s, remainder) 
	            : factor*countA(s, s.length()) + countA(s, remainder);
	    return count;
	}

	    private static long countA(String s, long end) {
	        int count=0;
	        for (int i = 0; i < end; i++) {
	            if (s.charAt(i) == 'a') 
	            	count++;
	        }
	        return count;
	}
	
	
	
	/*public static long repeatedString(String s,long n) {
		if(!s.contains("a"))
			return 0;
		int countInTheGivenString=0;
		long count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a')
				countInTheGivenString++;
		}
		
		long factor=n/s.length();
		long remainder=n%s.length();
		
		count=countInTheGivenString*factor;
		
		for(int i=0;i<remainder;i++) {
			count++;
		}
		
		return count;
	}
	*/
	
	/*public static long repeatedString(String s,long n) {
		long count=0;
		int j=0;
		String s1="";
		for(int i=0;i<n;i++) {
			s1=s1+s.charAt(j++);
			if(j==s.length()) {
				j=0;
			}
		}
		
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a') {
				count++;
			}
		}
		return count;
	}*/
}
