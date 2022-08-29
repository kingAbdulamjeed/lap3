import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        for (;;)
        {
        float x1,x2,x3;
        Scanner average=new Scanner(System.in);
        System.out.println("enter three numbers to calculate the average of them : ");
        x1=average.nextFloat();
        x2=average.nextFloat();
        x3=average.nextFloat();
        System.out.println("the average is : "+((x1+x2+x3)/3));
    }}
}
