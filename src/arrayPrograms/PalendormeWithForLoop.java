package arrayPrograms;

public class PalendormeWithForLoop {
	public static void main(String[] args) {
		int num = 121;
		int  secndNum =num;
		int thirdNum = num;
		int count =0;
		int rev=0;
		  
		 do {
			num = num/10;
			count++;
		} while (num!=0);
		int upeerLimit=count;
		
		for(int i=1; i<=upeerLimit; i++) {
			rev = rev*10+num%10;
			secndNum =secndNum/10;	
		}
		if(thirdNum==rev) {
			System.out.println("palendrome");
		}
		else
			System.out.println("not a pelendrome number");
	}

}
