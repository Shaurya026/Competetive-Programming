/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t -- > 0){
		    int n = s.nextInt();
		    long arr[] = new long[n];
		    for(int i=0 ; i<n ; i++)
		        arr[i] = s.nextLong();
		    Arrays.sort(arr);
		    int k = 0;
		    long sum = 0;
		    for(int i=n-1 ; i>= 0 ; i--){
		        if(arr[i] - k >= 0)
		            sum += (arr[i] - k)%1000000007;
		        k++;
		    }
		    System.out.println(sum%1000000007);
        }
        s.close();
	}   
}
