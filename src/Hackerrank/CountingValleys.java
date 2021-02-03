package Hackerrank;

import java.util.Scanner;

public class CountingValleys {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String step = sc.next();
		
		System.out.println(countValleys(step,n));
		sc.close();
	}
	
	
	public static int countValleys(String s,int n) {
		
		int numOfValley = 0;
		int level = 0;
		
		char stepArray[] = s.toCharArray();
		
		for(int i=0;i<n;i++) {
			if(stepArray[i]=='D')
				level--;
			if(stepArray[i]=='U')
				level++;
			
			if(level==0 && stepArray[i]=='U') {
				numOfValley++;
			}
		}
		
		return numOfValley;
	}
}
