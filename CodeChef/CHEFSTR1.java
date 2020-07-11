import java.util.Scanner;

public class CHEFSTR1{
    public static void main(String[] args) {
        // just make int to long in temp and next to get subtask II accomplished
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- > 0){
            int n = s.nextInt();
            int temp = s.nextInt(),ans = 0;
            for(int i=0 ; i<n-1 ; i++){
                int next = s.nextInt();
                ans += Math.abs(next - temp) - 1;
                temp = next;
            }
            System.out.println(ans);
        }
        s.close();
    }
}