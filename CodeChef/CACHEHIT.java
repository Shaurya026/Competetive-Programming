import java.util.Scanner;

public class CACHEHIT{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- > 0){
            int n = s.nextInt(), block_size = s.nextInt(), arr_size = s.nextInt();
            int arr = s.nextInt();
            int ans = 1;
            int block = arr / block_size;
            for(int i=0 ;i < arr_size - 1 ; i++){
                arr = s.nextInt();
                int val = (arr/block_size) ;
                if(block == val)
                    continue;
                else if(block < val){
                    ans ++;
                    block = val; 
                } 
            }
            System.out.println(ans);
        }
        s.close();
    }
}