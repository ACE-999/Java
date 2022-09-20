import java.util.Arrays;
import java.util.ArrayList;

public class coinchange {
    public static void main(String[] args) {
        
        int coins[]={1,5,2};
        int target=18;

        Arrays.sort(coins);
        ArrayList<Integer> al=new ArrayList<>();

        for(int i=coins.length-1; i>=0; i--)
        {
            while(target>=coins[i])
            {
                target-=coins[i];
                al.add(coins[i]);
            }
        }

        if(target==0)
        {
            System.out.println("Required solution:");
            System.out.println(al);
        }
        else{
            System.out.println("Solution NOT possible!");
        }
    }
}
