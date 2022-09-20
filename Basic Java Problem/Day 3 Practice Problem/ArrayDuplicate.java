class ArrayDuplicate
{
public static void main(String[] args){


  	int[] arr = {9, 9, 7, 3, 4, 2, 4, 2};    //delcration of array
	System.out.println("Duplicate elements in given array: ");
	for(int i = 0; i < arr.length; i++) {
		for(int k = i + 1; k < arr.length; k++) // searching for dublicate elements {
			if(arr[i] == arr[k])

		System.out.println(arr[k]);
			}
		}
	}
} 