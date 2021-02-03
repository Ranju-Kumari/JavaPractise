package SDE_180_ProblemSet;

import java.util.Scanner;

public class Pow {

	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		double x = sc.nextDouble();
		int n=sc.nextInt();
		System.out.println(myPow(x,n));
		sc.close();
	}
	
	public static double myPow(double x, int n) {
		
		double product =1.0;
		if(x == 1 || n == 0)
            return 1;
        if(x == -1)
		    return n % 2 == 0 ? 1 : -1;
        if(n == Integer.MIN_VALUE)
            return 0;
        int num=n;
        if(num<0)
        	num=-1*num;
		while(num>0) {
			if(num%2!=0) {
				product = product*x;
				num=num-1;
			}
			else {
				x=x*x;
				num=num/2;
			}
		}
		
		if(n<0)
			product= (double)1.0/(double)product;
		return product;
    }
	
	
	//Time:O(n)  Space: O(1)
    /*public static double myPow(double x, int n) {
        double product =1;
        if(n==0)
        	return 1;
        if(n==1) 
        	return x;
        if(n>0) {
        	for(int i=1;i<=n;i++) {
        		product = product*x;
        	}
        }else {
        	x=1/x;
        	for(int i=n;i<0;i++) {
        		product = product*x;
        	}
        }
    	
    	return product;
    }*/
}
