import java.util.Scanner;

public class XORinacci{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0){
            int a = s.nextInt(),b = s.nextInt();
            int n = s.nextInt();
            int x = n % 3 ;
            if(x == 0)
                System.out.println(a);
            else if (x == 1)
                System.out.println(b);
            else
                System.out.println(a^b);
        }
        s.close();
    }
}