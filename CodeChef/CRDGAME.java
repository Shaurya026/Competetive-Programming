import java.util.Scanner;

public class CRDGAME {
    public static long sum_digits(long number){
        long ans = 0;
        long temp = number;
        while(temp > 0){
            ans += temp % 10;
            temp = temp/10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int t = s.nextInt();
        while(t -- >0){
            int n = s.nextInt();
            int CHEF = 0 , MORTY = 0;
            for(int i=0 ; i<n ; i++){
                long c = s.nextLong();
                long m = s.nextLong();
                c = sum_digits(c);
                m = sum_digits(m);
                if(c > m)
                    CHEF ++;
                else if(m > c)
                    MORTY ++;
                else{
                    CHEF ++;
                    MORTY ++;
                }
            }
            if(CHEF > MORTY)
                System.out.println("0 " + String.valueOf(CHEF));
            else if(MORTY > CHEF)
                System.out.println("1 " + String.valueOf(MORTY));
            else
                System.out.println("2 " + String.valueOf(MORTY));
        }
        s.close();
    }
}