import java.util.Scanner;
class PRICEON{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- > 0){
            int n = s.nextInt(), k = s.nextInt();
            int sum = 0;
            int sum1 = 0;
            for(int i=0 ; i<n ; i++){
                int d = s.nextInt();
                sum += d;
                if(d>k){
                    sum1 += k;
                    continue;
                }
                sum1 += d;
            }
            System.out.println(sum - sum1);
        }
        s.close();
    }
}