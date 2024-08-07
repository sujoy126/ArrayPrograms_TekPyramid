package arrayPrograms;
//6.	WAP to merge two Array elements

import java.util.ArrayList;
import java.util.Arrays;

public class MargeTwoArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
	    int b[] = {6,7,8,9,10};
	    
	    ArrayList<Integer> list1 = new ArrayList<>();
	    for(int a1 : a) {
	    	list1.add(a1);
	    }
	    
	    ArrayList<Integer> list2 = new ArrayList<>();
	    for(int b1 : b) {
	    	list1.add(b1);
	    }
	    
	    list1.addAll(list2);
	    
	    int mrg[] = new int[list1.size()];
	    
	    for(int i=0; i<list1.size(); i++) {
	    	mrg[i] = list1.get(i);
	    }
	    System.out.println(Arrays.toString(mrg));
	    	    
	}

}
