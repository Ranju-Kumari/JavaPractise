package Hackerrank;

import java.util.Scanner;

public class MarsExplorationSOS {

	public static void main(String [] args) {
		Scanner sc =new Scanner(System.in);
		
		String s = sc.next();
		System.out.println(sos(s));
	}
	
	public static int sos(String message) {
        String sos = "SOS";
        int count = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != sos.charAt(i % 3)) count++;
        }
        return count;
    }
}
