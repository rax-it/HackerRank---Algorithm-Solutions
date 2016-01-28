/**
 * 
 */

/**
 * @author rax
 *
 */
public class Angry_professor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner in = new Scanner(System.in);
		int count_present = 0;
        int t = Integer.parseInt(args[0]);
        for(int a0 = 0; a0 < t; a0++){
            int n = Integer.parseInt(args[1]);
            int k = Integer.parseInt(args[2]);
            int a[] = new int[n];
            
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = Integer.parseInt(args[a_i+3]);
                if (a[a_i] <= 0) {
                	count_present++;
                }
            }
            if (count_present >= k) {
            	System.out.println("YES");
            }
            else {
            	System.out.println("NO");
            }
            count_present = 0;
        }
	}
}
