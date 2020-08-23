import java.util.Scanner;

public class Ternary_Sequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- > 0){
            int x1 = s.nextInt(), y1 = s.nextInt() , z1 = s.nextInt();
            int x2 = s.nextInt(), y2 = s.nextInt() , z2 = s.nextInt();
            int sum = 0;
            sum += 2*Math.min(z1,y2);
            y2 -= Math.min(z1,y2);
            y1 -= Math.min(y1,y2+x2);
            if(y1 > 0)
                sum += (-2)*(y1);
            System.out.println(sum);
        }
        s.close();
    }
}