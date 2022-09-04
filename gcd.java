import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        
        int res=Math.min(a,b);

        while(res>0)
        {
            if((a%res==0)&&(b%res==0))
            {
                break;
            }
            res--;
        }
        
        System.out.println("GCD: "+res);

        sc.close();
    }
    
}
