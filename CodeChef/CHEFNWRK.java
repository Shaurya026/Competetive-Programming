import java.util.Scanner;

public class CHEFNWRK{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- > 0){
            int n = s.nextInt(), k = s.nextInt();
            int arr[] = new int[n];
            for(int i=0 ; i<n ; i++)
                arr[i] = s.nextInt();
            int ans = 0;
            boolean flag = true;
            int i = 0;
            while(i < n){
                int sum = 0;
                while(i < n && sum + arr[i] <= k)
                    sum += arr[i++];

                if(sum == 0){
                    flag = false;
                    break;
                }
                ans += 1;
            }
            if(!flag)
                System.out.println(-1);
            else
                System.out.println(ans);
        }
        s.close();
    }
}