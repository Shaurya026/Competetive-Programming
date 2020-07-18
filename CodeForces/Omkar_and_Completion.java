// just print a single number n times !! that easy -_-
import java.util.Scanner;

public class Omkar_and_Completion{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- > 0){
            int n = s.nextInt();
            for(int i=0 ; i<n ; i++)
                System.out.print(2+" ");
            System.out.println();
            }
        s.close();
    }
}