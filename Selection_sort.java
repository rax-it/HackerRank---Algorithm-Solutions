import java.util.Arrays;

/**
 * 
 */

/**
 * @author rax
 *
 */
public class Selection_sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3, 1, 9, 5, 12, 11, 2, 4};
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i<arr.length; i++) {
			int min = i;
			for (int j = i+1; j<arr.length; j++) {
				if(arr[j] < arr[min]) 
					min = j;
			}
			if (min !=i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}
}
