import java.util.*;

class LeapYear {
	
	public static void main(String[] args) {
		System.out.println("Enter any year");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		
	if( year % 100 == 0 && year % 400 == 0 || year % 100 != 0  && year % 4 == 0 || year >= 1582)

	System.out.println("Leap Year");

	else

	System.out.println("Not a leap year");

	}
}