import java.util.Scanner;
public class ADAMAT {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- > 0){
            int n = s.nextInt();
            int arr[][] = new int[n][n];
            boolean flag = true;
            int k = 1;
            for(int i=0 ; i<n ; i++){
                for (int j = 0; j<n ; j++){
                    arr[i][j] = s.nextInt();
                    if(arr[i][j] != k)
                        flag = false;
                    k += 1;
                }
            }
            if(flag){
                System.out.println(0);
                continue;
            }
            int steps = 0;
            for(int i =1,j=0 ; i<n ; i++){
                if(i == 1 && arr[j][i] != i + 1){
                    steps += 1;
                    while(i<n && arr[j][i] != i+1)
                        i += 1;
                    i-= 1;
                    continue;
                }
                if(arr[j][i] != i+1){
                    steps += 2;
                    while(i<n && arr[j][i] != i+1)
                        i+=1;
                    i-=1;
                }
            }
            System.out.println(steps);
        }
        s.close();
    }
}