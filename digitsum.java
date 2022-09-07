import java.util.Scanner;

public class digitsum {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int sum=0,d;

        System.out.print("Sum of digits of "+n+": ");
        while(n>0)
        {
            d=n%10;
            sum=sum+d;
            n/=10;
        }
        System.out.println(sum);
    }
}