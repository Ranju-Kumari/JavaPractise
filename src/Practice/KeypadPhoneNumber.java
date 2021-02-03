package Practice;
import java.util.Scanner;

public class KeypadPhoneNumber {
    public static void main(String[] args){
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        
        String phNumber = input.next();
        String output = "";
        for(int i = 0 ; i < phNumber.length() ; i++){
            char ch = Character.toUpperCase(phNumber.charAt(i));
            if(isAlphabet(ch)){
                int digit = getNumber(ch);
                output = output + digit;
            }
            else{
                output = output + ch;
            }
        }
          System.out.println(output);
    }
    
    public static boolean isAlphabet(char ch) {
    	if(ch>='A'&& ch<='Z')
    		return true;
		return false;
    }
    
    public static int getNumber(char ch){
        if(ch == 'A' ||ch == 'B' || ch == 'C')
            return 2;
        else if(ch == 'D' || ch =='E'|| ch == 'F')
            return 3;
        else if(ch == 'G' || ch =='H'|| ch == 'I')
            return 4;
        else if(ch == 'J' || ch =='K'|| ch == 'L')
            return 5;
        else if(ch == 'M' || ch =='N'|| ch == 'O')
            return 6;
        else if(ch == 'P' || ch =='Q'|| ch == 'R')
            return 7;
        else if(ch == 'S' || ch =='T'|| ch == 'U')
            return 8;
        else if(ch == 'V' || ch =='W'|| ch == 'Y' || ch == 'Z')
            return 9;
        else
            return 0;
    }
 }
