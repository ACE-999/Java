import java.util.Scanner;

public class karansoti {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        int cnt=0;
        double res=0;

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(a[i][j]==1)
                {
                    cnt++;
                }
            }
        }
        
        for(int i=cnt-1; i>0; i--)
        {
            res=res+Math.pow(2,i);
        }
        res=(res%1000000007)+1;
        System.out.println(res);
    }
    
}
