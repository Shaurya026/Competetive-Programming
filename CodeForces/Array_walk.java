import java.util.Scanner;

public class Array_walk {
    public static int recursive(int arr[],int k,int z,int i){
        if( k == 1 && i >= 0 )
            return arr[i];
        if( i < 0 )
            return 0;
        int op1 = arr[i] + recursive(arr,k-1,z,i+1);
        int op2 = 0;
        if(z > 0)
            op2 = arr[i] + recursive(arr,k-1,z-1,i-1);
        return Math.max(op1,op2);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt() , k = s.nextInt(), z = s.nextInt();
            int arr[] = new int[n];
            for(int i=0 ; i<n ; i++)
                arr[i] = s.nextInt();
            System.out.println(arr[0] + recursive(arr,k,z,1));     
        }
        s.close();
    }
}
