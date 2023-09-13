import java.util.*;

public class Lesson3Exercise1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String FirstName = input.nextLine();

        System.out.print("Enter your last name: ");
        String LastName = input.nextLine();

        System.out.print("Enter your year of birth YYYY: ");
        String Year = input.nextLine();

        System.out.println("Username: " + FirstName.substring(0,1) + LastName.toLowerCase());

        String LastNameLower = LastName.toLowerCase();
        String FirstNameUpper = FirstName.toUpperCase();

        System.out.println("Password: " + LastNameLower.substring(0,1) + FirstNameUpper.substring(0,3) + Year);



    }

}
