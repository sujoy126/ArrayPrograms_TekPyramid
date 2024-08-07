package arrayPrograms;

//7.	WAP to find whether the given element is present in an Array or not (Linear Search)

public class FindElementPresentInArray {
	public static void main(String[] args) {
		int ary[] = {10,12,13,14,15, 16,18};
		int presentElemrent =1;
		
		for(int i=0; i<ary.length; i++) {
			if(ary[i]==presentElemrent) {
				System.out.println("element is  present");
				return;
			}
		}
				System.out.println("element is not present");
		
		
		}

}
