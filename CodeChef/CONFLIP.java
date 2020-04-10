/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception{
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t -- > 0){
	        long g = s.nextLong();
	        while(g-- > 0){
	            int i = s.nextInt();
	            long n = s.nextLong();
	            int q = s.nextInt();
	            if(i == q){
	                System.out.println(n/2);
	            }
	            else if( i != q){
	                if(n%2 == 0)
	                    System.out.println(n/2);
	                else
	                    System.out.println(n/2 + 1);
	            }
	        }
	    }
	}
}
// Input:
// 1
// 2
// 1 5 1
// 1 5 2

// Output:
// 2
// 3
