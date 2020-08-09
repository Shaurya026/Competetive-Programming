import java.util.Scanner;

public class suborrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- > 0){
            int n = s.nextInt();
            for(int i=1 ; i<= n ; i++)
                System.out.print(i+" ");
            System.out.println();
        }
        
        s.close();
    }
}