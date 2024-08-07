package arrayPrograms;

public class SortingAssendingBubleSort {
	public static void main(String[] args) {
		int ary[] = {4,1,7,9,2,8};
		for(int i=0; i<ary.length;i++) {
			for(int j=i+1; j<ary.length; j++) {
				if(ary[j]<ary[i]) {
					int temp = ary[j];
					ary[j] = ary[i];
					ary[i] =temp;
				}
			}
			System.out.println(ary[i]);
		}
		
	}

}
