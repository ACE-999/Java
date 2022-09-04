package Recursion;
import java.util.Scanner;

public class fiborecur {
    
    public static int fib(int n)
    {
        if(n<=1)
            return n;
        
        int f=fib(n-1)+fib(n-2);
        return f;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int res=fib(n);

        System.out.println(res);

        sc.close();
    }
    
}
