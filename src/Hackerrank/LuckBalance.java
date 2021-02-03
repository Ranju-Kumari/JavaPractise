package Hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class LuckBalance {

	static int luckBalance(int k, int[][] contests) {

		int count=0;
		for(int i=0;i<contests.length;i++) {
			if(contests[i][1]==1) {
				count++;
			}
		}
		int c[] =new int[count];
		int j=0;int luck=0;
		for(int i=0;i<contests.length;i++) {
			if(contests[i][1]==1) {
				c[j++]=contests[i][0];
			}
			else {
				luck+=contests[i][0];
			}
		}
		
		Arrays.sort(c);
		for(int i=0;i<c.length;i++) {
		}
		int itr=1;
		for(int i=c.length-1;i>=0;i--) {
			if(itr<=k) {
				luck+=c[i];
			}else {
				luck-=c[i];
			}
			itr++;
		}
		return luck;
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
    	int n = sc.nextInt();
    	int k=sc.nextInt();
    	int contests[][]=new int[n][2];
    	
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<2;j++) {
    			contests[i][j]=sc.nextInt();
    		}
    	}

        int result = luckBalance(k, contests);

        System.out.println(result);
        sc.close();
    }
}
