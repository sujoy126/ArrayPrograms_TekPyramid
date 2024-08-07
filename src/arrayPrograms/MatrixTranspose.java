package arrayPrograms;

public class MatrixTranspose {
	public static void main(String[] args) {
		int a[][]= {{1,2},
				    {3,4}};
		
		int rows = a.length;
        int cols = a[0].length;

        // Create a new matrix to store the transposed result
        int[][] transposedMatrix = new int[cols][rows];
        
         
        // Transpose the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = a[i][j];
            }
        }
        
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
        }
	}
