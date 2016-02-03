/**
 * 
 */

/**
 * @author rax
 *
 */
public class Cut_the_sticks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]), count;
		int arr[] = new int[n];
		int min = arr[0];
//		System.out.println(n);
		for (int arr_i=0; arr_i < n; arr_i++) {
			arr[arr_i] = Integer.parseInt(args[arr_i+1]);
		}
		do {
			count = 0;
		for (int arr_i=0; arr_i < n; arr_i++) {
			if (arr[arr_i] < min && arr[arr_i] > 0) {
				min = arr[arr_i];
			}
		}
//		System.out.println("Min: "+min);
		for (int arr_i=0; arr_i < n; arr_i++) {
			arr[arr_i] = arr[arr_i] - min;
			if (arr[arr_i] > 0) {
				count++;
			}
		}
		if(count != 0) {
			System.out.println(count);
		}
		min = 1000;
		} while (count > 0);		
	}
}
