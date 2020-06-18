import java.util.Scanner;

public class Social_Distance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- > 0){
            int n = s.nextInt() , k =s.nextInt();
            String val = s.next();
            int i=0;
            int answer = 0;
            while(i<n){
                if(val.charAt(i) == '1')
                    i += (k + 1);
                else if (val.charAt(i) == '0'){
                    answer += 1;
                    int b=i;
                    boolean flag = false;
                    for(int j=i+1; j<=i+k ; j++){
                        b = j;
                        if(j<n && val.charAt(j) == '1'){
                            i = j ;
                            answer -= 1;
                            flag = true;
                            break;
                        }
                    }
                    if(flag == false)
                        i = (b+1);
                }
            }
            System.out.println(answer);
        }
        s.close();
    }
}