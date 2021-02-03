package Hackerrank;

import java.util.Scanner;

 public class CavityMap {

	public static void main(String [] a) {
		Scanner sc =  new Scanner(System.in);
	    int n = sc.nextInt();
	    char [][]charArray = new char[n][n];

	    for (int i = 0; i < n; i++){
	        String string = sc.next();
	        charArray[i] = string.toCharArray();
	    }
		   cavityMap(charArray);

		   for (int i = 0; i < n; i++) {
			   for(int j=0;j<n;j++) {
				   System.out.print(charArray[i][j]);
			   }
			   System.out.println();
		   }
		    
		   
		    sc.close();		
	}
	
	
	public static void cavityMap(char [][] grid) {
		
		for(int i=1;i<grid.length;i++) {
			for(int j=1;j<grid[i].length;j++) {
				if(grid[i-1][j]=='X'&& grid[i][j-1]=='X'&& grid[i][j+1]=='X'&& grid[i+1][j]=='X') {
					continue;
				}
				
				if(grid[i-1][j]<grid[i][j]&&grid[i][j-1]<grid[i][j]&&grid[i][j+1]<grid[i][j]&&grid[i+1][j]<grid[i][j]) {
					grid[i][j]='X';
				}
			}
		}
    }
	
	
	
	/*public static String[][] cavityMap(String [][] grid) {
		String s = String.valueOf("X");
		char c = 'X';
		System.err.println(s);
		for(int i=1;i<grid.length;i++) {
			for(int j=1;j<grid[i].length;j++) {
				if(grid[i-1][j]=="X"&& grid[i][j-1]=="X"&& grid[i][j+1]=="X"&& grid[i+1][j]=="X") {
					continue;
				}
				
				else if((j>0&& j<grid.length)
						&& (Integer.parseInt(grid[i-1][j])<Integer.parseInt(grid[i][j]))&&(Integer.parseInt(grid[i][j-1])<Integer.parseInt(grid[i][j]))
						&&(Integer.parseInt(grid[i][j+1])<Integer.parseInt(grid[i][j]))&&(Integer.parseInt(grid[i+1][j])<Integer.parseInt(grid[i][j]))) {
					System.err.println(grid[i][j]);
					grid[i][j]=String.valueOf(c);
				}
			}
		}
		return grid;	
    }*/
}
