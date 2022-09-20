import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class jobscheduling {
    static class job{
        int deadline;
        int profit;

        job(int dead, int pro)
        {
            this.deadline=dead;
            this.profit=pro;
        }
    }
    public static void main(String[] args) {
        ArrayList<job> al=new ArrayList<>();
        
        job a1=new job(2,100);
        job a2=new job(1,19);
        job a3=new job(2,27);
        job a4=new job(1,25);
        job a5=new job(3,15);

        al.add(a1);
        al.add(a2);
        al.add(a3);
        al.add(a4);
        al.add(a5);

        Collections.sort(al,(a,b) -> b.profit-a.profit);

        for(int i=0; i<5;i++)
        {
            System.out.println(al.get(i).deadline + " " + al.get(i).profit);
        }
    }
}
