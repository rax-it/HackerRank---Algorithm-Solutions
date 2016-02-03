import java.util.Scanner;

public class SparseArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String st[] = new String[n];
		for(int st_i=0; st_i<n; st_i++) {
			st[st_i] = sc.next();
		}
		int q = sc.nextInt();
		int count = 0;
		for(int i =0; i<q; i++) {
			String temp;
			temp = sc.next();
			for(int st_i=0; st_i<n; st_i++) {
				if(st[st_i].equals(temp) ) {
					count++;
				}
			}
			System.out.println(count);
			count = 0;
		}
	}
}
