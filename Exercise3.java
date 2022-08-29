import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        float lenght,width;
        Scanner rectangle=new Scanner(System.in);
        System.out.println("enter the length and the width of the rectangle: ");
        lenght=rectangle.nextFloat();
        width=rectangle.nextFloat();
        System.out.println("the area of the rectangle is :"+(lenght*width));

    }
}
