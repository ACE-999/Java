import java.util.Scanner;

public class bookshelf {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int h[]=new int[n];
        for(int i=0; i<n; i++)
        {
            h[i]=sc.nextInt();
        }

        int m=sc.nextInt();
        int g[]=new int[m]; 
        for(int i=0; i<m; i++)
        {
            g[i]=sc.nextInt();
        }
        
        int cnt=0;
        int t[]=new int[n];

        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(g[j]>h[i]&&g[j]<h[i+1])
                {
                    if(t[j]==g[j])
                    {
                        continue;
                    }
                    cnt++;
                    t[j]=g[j];
                    //System.out.println("1st"+cnt+t[j]); 
                }
                else if(g[j]<h[i]&&g[j]>h[i+1])
                {
                    if(t[j]==g[j])
                    {
                        continue;
                    }
                    cnt++;
                    //System.out.println("2nd"+cnt+t[j]);
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
    
}
