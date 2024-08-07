package arrayPrograms;

import java.util.HashSet;
import java.util.Set;

//13.	WAP to print the duplicate elements present in a given Array

public class PrintDublicateElement {
	public static void main(String[] args) {
		int ary[] = {2,3,5,5,5,6,6,6,6};
		
		Set<Integer> uniqeElement = new HashSet<>();
		Set<Integer> dublicateElement = new HashSet<>();
		for(int i: ary) {
			if(!uniqeElement.add(i)) {
				dublicateElement.add(i);
			}	
		}
		for(int num: dublicateElement) {
			System.out.println(num);
		}
	}

}
