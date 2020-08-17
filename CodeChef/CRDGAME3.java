import java.util.Scanner;

public class CRDGAME3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0){
            double a = s.nextDouble()/9,b = s.nextDouble()/9;
            double cscore = Math.ceil(a) , rscore = Math.ceil(b);
            if(cscore < rscore){
                System.out.print("0 ");
                System.out.print((int)(cscore));
            }
            else{
                System.out.print("1 ");
                System.out.print((int)(rscore));
            }
            System.out.println();
        }
        s.close();
    }
}