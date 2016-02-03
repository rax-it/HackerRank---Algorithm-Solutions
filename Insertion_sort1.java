import java.util.Arrays;

/**
 * 
 */

/**
 * @author rax
 *
 */
public class Insertion_sort1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 4, 6, 8, 3};
		System.out.println(Arrays.toString(arr));

			int j = arr.length-1;
			int index = arr[j];
			while(j>0 && arr[j-1]>index) {
				arr[j] = arr[j-1];
				j--;
			System.out.println(Arrays.toString(arr));
			}
			arr[j] = index;

		System.out.println(Arrays.toString(arr));
	}
}
