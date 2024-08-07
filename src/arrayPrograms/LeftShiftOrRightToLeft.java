package arrayPrograms;

//8.	WAP to perform the left Shift in an Array
public class LeftShiftOrRightToLeft {
	public static void main(String[] args) {
		int ary[] = {1,2,3,4,5,6,7,8};
		int firstElement = ary[0];
		
		int anotherAry[] = new int[ary.length];
		for(int i=0; i<ary.length-1; i++) {
			anotherAry[i]  = ary[i+1];
		}
		
		anotherAry[ary.length-1]=firstElement;
		
		for(int a: anotherAry) {
			System.out.print(a+" ");
		}
	}

}
