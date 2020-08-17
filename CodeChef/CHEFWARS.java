import java.util.Scanner;

public class CHEFWARS {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- > 0){
            int h = s.nextInt();
            int p = s.nextInt();
            int ans = 0;
            while(p>0){
                ans += p;
                p = (int)(p/2);
            }
            if ((h - ans) > 0)
                System.out.println(0);
            else
                System.out.println(1);
        }
        s.close();
    }
}