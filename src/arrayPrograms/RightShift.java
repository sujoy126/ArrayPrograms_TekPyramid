package arrayPrograms;

public class RightShift {
	public static void main(String[] args) {
		int ary[] = {1,2,3,4,5,6,7};
		int  lastAry = ary[ary.length-1];
		for(int i=ary.length-1; i>0; i--) {
			ary[i] = ary[i-1];
		}
		ary[0] = lastAry;
		
		for(int a : ary) {
			System.out.println(a);
		}
	}

}
