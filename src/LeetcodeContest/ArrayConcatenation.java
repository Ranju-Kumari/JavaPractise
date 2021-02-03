package LeetcodeContest;

public class ArrayConcatenation {

	public static void main(String [] args) {
		
		
		
		int [] arr = new int[100];
	}
	
	
	 public boolean canFormArray(int[] arr, int[][] pieces) {
	     int k=0;
		 for(int i=0;i<pieces.length;i++) {
			 for(int j=0;j<pieces.length;j++) {
				 while(k<arr.length) {
					 if(pieces[i][j]==arr[k++]) {
						 return true;
					 } 
				 }
			 }
		 }
		 return false;
	    }
}
