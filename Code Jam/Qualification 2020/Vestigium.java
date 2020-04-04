import java.util.*;
class Vestigium{
    public static boolean areDistinct(Integer arr[]) {
        Set<Integer> s =  
           new HashSet<Integer>(Arrays.asList(arr)); 
        return (s.size() == arr.length); 
    } 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int k = 1;
        while(t -- > 0){
            int n = s.nextInt();
            int arr[][] = new int[n][n];
            Integer tempr[] = new Integer[n];
            int rows = 0 , col = 0 , sum = 0;
            for(int i=0 ; i<n ; i++){
                for(int j = 0 ; j < n ; j++){
                    arr[i][j] = s.nextInt();
                    tempr[j] = Integer.valueOf(arr[i][j]);
                    if(i==j)
                        sum += arr[i][j]; 
                }
                if(!areDistinct(tempr))
                    rows ++;
            }
            for(int i = 0 ; i<n ; i++){
                for(int j=0 ; j<n ; j++)
                    tempr[j] = Integer.valueOf(arr[j][i]);
                if(!areDistinct(tempr))
                    col ++;
            }
            System.out.println("Case #"+(k++)+": "+sum + " " + rows + " " + col);
        }
        s.close();
    }
}