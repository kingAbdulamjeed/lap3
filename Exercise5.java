import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner swap=new Scanner(System.in);
        int variable1,variable2,change;
        System.out.println("enter the first number: ");
        variable1=swap.nextInt();
        System.out.println("enter the second number : ");
        variable2=swap.nextInt();
        change=variable1;
        variable1=variable2;
        variable2=change;
        System.out.println("the numbers after the swap are\n first: "+variable1+" \n second: " +variable2);
    }
}
