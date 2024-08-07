package arrayPrograms;
// 11.	WAP to perform the Right shift in an Array n number of times (n is user specified value)

public class RightShift_N_NumberOfTime {
	public static void main(String[] args) {
		int ary[]= {1,2,3,444,5,6,70,90};
		
		int totalIteration =5;
		for(int i=1; i<=totalIteration; i++) {
			int lastAry = ary[ary.length-1];
			for(int j=ary.length-1; j>0; j--) {
				ary[j] = ary[j-1];
			}
			ary[0] = lastAry;
		}
		for(int a: ary) {
			System.out.println(a);
		}
	}

}
