import java.util.*;
class ArraySort
{
public static void main(String[] args) {
	
	int[] arr = new int[5];
	int temp = 0;

	System.out.println("Enter Array Elements : ");
	Scanner sc = new Scanner(System.in);
	for(int i = 0; i < 5; i++){	
			
		arr[i] = sc.nextInt();
	}
	for(int i = 0; i < 5; i++){
		for(int j = i +1; j < 5; j++){
			if(arr[i] > arr[j]){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}

	System.out.println("Elements of array after sorting : ");
	for(int i = 0; i < 5; i++){
		System.out.print(arr[i] + " ");
		}
	}
}