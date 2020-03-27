class solver
{
    static boolean check_in_row(int r[], int n, int x)
    {
        // this function looks for x in given 1D array in O(n) time
        int sum=0, start=0, end=0;
        while(true)
        {
            if(sum==x)
                return true;
            if(sum>x)
            {
                // reducing window if sum is too large
                sum -= r[start];
                start += 1;
            }
            else
            {
                // increasing window if sum is too small
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
                    // adding ith row of arr to jth row of sum_arr
                
                if( check_in_row( sum_arr[j], n, x ) )
                    // looking for sum in jth row of sum_arr
                    return true;
            }
     	}
     	
     	return false;
    }
}
class Min {
    public int find_min(int[] a, int n, int k) {
        int sum = 0, pairs = 0;
        for (int i = 0; i < n; i++) {
            pairs += a[i] / 2;
            if (a[i] % 2 == 0)
                sum += (a[i] - 2) / 2;
            else
                sum += (a[i] - 1) / 2;
        }
        if (k > pairs) 
            return -1;
        if (k <= sum) 
            return 2 * (k - 1) + n + 1;
        return 2 * sum + n + (k - sum);
    }
}