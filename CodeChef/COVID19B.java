import java.util.Scanner;
public class COVID19B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- > 0){
            int n = s.nextInt();
            int arr[] = new int[n];
            int ans[] = new int[n];
            for(int i =0 ; i <n ; i++){
                arr[i] = s.nextInt();
                ans[i] = 1;
            }
            for(int i=0 ; i<n ; i++){
                int mini = arr[i];
                for(int j=i+1 ; j<n ; j++){
                    if(arr[i] > arr[j])
                        ans[i] ++;
                    if(arr[j] < mini)
                        mini = arr[j];
                }
                int maxi = -1;
                for(int j=0 ; j <= i-1 ; j++){
                    if(arr[j] > mini)
                        ans[i] ++;
                    if(arr[j] > maxi)
                        maxi = arr[j];
                }
                for(int j=i+1 ; j<n ; j++){
                    if(maxi > arr[j] && arr[j] >= arr[i])
                        ans[i]++;
                }
            }
            int min = 100000;
            int max = -1;
            for(int i=0 ; i<n ; i++){
                if(ans[i] > max)
                    max = ans[i];
                if(ans[i] < min)
                    min = ans[i];
            }
            System.out.println(min + " " + max);
        }
        s.close();
    }
}