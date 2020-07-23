import java.util.*;
public class CHFMOT18{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- > 0){
            int pay = s.nextInt(),denom = s.nextInt();
            int ans = 0;
            if(pay % 2 == 1){
                pay -= 1;
                ans ++ ;
            }
            if(pay > denom){
                int val = pay / denom;
                pay -= denom * val;
                ans += val;
            }
            if(pay <= denom && pay != 0)
                ans++;
            System.out.println(ans);
        }
        s.close();
    }
}