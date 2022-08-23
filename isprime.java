import java.util.Scanner;

public class isprime {
    public static boolean isPrime(int n) {

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
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number: ");
        int n=sc.nextInt();

        if(isPrime(n))
        {
            System.out.println("The number is Prime!!!");
        }
        else{
            System.out.println("The number is Not Prime!!!");
        }

        sc.close();
    }
    
}
