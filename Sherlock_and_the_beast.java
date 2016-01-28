/**
 * 
 */

/**
 * @author rax
 *
 */
public class Sherlock_and_the_beast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0;
		int t = Integer.parseInt(args[0]);
        for(int a0 = 0; a0 < t; a0++){
            int n = Integer.parseInt(args[a0+1]);
            while (n%3 != 0) {
            	n--;
            	c++;
            	
            }
            
            
        }
	}

}
