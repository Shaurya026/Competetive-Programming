import java.util.Scanner;

public class XYSTR {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n -- > 0){
            String row = s.next();
            int num_pairs = 0;
            for (int i=1 ; i<row.length() ; i++){
                if( (row.charAt(i) == 'x' && row.charAt(i-1) == 'y') || (row.charAt(i-1) == 'x' && row.charAt(i) == 'y') ){
                    num_pairs += 1;
                    i+=1;
                }
            }
            System.out.println(num_pairs);
        }
        s.close();
    }    
}