import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Maximum_subarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t, n;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for (int t_i=0; t_i<t; t_i++) {
            n = sc.nextInt();
            int arr[] = new int[n];
            for (int arr_i=0; arr_i<n; arr_i++) {
                arr[arr_i] = sc.nextInt();
            }
            
        int ans = 0, sum = 0, total_sum = 0;
		
        for (int i = 0; i<arr.length; i++) {
			if (arr[i] > 0)
				total_sum = total_sum + arr[i];
			sum = sum + arr[i];
			if (sum < 0)
				sum = 0;
			if (ans < sum)
				ans = sum;
			}
          System.out.print(ans);
		  System.out.print(" "+total_sum);
          System.out.println();
        }        
    }
}