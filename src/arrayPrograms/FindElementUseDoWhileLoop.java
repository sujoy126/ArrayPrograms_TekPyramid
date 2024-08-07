package arrayPrograms;

public class FindElementUseDoWhileLoop {
	public static void main(String[] args) {
		int m[] = {2,3,4,5,6,7,8,9,0,1};
		int i=0;
		do{
			System.out.println(m[i]);
			i++;
		}
		while(i<m.length);
	}

}
