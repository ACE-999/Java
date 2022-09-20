public class strfn {
    public static void main(String[] args) {
        
        String s1="Ratan";
        String s2="Tata";

        System.out.println(s1.length());

        int a=s1.compareTo(s2);
        // s1>s2 -> return +ve value
        // s1=s2 -> return 0
        // s1<s2 -> return -ve value
        System.out.println(a);

        String s=s1.substring(0,3);
        //beginIndex is always included & endIndex is always excluded
        System.out.println(s);

        String t=s2.substring(1);
        System.out.println(t);
    }
}
