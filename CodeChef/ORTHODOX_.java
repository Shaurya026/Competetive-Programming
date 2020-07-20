import java.util.*;
public class ORTHODOX_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String[] arr = sc.nextLine().split(" ");
            HashSet<Long> hs = new HashSet<Long>();
    		boolean distinctFlag = true;
    		for(int i = 0; i < n; i++) {
    		    long temp = 0L;
    		    for(int j = i; j < n; j++) {
    		        temp |= Long.parseLong(arr[j]);
    		        if(hs.contains(temp)) {
        		        distinctFlag = false;
        		        break;
        		    }
        		    else 
        		        hs.add(temp);
    		    }
    		    if(!distinctFlag)
    		        break;
    		}
    		if(distinctFlag)
    		    System.out.println("YES");
    		else 
    		    System.out.println("NO");
        }
        sc.close();
    }
}