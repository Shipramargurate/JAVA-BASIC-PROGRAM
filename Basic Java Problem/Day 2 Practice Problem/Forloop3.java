import java.util.*;
 
class Forloop3 {

// Write a Program to find Palindrome Number using for loop
	 

	public static void main(String[] args) {
		int num = 0, rem = 0, sum = 0,c = 0;
		
		Scanner sc = new Scanner(System.in);	//Taking user input
		System.out.println("Enter a number ");
		num = sc.nextInt();
		c = num;
		for (   ;  num > 0 ;   ) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		 
		if ( c == sum ) {
			 System.out.println("Palindrome Number");
		}
		 else { 
			 System.out.println("Not a palindrome number");
		 }
			
	}

}