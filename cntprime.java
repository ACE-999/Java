import java.util.Scanner;

public class cntprime {

    static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        
        for(int i=2; i*i<=n; i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    
    static int countPrimes(int n) {
        
        int cnt=0;
        
        for(int i=0; i<n; i++)
        {
            if(isPrime(i))
            {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a=countPrimes(n);
        System.out.println("Number of Primes: "+a);

        sc.close();
    }
}
