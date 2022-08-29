import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        String s="hello";
        String t="world";
        System.out.println(s.length()+t.length());
        System.out.println(s.substring(1,2));
        System.out.println(s.substring(s.length()/2,s.length()));
        System.out.println(s+t);
        System.out.println(t+s);
    }

}
