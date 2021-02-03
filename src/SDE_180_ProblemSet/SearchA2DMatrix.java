package SDE_180_ProblemSet;

import java.util.Scanner;

public class SearchA2DMatrix {
	
	public static void main(String [] args) {
		
		Scanner sc= new Scanner(System.in);
		int m =sc.nextInt();
		int n=sc.nextInt();
		int target=sc.nextInt();
		int [][] matrix=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println(searchMatrix(matrix,target));
		sc.close();
	}
	

	//1.Brute force soln   : O(m*n)
	/*public static boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix.length;
		int n = matrix[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == target)
					return true;
			}
			return false;
		}*/
	
	
	//2.Another way we could do binary search in each row : O(m*logn)
	//3. Modifying Approach #2
	/*public static boolean searchMatrix(int [][]matrix,int target) {
		int m = matrix.length;
		int n = matrix[0].length;
		int i=0,j=n-1;
		
		while(i<m&&j>=0) {
			if(matrix[i][j]==target) {
				return true;
			}else if(matrix[i][j]>target) { //eg. matrix[0][3]==3? 
				j--;
			}else {
				i++;
			}
		}
		return false;
	}*/
	
	//4. Since the array is sorted,we can store the 2D matrix in an array and use binary search
	//But that would cost us an extra array of space O(m*n)
	
	//5.Optimal soln   : O(log(m*n))
	public static boolean searchMatrix(int [][]matrix,int target) {
		
	       if(matrix.length==0) {
				return false;
			}
			int m=matrix.length;
			int n=matrix[0].length;
			
			int low=0;
			int high=(m*n)-1;
			
			while(low<=high) {
				int mid = (low+(high-low)/2);
				if(matrix[mid/n][mid%n]==target)
					return true;
				else if(matrix[mid/n][mid%n]>target) {
					high=mid-1;
				}
				else {
					low=mid+1;
				}
			}		
			return false;		
		}
	
}
