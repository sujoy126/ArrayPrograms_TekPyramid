package arrayPrograms;

public class SorthingDescendingOrder {
	public static void main(String[] args) {
		int ary[]= {4,3,2,9,10,44};
		for(int i=0; i<ary.length; i++) {
			for(int j=i+1; j<ary.length; j++) {
				if(ary[j]>ary[i]) {
					int temp = ary[j];
					ary[j] = ary[i];
					ary[i]= temp;
				}
			}
			System.out.println(ary[i]);
		}
		
	}

}
