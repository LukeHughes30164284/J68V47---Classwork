import java.util.*;
public class Lesson4Exercise3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your total purchase amount: £");
        float Total = input.nextFloat();

        if (Total < 50) {
            System.out.println("Shipping cost is £10.00");
            System.out.format("Your final total is = £%.2f%n", Total + 10);

        } else {
            System.out.println("Shipping cost is free");
            System.out.format("Your final total is = £%.2f%n", Total);
        }

    }
}
