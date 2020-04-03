#include <bits/stdc++.h>

using namespace std;

int main () {
    int T;
    cin >> T;
    while(T--) {
        int N;
        cin >> N;
        multiset < long long int > prices;
        for(int i = 0; i < N; i++) {
            long long int P;
            cin >> P;
            prices.insert(P);
        }
        long long int sum = 0;
        int i = 0;
        for(auto it = prices.rbegin(); it != prices.rend(); it++, i++) {
            sum += (*it - ((*it - i > 0) ? i : (*it))) % 1000000007;
        } cout << sum % 1000000007 << endl;
    }

    return 0;
}