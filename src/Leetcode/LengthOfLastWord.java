package Leetcode;

import java.util.Scanner;

public class LengthOfLastWord {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		System.out.println(lengthOfLastWord(s));
		sc.close();
	}
	
	public static int lengthOfLastWord(String string) {
        int k=0;
        String s= string.trim();
        
        if(s.length()==0)
        	return 0;
        
        char [] charArray = s.toCharArray();
		if(s.length()>=1) {
			for(int i=0;i<charArray.length;i++) {
				k++;
				if(charArray[i]==' ') {
					k=0;
				}
			}
		}
		return k;
    }
}
