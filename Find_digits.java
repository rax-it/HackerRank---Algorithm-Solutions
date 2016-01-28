/**
 * 
 */

/**
 * @author rax
 *
 */
public class Find_digits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = 1;
		int n, count = 0, digit, d;
		for (int a0=0; a0<t; a0++) {
			n=123456789;
			d = n;
			while (n>0) {
				digit = n%10;
				try {
					if (d%digit == 0) {
						count++;
					}					
				}
				catch(ArithmeticException e) {
					n = n/10;
					continue;
				}
				n = n/10;
			}
		System.out.println(count);
		count = 0;
		}
	}
}
