import java.util.*;
class ArraySecondLargestNum {

	public static void main(String[] args) {
		System.out.println("Enter size of array");
		Scanner sc = new Scanner(System.in);
		int arrsize = sc.nextInt();
		int arr[] = new int[arrsize];
		System.out.println("Enter elements for array");
		for (int i = 0; i < arr.length; i++) {
			int a = sc.nextInt();
			arr[i] = a;
		}
		Arrays.sort(arr);	
		System.out.println("Second Largest element is "+arr[arr.length-2]);
		sc.close();
		

	}

}