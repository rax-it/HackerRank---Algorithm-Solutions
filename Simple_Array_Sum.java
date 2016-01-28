import java.util.Scanner;

/**
 * 
 */

/**
 * @author rax
 *
 */
public class Simple_Array_Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		/*
		String st = "My name is Rakshit";
		Scanner sc = new Scanner(st);
		int x;
		while (sc.hasNext()) {
			System.out.println(sc.next());
		}
		*/
//		System.out.println(args.length);
		for(int i=0; i<Integer.parseInt(args[0]); i++) {
			sum = sum + Integer.parseInt(args[i+1]);
		}
		System.out.println(sum);
	}
}
