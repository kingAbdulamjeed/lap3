import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        double x;
        System.out.println("enter a num : ");
        x=num.nextDouble();
        System.out.println("the square of the num is : "+(x*x));
        System.out.println("the cube of the num is : "+(x*x*x));
        System.out.println("the fourth power of the num is : "+(Math.pow((x),(4))));
    }
}
