package arrayPrograms;

//19.	WAP to find the largest element in a given Array

public class LargestElement {
	public static void main(String[] args) {
		int ary[] = {4,5,9,21,66,43,70,678};
		int max=0;
		for(int i=0; i<ary.length; i++) {
			if(ary[i]>max) {
				max=ary[i];
			}
		}
		System.out.println(max);
	}

}
