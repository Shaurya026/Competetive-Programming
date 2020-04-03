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
	        int n = s.nextInt();
	        int arr[] = new int[n];
	        for(int i=0 ; i<n ; i++)
	            arr[i] = s.nextInt();
	        int i = 0;
	        while(arr[i] == 0)
	            i++;
	        boolean ans = true;
	        int feet = 0;
	        for(i += 1  ; i< n ; i++){
	            if(arr[i] == 0 ){
	                feet ++;
	                continue;
	            }
	            else if(arr[i] == 1){
	                if(feet >= 5){
	                    feet = 0;
	                    continue;
	                }
	                else{
	                    System.out.println("NO");
	                    ans = false;
	                    break;
	                }
	            }
	        }
	        if(ans)
	            System.out.println("YES");
        }
        s.close();
	}
}
