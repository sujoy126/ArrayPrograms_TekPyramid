package arrayPrograms;

import java.util.Scanner;

public class RangeOFPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("firstnumber");
		int firstInput = sc.nextInt();
		System.out.println("secondNumber");
		int secondInput = sc.nextInt();
		
		int j;
		for(int i=firstInput; i<=secondInput;i++) {
		  for( j=2; j<=secondInput; j++) {
			  if(i%j==0) {
				break;  
			  }
		  }
		  if(i==j) {
			  System.out.println(i);
		  }
	}
	}

}
