/**
 * 
 */

/**
 * @author rax
 *
 */
public class Staircase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int space, star;
		for (int i=0; i<n; i++) {
			space = n-i-1;
			star = i+1;
			while(space-- > 0) {
				System.out.print(" ");
			}
			while(star-- > 0) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
