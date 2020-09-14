import java.util.*;

public class TREE2{
    public static int countDistinct(int arr[],int n) { 
        HashSet<Integer> hs = new HashSet<Integer>(); 
        for(int i = 0; i < n; i++)  
            hs.add(arr[i]); 
        return hs.size();      
    } 
  
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- > 0){
            int n = s.nextInt();
            int arr[] = new int[n];
            boolean flag = true;
            for(int i=0 ; i<n ; i++){
                arr[i] = s.nextInt();
                if(arr[i] == 0)
                    flag = false;
            }
            if (flag)
                System.out.println(countDistinct(arr,n));
            else
                System.out.println(countDistinct(arr, n)-1);
        }
        s.close();
    }
}