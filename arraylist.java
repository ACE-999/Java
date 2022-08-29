import java.util.ArrayList;
import java.util.Scanner;

//append elements with value=k to the last

public class arraylist {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        
        System.out.print("Enter size of array: ");
        int n=sc.nextInt();
        
        int arr[]=new int[n];

        System.out.println("Enter array: ");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k=sc.nextInt();

        for(int i=0; i<n; i++)
        {
            if(arr[i]==k)
            {
                al2.add(arr[i]);
            }
            else{
                al1.add(arr[i]);
            }
        }
        
        al1.addAll(al2);
        System.out.println(al1);

        sc.close();
    }
    
}
