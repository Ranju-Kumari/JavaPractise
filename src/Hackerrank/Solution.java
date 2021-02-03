package Hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> arr) {
    	int k=0;
    	int a[]=new int[arr.size()];
    	for(int arrEle : arr) {
    		a[k++]=arrEle;
    	}
    	int max = 1;
		for(int i=0;i<a.length;i++) {
			int c1=1;int c2 =1;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]==a[i]-1 || a[j]==a[i]) {
					c1++;
				}
				if(a[j]==a[i]+1 || a[j]==a[i]) {
					c2++;
				}
				if(c1>max) {
					max=c1;
				}
				if(c2>max) {
					max=c2;
				}
			}
		}
		return max;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
