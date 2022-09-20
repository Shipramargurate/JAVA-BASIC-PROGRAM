import java.util.*;

class ArrayElementprint{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);           // scanner input
	System.out.println("Enter the size of array : ");
	int size = sc.nextInt();                        //storing input
	System.out.println("Enter the elements of array : ");
	int[] arrayE = new int[size];                // array object

	for(int i = 0; i < arrayE.length; i++) {      // for loop to assigning values
	arrayE[i] = sc.nextInt();
}
	System.out.println("Elements of array is : ");

        for(int i = 0; i < arrayE.length; i++)        // for printing
{
	System.out.println(arrayE[i]);            // printing
		}
	}
}