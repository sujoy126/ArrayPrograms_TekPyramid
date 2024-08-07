package arrayPrograms;
//21.	WAP to find the smallest element in a given Array

public class SmallestElement {
	public static void main(String[] args) {
		int ary[]= {4,3,6,9,10,6,-1};
		int min=ary[0];
		for(int i=1; i<ary.length; i++) {
			if(ary[i]<min) {
				min = ary[i];
			}
		}
		
		System.out.println(min);
	}

}
