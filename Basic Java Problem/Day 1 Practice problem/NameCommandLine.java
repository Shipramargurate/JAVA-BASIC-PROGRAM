import java.util.*;

class NameCommandLine{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name : ");
		String name = sc.nextLine();

		System.out.println("My Name is " + name );
	}
}