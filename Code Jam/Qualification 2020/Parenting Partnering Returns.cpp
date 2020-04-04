#include <bits/stdc++.h> 
using namespace std; 
struct Activitiy { 
    int start, finish; 
}; 

bool activityCompare(Activitiy s1, Activitiy s2) { 
    return (s1.finish < s2.finish); 
} 
void printMaxActivities(Activitiy arr[], int n , char x[]) { 
    sort(arr, arr+n, activityCompare); 
    int i = 0; 
    x[0] = 'C';
    for (int j = 1; j < n; j++) 
    { 
      if (arr[j].start >= arr[i].finish) 
      { 
          x[j] = 'C';
          i = j; 
      } 
    } 
} 
void printMaxActivities1(Activitiy arr[], int n , char x[] , int pos[]) { 
    sort(arr, arr+n, activityCompare);
    int k = 0;
    int i = 0; 
    x[pos[k++]] = 'J';
    for (int j = 1; j < n; j++) 
    { 
      if (arr[j].start >= arr[i].finish) { 
          x[pos[k++]] = 'J';
          i = j; 
      } 
    } 
} 
int main() 
{ 
    int t ;
    cin>>t;
    for(int e = 1 ; e<= t ; e++){
        int n ;
        cin>>n;
        Activitiy arr[n];
        for(int i=0 ; i<n ; i++){
            cin>>arr[i].start;
            cin>>arr[i].finish;
        }
        char x[n];
        for(int i=0 ; i<n ; i++)
            x[i] = '-';
        printMaxActivities(arr, n , x); 
        int k = 0;
        for(int i=0 ; i<n ; i++){
            if(x[i] == '-')
                k++;
        }
        if(k>0){
            int pos[k];
            int d = 0;
            Activitiy arr1[k];
            for(int i=0 ; i<n ; i++){
                if(x[i] == '-'){
                    pos[d] = i;
                    arr1[d++] = arr[i];
                }
            }         
            printMaxActivities1(arr1, k , x , pos); 
        }
        cout<<"Case #"<<e<<": ";
        bool flag = true;
        for(int i=0 ; i<n ; i++){
            if(x[i] == '-'){
                cout<<"IMPOSSIBLE"<<endl;
                flag = false;
                break;
            }
        }
        if(!flag)
            continue;
        for(int i=0 ; i<n ; i++){
            cout<<x[i];
        }
        cout<<endl;
    }
    return 0; 
} 