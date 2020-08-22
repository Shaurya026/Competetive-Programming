import java.util.Scanner;

public class Distance_and_axis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- > 0){
            int A = s.nextInt() , k = s.nextInt();
            if (A > k){
                if ( (A-k) % 2 == 0)
                    System.out.println(0);
                else
                    System.out.println(1);
            }
            else 
                System.out.println(Math.abs(A-k));
        }
        s.close();
    }
}