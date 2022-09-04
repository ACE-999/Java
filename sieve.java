import java.util.Scanner;

public class sieve {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        boolean prime[]=new boolean[n+1];
        int cnt=0;

        //all non primes are true
        for(int i=2; i*i<=n; i++)
        {
            for(int j=i*i; j<=n; j+=i)
            {
                prime[j]=true;
            }
        }

        //all non primes are false
        for(int i=2; i<=n; i++)
        {

            if(prime[i]==false)
            {
                cnt++;
                System.out.print(i+" ");
            }
        }
        System.out.println("\nNumber of primes: "+cnt);

        sc.close();
    }
    
}
