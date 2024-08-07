package arrayPrograms;

public class PalendrameWithNumber {
	public static void main(String[] args) {
		int num = 120;
		int secNum =num;
		int revNUm=0;
		do{ 
		    revNUm = revNUm*10+num%10;
		    num = num/10;
		}
		while(num!=0);
		
		if(secNum==revNUm) {
			System.out.println("palendorme");
		}
		else
			System.out.println("not a pelendrom");
		
		System.out.println("=================");

	}
}
