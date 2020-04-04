#include<bits/stdc++.h> 
using namespace std;
bool areDistinct(vector<int> arr) 
{ 
    int n = arr.size(); 
    unordered_set<int> s; 
    for (int i = 0; i < n; i++) { 
        s.insert(arr[i]); 
    } 
    return (s.size() == arr.size()); 
} 
int main(){
    int t;
    cin>>t;
    int k = 0;
    while(t--){
        int n;
        cin>>n;
        int arr[n][n];
        vector<int> tempr;
        int rows = 0 , col = 0 , sum = 0;
            for(int i=0 ; i<n ; i++){
                for(int j = 0 ; j < n ; j++){
                    cin>>arr[i][j];
                    tempr.push_back(arr[i][j]);
                    if(i==j)
                        sum += arr[i][j]; 
                }
                if(!areDistinct(tempr))
                    rows ++;
                tempr.clear();
            }
            for(int i = 0 ; i<n ; i++){
                for(int j=0 ; j<n ; j++)
                    tempr.push_back(arr[j][i]);
                if(!areDistinct(tempr))
                    col ++;
                tempr.clear();
            }
            cout<<"Case #"<<(k++)<<": "<<sum<<" "<<rows<<" "<<col<<endl;
    }
}