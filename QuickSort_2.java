import java.util.Arrays;

public class QuickSort_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 3, 9, 8, 2, 7, 5};
		printArray(arr);
		quickSort(arr, 0, arr.length-1);
		printArray(arr);
	}

	private static void quickSort(int[] arr, int startIndex, int lastIndex) {
		// TODO Auto-generated method stub
		int pivotIndex;
		if (startIndex >= lastIndex) return;
		pivotIndex = partition(arr, startIndex, lastIndex);
		quickSort(arr, startIndex, pivotIndex-1);
//		printArray(arr);
		quickSort(arr, pivotIndex+1, lastIndex);
	}

	private static int partition(int[] arr, int startIndex, int lastIndex) {
		// TODO Auto-generated method stub
		int pivot = arr[startIndex];
		int pIndex = lastIndex;
		for (int i=lastIndex; i>startIndex; i--) {
			if (arr[i] >= pivot) {
				int temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				pIndex--;
			}
		}
		int temp = arr[startIndex];
		arr[startIndex] = arr[pIndex];
		arr[pIndex] = temp;
		printArray(arr);
		return pIndex;
	}
	
	 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
}
