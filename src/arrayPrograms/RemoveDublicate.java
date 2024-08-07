package arrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDublicate {
	public static void main(String[] args) {
		int ary[]= {9,8,9,5,9,4,4,2,30};
		
		Set<Integer> s = new HashSet<>();
		for(int i: ary) {
			s.add(i);
		}
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(s);
		
		for(int i=0; i<list.size(); i++) {
			list.get(i);
		}
		System.out.println(list);
		System.out.println("===================");
		for(int a: s) {
			System.out.println(a);
		}
	}

}
