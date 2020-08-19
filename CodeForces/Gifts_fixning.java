import java.util.Scanner;

public class Gifts_fixning {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- > 0){
            int n = s.nextInt();
            int arr1[] = new int[n];
            int cand = Integer.MAX_VALUE;
            int arr2[] = new int[n];
            int oran = Integer.MAX_VALUE;
            for(int i=0 ; i<n ; i++){
                arr1[i] = s.nextInt();
                if(arr1[i] < cand)
                    cand = arr1[i];
            }
            for(int i=0 ; i<n ; i++){
                arr2[i] = s.nextInt();
                if(arr2[i] < oran)
                    oran = arr2[i];
            }
            long ans = 0;
            for(int i = n-1 ; i>=0 ; i--)
                ans += Math.max(arr1[i]-cand,arr2[i] -oran);
            System.out.println(ans);
            
        }
        s.close();
    }
}