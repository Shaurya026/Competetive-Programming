#include <bits/stdc++.h>
#include <boost/multiprecision/cpp_int.hpp>
using namespace boost::multiprecision;
using namespace std;
int main () {
    int Tcase;
    cin >> Tcase;
    while(Tcase--) {
            int128_t TS;
        cin >> TS;
        while(TS % 2 == 0) {
            TS /= 2;
        } cout << TS / 2 << "\n";
    }
	return 0;
}