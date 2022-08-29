import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        float radius,area;
        Scanner circle=new Scanner(System.in);
        System.out.println("enter the radius of the circle : ");
        radius=circle.nextFloat();
        area=radius*2*(22/7);
        System.out.println("the area of the circle is : "+area);
    }
}
