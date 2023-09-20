import java.util.*;
public class Lesson4Exercise1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String FirstName = input.nextLine();

        System.out.print("Enter your last name: ");
        String LastName = input.nextLine();

        System.out.print("Enter the total value of your order: £");
        float OrderValue = Float.parseFloat(input.nextLine());

        System.out.print("Enter the amount you wish to pay as a deposit: £");
        float Deposit = Float.parseFloat(input.nextLine());

        float Remainder = OrderValue - Deposit;

        System.out.println("== RECEIPT ==");
        System.out.println("Customer: " + FirstName.substring(0,1) + " " + LastName);
        System.out.format("Order Total £%.2f%n", OrderValue);
        System.out.format("Deposit Paid £%.2f%n", Deposit);
        System.out.format("Remainder £%.2f%n", Remainder);

        if (Deposit > 100) {
            System.out.println("You get a free toaster!");

        }

        System.out.println("Have a nice day");
    }

}
