#include<bits/stdc++.h>
using namespace std;

vector<string>getDecision(int a , int b)
{
    vector<string> ans;
    while(b!=a){
        if(b<a){
            b+=1;
            ans.push_back("eat");
        }
        else if(b%2 == 0){
            b /= 2;
            ans.push_back("overflow");
        }
        else if(b%2 == 1){
            b += 1;
            ans.push_back("eat");
        }
    }
    reverse(ans.begin(),ans.end());
    return ans;
}
int main(){
    int t;
    cin>>t;
    while(t--){
        int m,n;
        cin>>m>>n;
        vector<string> ans;
        ans = getDecision(m,n);
        for(int i=0 ; i <ans.size();  i++)
            cout<<ans[i]<<" ";
        cout<<endl;
    }
    return 0;
}