package arrayPrograms;

import java.util.Arrays;

public class ReverseOrderForEachLoop {
	public static void main(String[] args) {
		 int ary[] ={1,2,3,9,100};
	        int ar[] = new int[ary.length];
	        int n=ary.length-1;
	        System.out.println(n);

	        for(int i :ary){
	            ar[n] = i;
	            n=n-1;
	            System.out.println(n);
	        }
	        System.out.println(Arrays.toString(ar));
	}

}
