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
		while(t-->0){
		    int m = s.nextInt();
		    int arr[][] = new int[m][];
		    for(int i=0 ; i<m ; i++){
		        arr[i] = new int[i+1];
		        for(int j=0 ; j<i+1 ; j++)
		            arr[i][j] = s.nextInt();
		    }
		    for(int i=m-1 ; i>0 ; i--){
		        for(int j=0 ; j<i ; j++){
		            arr[i-1][j] += (arr[i][j] > arr[i][j+1]) ? arr[i][j] : arr[i][j+1];
		        }
		    }
		    System.out.println(arr[0][0]);
		}
	}
}
