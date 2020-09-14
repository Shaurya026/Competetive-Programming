import java.util.Scanner;

public class CHFNSWAP{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- > 0){
            int n = s.nextInt();
            long sum = (n*(n+1))/2;
            if(sum % 2 == 1){
                System.out.println("0");
                continue;
            }
            long x = index(sum);
            //System.out.println(x);
            long sum1 = (x*(x+1))/2;
            if(sum/2 == sum1)
                System.out.println( ((x*(x-1))/2)+(n-x)+(((n-x)*(n-x-1))/2)  ); 
            else
                System.out.println(n-x);
        }
        s.close();
    }
    public static long index(long sum) { 
        // finding the points where the sum is different !!
        // using quadratic :
        double x = Math.sqrt(1 +4*(sum) );
        x = x - 1;
        x = x/2;
        return (long)(x);
    }
}

// PYTHON implementation :
// # cook your dish here
// import math
// t = int(input())                         
// for ii in range(t):
//     n = int(input())
//     su = (n*(n+1))//2
//     if su % 2 == 1:
//         print(0)
//         continue
//     x = (-1 + math.sqrt(1 + 4*su)) // 2
//     if (x*(x+1))//2  == su //2:
//         ans = (x*(x-1))//2 + (n - x) + ((n-x)*(n-x-1))//2
//         print(int(ans))
//     else:
//         print(int(n-x)) 