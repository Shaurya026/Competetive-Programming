/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0 ){
		    int n = s.nextInt();
		    int arr[] = new int[n];
		    for(int i =0 ; i<n ; i++)
		        arr[i] = s.nextInt();
		    // every number has 0 as it's factor and if you see 
		    // by forming the series we see that smallest number and 0 is the largest jump
		    Arrays.sort(arr);
		    System.out.println(arr[0]);
		}
	}
}
