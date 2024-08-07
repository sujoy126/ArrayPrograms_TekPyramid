package arrayPrograms;

//20.	WAP to find the Second largest element in a given Array
public class SecondLargestElement {
	public static void main(String[] args) {
		int ary[] = {1,2,3,4,5,98,45};
		int max=0;
		int seconMax =0;
		for(int i=0; i<ary.length; i++) {
			if(ary[i]>max) {
				max =ary[i];
			}			
			if(ary[i]> seconMax && ary[i]<max) {
				seconMax =ary[i];
			}
		}
		System.out.println(seconMax);
	}

}
