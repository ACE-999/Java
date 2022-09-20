import java.util.Scanner;

public class pow {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        int n=sc.nextInt();
        int res=1;

        if(n%2==0)
        {
            while(n>0)
            {
                if(n%2==1)
                {
                    res*=x;
                    --n;
                }
                else{
                    res*=x*x;
                    n=n/2;
                }
            }
        }
        else
        {
            while(n>1)
            {
                if(n%2==1)
                {
                    res*=x;
                    --n;
                }
                else{
                    res*=x*x;
                    n=n/2;
                }
            }
        }
        System.out.println(res);

        sc.close();
    }
}
