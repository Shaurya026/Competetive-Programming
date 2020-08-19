import java.util.Scanner;
import java.util.Arrays;
public class Remove_Smallest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            if( n == 1){
                s.nextInt();
                System.out.println("YES");
                continue;
            }
            boolean flag = true;
            int arr[] = new int[n];
            for(int i=0 ; i<n ; i++)
                arr[i] = s.nextInt();
            Arrays.sort(arr);
            for(int i=1 ; i<n ; i++){
                if(arr[i] - arr[i-1] > 1)
                    flag = false;
            }
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }  
        s.close();
    }
}