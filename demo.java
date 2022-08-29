import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        int b[]=new int[n];
        int c[]=new int[n];

        //int arr[]=new int[n];
        int ted[]=new int[n];
        int choc[]=new int[n];


        for(int i=0; i<n; i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            c[i]=sc.nextInt();
        }

        //ted array
        for(int i=n-1; i>=0; i--)
        {
            if(m-b[i]>b[i])
            {
                ted[i]=b[i];
            }
            else if(m-b[i]>0){
                ted[i]=m-b[i];
            }
            else{
                ted[i]=0;
            }
        }

        //choc array
        for(int i=n-1; i>=0; i--)
        {
            if(ted[i]==b[i])
            {
                choc[i]=0;
            }
            else{
                choc[i]=c[i]*b[i];
            }
        }

        int max=choc[0];
        for(int i=0; i<n; i++)
        {
            max=Math.max(max,choc[i]);
        }

        System.out.println("Ans: "+max);
    }
}
