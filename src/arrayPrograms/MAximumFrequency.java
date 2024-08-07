package arrayPrograms;
//15.	WAP to print the maximum frequency element in a given Array

public class MAximumFrequency {
	public static void main(String[] args) {
		int ary[] = {3,4,3,9,9,9,9,9,3};
		
		int maxCount = 0;
		int maxFrequencyElement = ary[0];
		for(int i=0; i<ary.length; i++) {
			int count = 0;
			for(int j=0; j<ary.length; j++) {
				if(ary[i]==ary[j]) {
					count++;
				}
			}
			if(count>maxCount) {
				maxCount = count;
				maxFrequencyElement =ary[i];
			}
		}
		System.out.println(maxFrequencyElement+" is "+ maxCount);
		
	}

}
