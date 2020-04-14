import java.util.Scanner;
class answer{ 
    public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
        int a = s.nextInt(),b = s.nextInt(),p = s.nextInt(),x = s.nextInt();
        int r,k,m,q,t;
	    if(a%p==0)
		    System.out.println("0");
	    else{
		    m = p*(p-1);
		    q = x/m;
		    t = x%m;
		    int ans=0;
		    r = b;
		    for(int i=p-1;i>0;i--){
			    // i = modulo (p-1); r = modulo p;
			    k = i*p - r*(p-1);
			    k = (k+m)%m;
			    if(t>=k)
				    ++ans;
			    r = (r*a)%p;
		    }
		    ans += (p-1)*q;
		    System.out.println(ans);
	    }
    }	
}