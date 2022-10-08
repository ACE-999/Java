import java .util.Scanner;

public class wordcount {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        String str=sc.nextLine();
        int i=0;
        int cnt=0;
        
        String[] word=str.split(" ");

        while(i<word.length)
        {
            System.out.println(word[i]);
            i++;
        }

        cnt=word.length;
        System.out.println("Number of words: "+cnt);

        sc.close();
    }
}
