import java.util.Scanner;

public class ARRGAME {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- > 0){
            int n = s.nextInt();
            int arr[] = new int[n];
            int max_zeros = 0;
            for(int i =0 ; i<n ; i++){
                arr[i] = s.nextInt();
            }
            for(int i=1 ; i<n-1 ; i++){
                int tmp = 0;
                while(arr[i] == 0){
                    i+=1;
                    tmp += 1;
                }
                if(tmp > max_zeros)
                    max_zeros = tmp;
            }
            if(max_zeros % 2 == 1 )
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        s.close();
    }
}