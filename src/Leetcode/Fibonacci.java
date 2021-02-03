package Leetcode;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String [] args) {
		
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(fib(num));
		sc.close();
	}
	
	//Iterative Approach
	//Time complexity : O(N). Each value from 2 to N will be visited at least once. 
	//The time it takes to do this is directly proportionate to N where N is the Fibonacci Number we are looking to compute.
	
	//Space complexity : O(1)O(1). This requires 1 unit of Space for the integer N and 3 units of Space to store the computed values (curr, prev1 and prev2) for every loop iteration.
	// The amount of Space doesn't change so this is constant Space complexity.
	
	public static int fib(int N) {
		int n1=0,n2=1;
		int n3 = 0;
		if(N<=1)
			return N;
		
		for(int i=0;i<N-1;i++){
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		return n3;
	}
	
	
	//Recursive appproach
	//Time complexity : O(2^N).(Worst) This is the slowest way to solve the Fibonacci Sequence because it takes exponential time. 
		//The amount of operations needed, for each level of recursion, grows exponentially as the depth approaches N.

		//Space complexity : O(N). We need space proportionate to N to account for the max size of the stack, in memory. 
		//This stack keeps track of the function calls to fib(N). 
		//This has the potential to be bad in cases that there isn't enough physical memory to handle the increasingly growing stack, leading to a StackOverflowError. 
		//The Java docs have a good explanation of this, describing it as an error that occurs because an application recurses too deeply.
	
	/*public int fib(int N) {
        if (N <= 1) {
            return N;
        }
        return fib(N-1) + fib(N-2);
    }*/
	
}
