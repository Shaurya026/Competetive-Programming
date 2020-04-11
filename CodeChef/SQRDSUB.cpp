#include<bits/stdc++.h>
using namespace std;

// Algo to check if number can be formed using difference of squares
bool Sumdiff(long long N) { 
    if(N == 0)
        return true;
    if( N < 0)
        N *= -1;
    long long start = 1, end = 1; 
    long long sum = 1; 
    while (start <= N ) 
    { 
        if (sum < N) { 
            end += 2; 
            sum += end; 
        } 
        else if (sum > N) { 
            sum -= start; 
            start += 2; 
        } 
        else if (sum == N) { 
            // for (int i = start; i <= end; i +=2) 
            //     printf("%d ", i); 
            // printf("\n"); 
            return true;
            // sum -= start; 
            // start += 2; 
        } 
    } 
    return false;
} 

int main(){
    int t = 0;
    cin>>t;
    while(t--){
        int n ;
        cin>>n;
        long long arr[n];
        long long ans = 0 , product = 1;
        for(int i=0 ; i<n ; i++){
            cin>>arr[i];
            if(arr[i] %2 == 1 || Sumdiff(arr[i]))
                ans ++;
            product *= arr[i];
        }
        if(Sumdiff(product))
            ans ++;
        // product = 1;
        for (int i=2; i <n; i++)  {  /* *****O(n^2)***** therefore easily TLE present */
            long pro = 1;
            long k = 0;
            for(int j =0 ; j<n ; j++){
                k++;
                pro *= arr[j];
                //cout<<arr[j] << " ";
                if((k)%i == 0){
                    //cout<<endl;
                    if(Sumdiff(pro))
                        ans ++;
                    j -= i ;
                    j ++;
                    pro = arr[j];
                    k = 0;
                }
            }
        } 
        cout<<ans<<endl;
    }
    return 0;
}
