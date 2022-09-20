import java.util.*;
class SpringSeason {
	/* 
	 * Write a program SpringSeason.java that takes two int values 
	 * m and d from the command line and prints true if day d
	 * of month m is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), false otherwise. 
	 */
	
	public static void main(String[] args) {
		int d,  m;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Day");
		d = sc.nextInt();
		
		System.out.println("Enter Month");
		m = sc.nextInt();
		
		sc.close();
		
	        if ((m == 3 && d >= 20 && d <= 31) || (m == 4 && d >= 1 && d <= 30) || (m == 5 && d >= 1 && d <= 31) || (m == 6 && d >= 1 && d <= 20)) {
		System.out.println("true");
		} else {
		System.out.println("false");
		}
	}
	

}