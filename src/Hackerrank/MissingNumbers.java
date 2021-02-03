package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumbers {

	public static void main(String [] args) throws InterruptedException {
		
		Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();
		int []a=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int m= sc.nextInt();
		int []b=new int[m];
		for(int i=0;i<m;i++) {
			b[i]=sc.nextInt();
		}
		
		missinNum(a,b);
		
	}
	
	public static void missinNum(int [] a,int [] b) throws InterruptedException {
		
		int [] f1=frequency(a);
		int [] f2=frequency(b);
		int c1=0,c2=0;
		for(int i =0; i<f1.length;i++) {
			if(f1[i]!=0) {
				c1++;
			}
			
		}
		for(int i =0; i<f2.length;i++) {
			if(f2[i]!=0) {
				c2++;
			}
		}
		
		
		int [] f11=new int[c1];
		int []  f22 =new int[c2];
		int nums[] =new int[c1];
		int p=0,q=0,r=0;
		
		for(int i=0;i<f1.length;i++) {
			if(f1[i]!=0) {
				f11[p++]=f1[i];
				nums[r++]=i;
			}
		}
		
		for(int i=0;i<f2.length;i++) {
			if(f2[i]!=0) {
				f22[q++]=f2[i];
			}
		}
		
		int temp[]=new int[c2];
		int j=0;
		for(int i=0;i<f22.length;i++) {
			if(f11[i]!=f22[i]) {
				temp[j++]=nums[i];
			}
		}
		for(int i=0;i<temp.length;i++) {
			if(temp[i]!=0)
			System.out.print(temp[i]+" ");
		}
		
	}
	
	public static int [] frequency(int []a) {
		int [] freq = new int[(int) Math.pow(10, 4)];
		for(int i =0 ;i<freq.length;i++) {
			freq[i] = 0;
		}
		
		for(int i=0;i<a.length;i++) {
				freq[a[i]] =freq[a[i]]+1;
		}
		return freq;
	}
		
	/*public static void missinNum(int []a,int []b) {
		
		Arrays.sort(a);
		Arrays.sort(b);
		int len;
		if(a.length<b.length)
			len=b.length;
		else
			len=a.length;
		int j=0;
		for(int i=0;i<len;i++) {
			if(a[j]==b[i]) {
				b[i]='$';j++;
			}
		}
		
		for(int i=0;i<b.length;i++) {
			if(b[i]!='$')
				System.out.print(b[i]+" ");
		}
		
	}*/
}
