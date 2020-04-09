#include <bits/stdc++.h>
using namespace std;
long long int numOfPrime (long long int X) {
    long long int count = 0;
    while(X % 2 == 0) {
        X /= 2;
        count++;
    }
    for(long long int i = 3; i < sqrt(X); i += 2) {
        if(X % i == 0) {
            while(X % i == 0) {
                X /= i;
                count++;
            }
        }
    }
    if(X > 2) {
        count++;
    }
    return count;
}
int main () {
    int T;
    cin >> T;
    while(T--) {
        long long int X, K;
        cin >> X >> K;
        if(K == 1) {
            cout << "1" << endl;
        } else{
            if(X >= pow(2, K)){
                cout << (numOfPrime(X) >= K ? "1" : "0") << endl;
            } else {
                cout << "0" << endl;
            }
        } 
    }
    return 0;
}