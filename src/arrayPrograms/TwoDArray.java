package arrayPrograms;

import java.util.Arrays;

public class TwoDArray {
	public static void main(String[] args) {
		int a[][] = {{1,2},{3,4}};
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
