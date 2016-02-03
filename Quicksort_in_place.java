import java.util.Arrays;

public class Quicksort_in_place {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 3, 9, 8, 2, 7, 5};
		quickSort(arr, 0, arr.length-1);
	}

	private static void quickSort(int[] arr, int startIndex, int lastIndex) {
		// TODO Auto-generated method stub
		int pivotIndex;
		if (startIndex >= lastIndex) return;
		pivotIndex = partition(arr, startIndex, lastIndex);
		quickSort(arr, startIndex, pivotIndex-1);
		quickSort(arr, pivotIndex+1, lastIndex);
	}

	private static int partition(int[] arr, int startIndex, int lastIndex) {
		// TODO Auto-generated method stub
		int pivot = arr[lastIndex];
		int pIndex = startIndex;
		for (int i=startIndex; i<lastIndex; i++) {
			if (arr[i] <= pivot) {
				int temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				pIndex++;
			}
		}
		int temp = arr[lastIndex];
		arr[lastIndex] = arr[pIndex];
		arr[pIndex] = temp;
		printArray(arr);
		return pIndex;
	}
	
	public static void printArray(int[] arr) {
		for (int x:arr) System.out.print(x+" ");
		System.out.println();
	}
}
