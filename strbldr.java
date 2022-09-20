public class strbldr {
    public static void main(String[] args) {
        
        StringBuilder sb=new StringBuilder("Jignesh");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'M');
        System.out.println(sb);

        sb.insert(0, "J");
        System.out.println(sb);

        sb.insert(sb.length(), "hh");
        System.out.println(sb);

        sb.delete(7, sb.length());
        System.out.println(sb);

        StringBuilder sb1=new StringBuilder("h");
        sb1.append("e");
        sb1.append("l");
        sb1.append("l");
        sb1.append("o");
        System.out.println(sb1);

        String str=sb1.toString();
        System.out.println(str);

        StringBuilder s=new StringBuilder();
        s.append("noob");
        System.out.println(s);
    }
}
