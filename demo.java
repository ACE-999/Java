import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int [n];
        int t[]=new int [n];
        

        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<n; i++)
        {
            int cnt=0;
            for(int j=0; j<n; j++)
            {
                if(arr[i]==arr[j])
                    cnt++;
            }
            
            //System.out.print("cnt "+cnt);
            
            for(int k=0; k<n; k++)
            {
                if(t[k]==arr[i])
                {
                    continue;
                }
                if((cnt%3)!=0)
                {   
                    
                    t[i]=arr[i];
                    
                }
            }
        }

        System.out.println("answer...");
        for(int i=0; i<n; i++)
        {
            System.out.print(t[i]+" ");
        }

        sc.close();
    }
}
