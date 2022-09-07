package Recursion;
import java.util.Scanner;

public class gcdrecur {
    
    public static int gcd(int a, int b)
    {
        if(a==0)
            return b;
        else if(b==0)
            return a;
        else if(a==b)
            return a;
        else if(a>b)
        {
            return gcd(a%b,b);
        }
        return gcd(a,b%a);
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        int res=gcd(a,b);
        System.out.println("GCD: "+res);

        sc.close();
    }
    
}
