import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class singlenum {

    public static int single(int nums[]){
        
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> e: map.entrySet())
        {
            if(e.getValue()==1)
            {
                return e.getKey();
            }
        }
        
        return 0;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int nums[]={4,1,2,1,2,};
        int ans=0;

        ans=single(nums);

        System.out.println(ans);
        sc.close();
    }
    
}
