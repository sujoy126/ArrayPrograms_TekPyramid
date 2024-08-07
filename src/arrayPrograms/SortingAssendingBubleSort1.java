package arrayPrograms;

import java.util.Arrays;

public class SortingAssendingBubleSort1 {
	public static void main(String[] args) {
		int ary[] = {6,2,1,7,9,10,4};
		for(int i=0;i<ary.length; i++) {
			for(int j=0; j<ary.length-1; j++) {
				if(ary[j]> ary[j+1]) {
					int temp = ary[j+1];
					ary[j+1]= ary[j];
					ary[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(ary));
	}

}
