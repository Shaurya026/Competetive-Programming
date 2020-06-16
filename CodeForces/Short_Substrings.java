import java.util.Scanner;

class Short_Substrings{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t -- > 0){
            String ans = s.next();
            String out = "";
            int k = ans.length();    
            for(int i=0 ; i<ans.length()-2 ; i+=2){
                out += ans.charAt(i);
                // k = i;
                //System.out.println(out);
            }
            out += ans.substring(k-2, ans.length());
            System.out.println(out);
        }
        s.close();
    }
}