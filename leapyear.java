import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int y=sc.nextInt();

        if(y%400==0)
        {
            System.out.println(y+" is a leap year.");
        }
        else if(y%4==0 && y%100!=0)
        {
            System.out.println(y+" is a leap year.");
        }
        else{
            System.out.println(y+" is NOT a leap year.");
        }

        sc.close();
    }
}
