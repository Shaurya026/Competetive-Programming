import java.util.Scanner;

public class EVNM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- > 0){
            int n = s.nextInt();
            long temp = 1;
            for(int r = 0; r < n + 1 / 2; r += 2) {
                for(int c = 0; c < n; c++) {
                    System.out.print((temp++)+" ");
                }
                System.out.println();
                if(r <n -1){
                    for(int c = 0; c < n; c++) {
                        if(n % 2 == 1)
                            System.out.print((temp++)+" ");
                        else{
                            System.out.print((temp+n-c-1)+" ");
                            if(c == n -1)
                                temp += n;
                        }
                    }System.out.println();
                }
            }
        }
        s.close();
    }
}
////// C++ equivalent solution !!
// #include <bits/stdc++.h>
// using namespace std;

// int main () {
// 	int t;
// 	cin>>t;
// 	while(t--) {
// 		int n;
// 		cin>>n;
// 		long long temp = 1;
// 		for(int r = 0; r < n + 1 / 2; r += 2){
// 			for(int c = 0; c < n; c++){
// 				cout << temp++ << " ";
// 			} cout << endl;
// 			if(r < n - 1){
// 				for(int c = 0; c < n; c++){
// 					if(n % 2== 1) {
// 						cout << temp++ << " ";
// 					} 
// 					else{
// 						cout << temp + n - c - 1 << " ";
// 						if(c == n - 1){
// 							temp += n;
// 						}
// 					}
// 				}
// 				cout << endl;
// 			}
// 		}
// 	}
// 	return 0;
// }