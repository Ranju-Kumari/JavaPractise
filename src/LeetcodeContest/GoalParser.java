package LeetcodeContest;

import java.util.Scanner;

public class GoalParser {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.println(interpret(s));
				
	}
	
	public static String interpret(String command) {
		char[] ch = command.toCharArray();
		String s = "";
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='('&&ch[i+1]==')') {
				s=s+'o'; i++;
			}
			if(ch[i]=='G') {
				s=s+'G';
			}
			if(ch[i]=='('&&ch[i+1]=='a'&&ch[i+2]=='l'&&ch[i+3]==')') {
				s=s+"al";
				i=i+3;
			}
		}
		
		return s;
	}
}
