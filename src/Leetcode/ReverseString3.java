package Leetcode;

import java.util.Scanner;

public class ReverseString3 {

public static void main(String [] arr) {
		
		Scanner scan =  new Scanner(System.in);
		String s = scan.nextLine();
		int k = scan.nextInt();
		
		System.out.println(reverseStr(s,k));
		
	}
	
	
	public static String reverseStr(String s, int k) {
        if(s.length() == 1) return s;
        StringBuilder stringBuilder = new StringBuilder(s);
        int i = 0;
        int stringLength = stringBuilder.length() - 1;
        while (i <= stringLength) {
            if(i + k <= stringLength) {
                reverseFunction(stringBuilder, i, i + k - 1);
                i = i + 2 * k;
            } else {
                reverseFunction(stringBuilder, i, stringLength);
                break;
            }
        }
        
        return stringBuilder.toString();
    }
    
     static void reverseFunction(StringBuilder s, int start, int end) {
        for(int i = start, j = end; i < (end + start + 1)/2; i++, j--)
        {
            char temp = s.charAt(i);
            s.setCharAt(i, s.charAt(j));
            s.setCharAt(j, temp);
        }
    }

   //Another solution
     /*public static String reverseStr(String s, int k) {
		char[] arr = s.toCharArray();
		for (int start = 0; start < arr.length; start += 2 * k) {
			int i = start, j = Math.min(start + k - 1, arr.length - 1);
			while (i < j) {
				char tmp = arr[i];
				arr[i++] = arr[j];
				arr[j--] = tmp;
			}
		}
		return new String(arr);
	}*/
	
	
	
}
