import java.util.Scanner;

class StringsEqual{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- > 0){
            String c = s.next();
            String c_bar = s.next();
            boolean flag = false;
            for(int i=0 ; i<c.length() ; i++){
                for(int j=0 ; j <c_bar.length() ; j++){
                    if(c.charAt(i) == c_bar.charAt(j)){
                        flag = true;
                        break;
                    }
                }
                if(flag)
                    break;
            }
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        s.close();
    }
}