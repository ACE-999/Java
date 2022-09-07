import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int m=sc.nextInt();

        int h[]=new int[m];
        int g[]=new int[m];

        for(int i=0; i<m; i++)
        {
            h[i]=sc.nextInt();
        }
        for(int i=0; i<m; i++)
        {
            g[i]=sc.nextInt();
        }

        int cnt=0;
        int ex=0;

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(h[j]==g[j])
                {
                    cnt++;
                }
                else{
                    h[j]=h[j]-1;
                    h[j+1]=h[j+1]-1;
                    ex++;
                }
            }
        }

        if(cnt>=3)
        {
            System.out.println(ex);
        }
        else
        {
            
        }

        sc.close();
    }
}
