package arrayPrograms;

import java.util.Scanner;

public class LeftShift_N_numberOfTime {
	public static void main(String[] args) {
		int ary[] = {1,2,3,4,5,6};
		Scanner sc = new Scanner(System.in);
		System.out.println("input");
		int numbers = sc.nextInt();
	
		for(int i=0; i<numbers; i++) {
			int  firstNumber = ary[0];
			for(int j=0; j<ary.length-1; j++) {
				ary[j] = ary[j+1];
			}
			ary[ary.length-1]= firstNumber;
		}
		for(int a: ary) {
			System.out.print(a+" ");
		}
	}

}
