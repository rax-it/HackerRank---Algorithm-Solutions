import java.util.Arrays;

/**
 * 
 */

/**
 * @author rax
 *
 */
public class Insertion_sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 1, 9, 5, 12, 11, 2, 4};
		System.out.println(Arrays.toString(arr));
		
		for (int i=1; i<arr.length; i++) {
			int index = arr[i];
			int j = i;
			while(j>0 && arr[j-1]>index) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = index;
		}
		System.out.println(Arrays.toString(arr));
	}
}
