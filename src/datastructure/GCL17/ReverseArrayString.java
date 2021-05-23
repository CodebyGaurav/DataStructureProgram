/*Write a program to reverse an array or string*/

package datastructure.GCL17;

public class ReverseArrayString {

	private static void rvereseArrayString(int[] arr, int i, int j) {
		int temp;
		while(i<j) {
			temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
			
		}
	}

	private static void printArrayString(int[] arr, int i) {

		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();
	}
	
	
	
	
	public static void main(String[] args) {
		int d=2;
		int arr[] = {1, 2, 3, 4, 5, 6};
		int n=arr.length; 							//6
		printArrayString(arr, 6);
        rvereseArrayString(arr, 0, n-1);			//reverse arary
        System.out.print("Reversed array is \n");
        printArrayString(arr, 6);
        //
        rvereseArrayString(arr, 0, n-d-1);          //reverse some part array
        System.out.print("Reversed array d=1 is \n");
        printArrayString(arr, 6);
        //
        rvereseArrayString(arr, n-d, n-1);          //reverse rest part of array
        System.out.print("Reversed array d=2 is \n");
        printArrayString(arr, 6);
	
	
	}

}
