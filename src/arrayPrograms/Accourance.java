package arrayPrograms;
// 14.	WAP to find the frequency or occurrence of an element in a given Array
//      (How many times an element is repeated in a given array)

public class Accourance {
	public static void main(String[] args) {
		int ary[]= {1,2,3,9,9,9,3,1,2,4};
		       
        for (int i = 0; i < ary.length; i++) {
        	int count = 0;
            for(int j=0; j< ary.length; j++) {
               if(ary[i]==ary[j] && i>j) {
            	   break;
               }
               if(ary[i]== ary[j]) {
            	   count++;
               }
            }
            if(count>0) {
            	System.out.println(ary[i]+" accourance "+ count);
            }
          }
        
		
	}

}
