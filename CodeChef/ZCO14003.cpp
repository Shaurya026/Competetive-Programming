#include <bits/stdc++.h>
using namespace std;

int main() {
	int t ;
	cin>>t;
	long arr[t];
	for(int i=0 ; i<t ; i++)
	    cin>>arr[i];
	sort(arr,arr+t);
	long ans = 0;
	long max = 0;
	for(int i=0 ; i<t ; i++){
	    ans = arr[i]*(t-i);
	    if(ans > max)
	        max = ans;
	}
	cout<<max;
	return 0;
}