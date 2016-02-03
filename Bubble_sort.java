import java.util.Arrays;

/**
 * 
 */

/**
 * @author rax
 *
 */
public class Bubble_sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 2, 9, 5, 12, 11, 1};
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i<arr.length; i++) {
			for (int j = 1; j<arr.length-i; j++) {
				if (arr[j-1] > arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
