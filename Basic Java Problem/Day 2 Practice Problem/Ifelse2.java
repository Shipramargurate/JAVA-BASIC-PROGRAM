import java.util.*;

class Ifelse2 {

	//  Read a Number 1,10,100,1000 and display unit, ten hundred
	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		if (num == 1) {
			System.out.println("unit");
		}
		else if (num == 10) {
			System.out.println("ten");
		}
		else if (num == 100) {
			System.out.println("hundred");
		}
		else if (num == 1000) {
			System.out.println("thousand");
		}
		else if (num == 10000){
		        System.out.println("ten thousand");
		}

		else  {
			System.out.println("invalid input");
		}


	}

}