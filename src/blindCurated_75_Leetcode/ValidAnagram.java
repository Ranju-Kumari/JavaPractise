package blindCurated_75_Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {

	public static void main(String [] args) {
		
		Scanner sc=new Scanner (System.in);
		String s=sc.next();
		String t=sc.next();
		
		System.out.println(isAnagram(s, t));
				
		sc.close();
		
	}
	
	//O(n^2) 
	/*public static boolean isAnagram(String s,String t) {
		if(s.length()!=t.length())
	           return false;
		
		char [] s1 = s.toCharArray();
		char [] t1 =t.toCharArray();
		
		for(int i=0;i<s1.length;i++) {
			int flag=0;
			for(int j=0;j<t1.length;j++) {
				if(s1[i]==t1[j]) {
					t1[j]='$';flag=1;
					break;
				}
			}
			if(flag!=1)
				return false;
		}
		return true;
	}*/
	
	
	//Better aprroach ::Sorting
	//Time : O(nlogn)
	//Space complexity : O(1). Space depends on the sorting implementation which, usually, 
	//costs O(1)auxiliary space if heapsort is used. 
	/*public boolean isAnagram(String s, String t) {
	    if (s.length() != t.length()) {
	        return false;
	    }
	    char[] str1 = s.toCharArray();
	    char[] str2 = t.toCharArray();
	    Arrays.sort(str1);
	    Arrays.sort(str2);
	    return Arrays.equals(str1, str2);
	}*/
	
	
	//Best Approach : hashTable
	
	//Time complexity : O(n)because accessing the counter table is a constant time operation.
    //Space complexity : O(1) Although we do use extra space, the space complexity is O(1)
	//because the table's size stays constant no matter how large n is.
	
	// we could first increment the counter for s, then decrement the counter for t. 
	//If at any point the counter drops below zero,
	//we know that t contains an extra letter not in s and return false immediately.
	public static boolean isAnagram(String s, String t) {
	    if (s.length() != t.length()) {
	        return false;
	    }
	    int[] table = new int[26];
	    for (int i = 0; i < s.length(); i++) {
	        table[s.charAt(i) - 'a']++;
	    }
	    for (int i = 0; i < t.length(); i++) {
	        table[t.charAt(i) - 'a']--;
	        if (table[t.charAt(i) - 'a'] < 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
}
