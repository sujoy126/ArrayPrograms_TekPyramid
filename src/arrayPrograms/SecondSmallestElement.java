package arrayPrograms;
//22.	WAP to find the Second smallest element in a given Array
public class SecondSmallestElement {
	public static void main(String[] args) {
		int ary[] = {54,7,8,21,44,56};
		int min =ary[0];
		int secondMin=Integer.MAX_VALUE;
		for(int i=1; i<ary.length; i++) {
			if(ary[i]<min) {
				min = ary[i];
			}	
		}
		for(int j=0; j<ary.length; j++) {
			if(ary[j]>min && ary[j]<secondMin) {
				secondMin = ary[j];
			}
		}
		System.out.println(secondMin);
	}

}
