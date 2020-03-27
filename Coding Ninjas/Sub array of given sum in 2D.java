import java.io.*;
import java.util.*;
class GFG{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t>0){
            int n = s.nextInt();
            int arr[][] = new int[n][n];
            for(int i=0 ; i<n ; i++){
                for(int j=0 ; j<n ; j++)
                    arr[i][j] = s.nextInt();
            }
            int x = s.nextInt();
            solver solve = new solver();
            if(solve.is_rectangle_there(arr, n, x))
                System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}
class solver
{
    static boolean check_in_row(int r[], int n, int x)
    {
        int sum=0, start=0, end=0;
        while(true)
        {
            if(sum==x)
                return true;
            if(sum>x)
            {
                sum -= r[start];
                start += 1;
            }
            else
            {
                if(end==n)
                    return false;
                sum += r[end];
                end += 1;
            }
        }
    }
    
    static boolean is_rectangle_there( int arr[][], int n, int x )
    {
        int sum_arr[][] = new int[n][n];
        for( int i=0 ; i<n ; i++ ){            
            for( int j=0 ; j<n ; j++ ){
            	sum_arr[i][j] = 0;
            }
     	}
     	
     	for(int i=0; i<n; i++){
            for(int j=i; j>=0; j--){
                
                for(int k=0; k<n; k++)
                    sum_arr[j][k] += arr[i][k];
                if( check_in_row( sum_arr[j], n, x ) )
                    return true;
            }
     	}
     	
     	return false;
    }
}