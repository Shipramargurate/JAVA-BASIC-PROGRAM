class ArrayLargestElement{

	static int[] arr = {9, 99, 999, 9999, 99999};  //array declaration

	static int largest()              // integer return type method 
{
	 int max = arr[0];           //  fixing the value of array at index 0

	 for(int i = 1; i < arr.length; i++)  // for looop for traversal

		if (arr[i] > max) // checking condition
		max = arr[i];  
		return max;               
}
	public static void main(String[] args){

	System.out.println("Largest in given array is : " + largest()); // printing large number 
	}
}
