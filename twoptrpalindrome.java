import java.util.Scanner;

public class twoptrpalindrome {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        String s=Integer.toString(x);
        int i=0;
        int j=s.length()-1;
        boolean flag=true;

        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                flag=false;
                break;
            }
            i++;
            j--;
        }
        if(flag==false)
            System.out.println("NOT Palindrome!!!");
        else
            System.out.println("Palindrome!!!");
        
        sc.close();
    }
}
