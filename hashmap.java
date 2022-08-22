import java.util.Scanner;
import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        String s=sc.next();

        HashMap<Character,Integer> map=new HashMap<>();
    
        for(char c: s.toCharArray())
        {
            if(map.containsKey(c))
            {
                int temp=map.get(c);
                map.put(c, ++temp);
               
            }
            else{
                map.put(c, 1);
                
            }
        }
        System.out.println(map);
        sc.close();
    }
    
}