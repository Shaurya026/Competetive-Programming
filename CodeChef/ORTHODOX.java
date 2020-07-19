import java.util.Scanner;
import java.util.*;

public class ORTHODOX {
    static HashMap<Long , Integer> hm = new HashMap();

    static void printSubArrays(long []arr, int start, int end) {
    if (end == arr.length)  
        return; 
    else if (start > end)  
        printSubArrays(arr, 0, end + 1); 
    else{ 
        boolean flag = true;
        long ans = -1;
        for (int i = start; i <= end; i++){
            if(flag == true){
                ans = arr[i];
                flag = false;
            }
            else{
                ans = (ans | arr[i]);
            }
            //System.out.print(arr[i]+", "); 
        }
        if(hm.containsKey(ans)){ 
            hm.put(ans , hm.get(ans) + 1);
        }
        else
            hm.put(ans,1);
        printSubArrays(arr, start + 1, end); 
    } 
    return; 
} 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- > 0){
            int n = s.nextInt();
            long arr[] = new long[n];
            for(int i=0 ; i<n ; i++)
                arr[i] = s.nextLong();
            printSubArrays(arr, 0, 0);
            boolean truth = true;
            Iterator hmIterator = hm.entrySet().iterator(); 
            while (hmIterator.hasNext()) { 
                Map.Entry mapElement = (Map.Entry)hmIterator.next(); 
                int marks = (int)mapElement.getValue();
                if(marks > 1){
                    System.out.println("NO");
                    truth = false;
                    break;
                } 
            } 
            if(truth == true)
                System.out.println("YES");
            hm = new HashMap();
        }
        s.close();
    }
}