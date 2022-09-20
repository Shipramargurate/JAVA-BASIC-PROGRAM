class OddPosition {

	public static void main(String[] args){
	int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //delcration of array

	System.out.println("Elements of given array present on even position: "); 

	for(int i = 0; i < arr.length; i = i + 2){   //start from 1 as first even positioned element is present at position 1

	 System.out.println(arr[i]); 
		}
	}
}