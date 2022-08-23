import java.util.Scanner;

public class freq{
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        
        String str=sc.nextLine();

        int freq[]=new int[26];

        for(char c: str.toCharArray())
        {
            freq[c-97]++;
        }

        for(int i: freq)
        {
            System.out.print(i+" ");
        }
        sc.close();
    }
}