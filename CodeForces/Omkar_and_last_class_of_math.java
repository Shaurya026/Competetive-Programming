import java.util.Scanner;

public class Omkar_and_last_class_of_math {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- > 0){
            int n = s.nextInt();
            int p = 0;    
            for(int i=2 ; i<100000 ; i++){
                if(n%i == 0){
                    p = i;
                    break;
                }
            }
            if(p == 0)
                p = n;
            System.out.println((n/p)+" "+(n-(n/p)));
        }
        s.close();
    }
}