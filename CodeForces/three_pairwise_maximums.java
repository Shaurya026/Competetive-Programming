import java.util.Arrays;
import java.util.Scanner;

public class three_pairwise_maximums {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- > 0){
            long arr[] = new long[3];
            for(int i=0 ; i<3 ; i++)
                arr[i] = s.nextLong();
            Arrays.sort(arr);
            if(arr[0] == arr[1] && arr[1]!=arr[2]){
                System.out.println("NO");
                continue;
            }
            else if(arr[0] == arr[1] && arr[1] == arr[2]){
                System.out.println("YES");
                System.out.println(arr[0]+" "+arr[0]+" "+arr[0]);
                continue;
            }
            else if(arr[0]!=arr[1] && arr[1]!= arr[2] && arr[0]!=arr[2]){
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
            System.out.println(1+" "+arr[0]+" "+arr[1]);
        }
        s.close();
    }
}