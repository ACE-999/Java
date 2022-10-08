import java.util.Scanner;

public class numrev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int digit=0;
        int rev=0;
        int sum=0;

        while(n>0)
        {
            digit=n%10;
            sum=sum+digit;
            rev=(rev*10)+digit;
            n=n/10;
        }

        System.out.println("Reversed number: "+rev);
        System.out.println("Sum of digits: "+sum);
    }
}
