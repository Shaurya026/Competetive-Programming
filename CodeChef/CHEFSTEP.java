import java.util.Scanner;

public class CHEFSTEP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0){
            int steps = s.nextInt(), step_size = s.nextInt();
            String ans = "";
            for(int i=0 ; i<steps ; i++){
                int size_val = s.nextInt();
                if(size_val % step_size == 0){
                    ans += "1";
                }
                else
                    ans += "0";
            }
            System.out.println(ans);
        }
        s.close();
    }
}