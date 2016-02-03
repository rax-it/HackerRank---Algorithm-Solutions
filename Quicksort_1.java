import java.util.Arrays;

/**
 * 
 */

/**
 * @author rax
 *
 */
public class Quicksort_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 1, 9, 3, 12, 11, 2, 4, 6};
		System.out.println(Arrays.toString(arr));
		int p = arr[0];
		int min_i = 0, max_i = 0;
		int min_arr[] = new int[arr.length-1];
		int max_arr[] = new int[arr.length-1];
		
		for (int i=1; i<arr.length; i++) {
			if (arr[i] <= p) {
				min_arr[min_i] = arr[i];
				min_i++;
			}
			else {
				max_arr[max_i] = arr[i];
				max_i++;
			}
		}
		for (int a=0; a<min_i; a++) System.out.print(min_arr[a]+" ");
		System.out.print(p+" ");		
		for (int a=0; a<max_i; a++) System.out.print(max_arr[a]+" ");

	}

}
