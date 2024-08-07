package arrayPrograms;

import java.util.Arrays;

public class Matrix2And2 {
	public static void main(String[] args) {
		int a[][] = {
				    {1,2,3},
				    {3,4,5}};
	                
	    int b[][]= {
	    		    {5,6,4,5},
	    		    {7,8,4,6},
	    		    {1,1,1,6}
	                };
	    int product[][] =new int[a.length][b[0].length] ;
	    
	    for(int i=0; i<a.length; i++) {
	    	for(int j=0; j<b[0].length; j++) {
	    		for(int k=0; k<a.length;k++) {
	    			product[i][j]+= a[i][k]* b[k][j];
	    		}
	    		System.out.print(product[i][j]+" ");
	    	
	    	}
	    System.out.println();	
	    }
	    }

}
