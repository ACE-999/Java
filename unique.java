public class unique {
    public static void main(String[] args) {

        int arr[]={1,1,2,3,3,4,10,4,10};
        int cnt[]=new int[11];

        for(int i: arr)
        {
            cnt[i]++;
        }
        for(int i: cnt)
        {
            System.out.print(i+" ");
        }
        
        System.out.println("Unique element: ");
        for(int i: cnt)
        {
            if(i==1)
            {
                System.out.println(cnt[i]);
            }
        }
        
    }
    
}
