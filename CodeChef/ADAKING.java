import java.util.Scanner;

public class ADAKING {
    public static void Printer(int spaces,int obstacles){
        String ans = "";
        boolean KING = false;
        for(int i=0 ; i<8 ; i++){
            for(int j=0 ; j<8 ; j++){
                if(KING == false){
                    KING = true;
                    ans += 'O';
                    spaces --;
                }
                else if(spaces > 0 && KING == true){
                    ans += '.';
                    spaces --;
                }
                else if(obstacles > 0){
                    ans += 'X';
                    obstacles --;
                }
                else
                    ans += '.';
            }
            System.out.println(ans);
            ans = "";
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- >0){
            int n = s.nextInt();
            int obstacles = 32;
            if(n>obstacles)
                obstacles = 64-n;
            Printer(n,obstacles);
            System.out.println();
        }
        s.close();
    }
}