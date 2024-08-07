package arrayPrograms;

public class MatrixSum {
	public static void main(String[] args) {
		int a[][] = {
			    {1,2,9},
			    {3,4,9}};
                
    int b[][]= {
    		    {1,2,3},
    		    {3,4,5}
                };
    int sum[][] =new int[a.length][b[0].length] ;
    
    for(int i=0; i<a.length; i++) {
    	for(int j=0; j<b[0].length; j++) { //two j loop
    		{
				sum[i][j]=  a[i][j] + b[i][j];	
    	}
    			System.out.print(sum[i][j]+" ");
    }
 	  System.out.println();
    }
	}

}
