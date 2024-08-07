package arrayPrograms;

//4.	WAP to find the average of the elements in a given Array

public class FindAverage {
	public static void main(String[] args) {
		int a[]= {3,4,5};
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum= sum+ a[i];
		}
		double avg = sum/ a.length;
		System.out.println(avg);
	}

}
