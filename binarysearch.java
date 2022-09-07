import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int arr[]={2,5,4,8,9};

        System.out.print("Enter element: ");
        int n=sc.nextInt();

        int u=arr.length-1;
        int l=0;
        int mid=(u+l)/2;
        int flag=0;

        while(l<=u)
        {
            if(arr[mid]==n)
            {
                flag=1;
                break;
            }
            else if(n>arr[mid])
            {
                l=mid+1;
            }
            else{
                u=mid-1;
            }
        }
        
        if(flag==1){
            System.out.println("Element found!!!");
        }
        else{
            System.out.println("Element NOT found!");
        }
    }
    
}
