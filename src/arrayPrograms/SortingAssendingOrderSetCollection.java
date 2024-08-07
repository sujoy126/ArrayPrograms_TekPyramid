package arrayPrograms;

import java.util.Set;
import java.util.TreeSet;

//16.	WAP to sort a given Array in Ascending Order

public class SortingAssendingOrderSetCollection {
	public static void main(String[] args) {
		int ary[]= {8,4,1,9,11,7,4};
		Set<Integer> allNum = new TreeSet<>();
		for(int a: ary) {
			allNum.add(a);
		}
		for(int num: allNum) {
			System.out.println(num);
		}
		
		
	}
	

}
