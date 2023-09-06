import java.util.*;
public class Lesson2Exercise2_MathOperators {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        String Number1 = input.nextLine();

        System.out.print("Enter the second number: ");
        String Number2 = input.nextLine();

        int Integer1 = Integer.parseInt(Number1);
        int Integer2 = Integer.parseInt(Number2);

        int Addition = Integer1 + Integer2;
        System.out.println(Integer1 + "+" + Integer2 + "=" + Addition);

        int Subtraction = Integer1 - Integer2;
        System.out.println(Integer1 + "-" + Integer2 + "=" + Subtraction);

        int Multiplication = Integer1 * Integer2;
        System.out.println(Integer1 + "*" + Integer2 + "=" + Multiplication);

        int Division = Integer1 / Integer2;
        System.out.println(Integer1 + "/" + Integer2 + "=" + Division);

        int Modulo = Integer1 % Integer2;
        System.out.println(Integer1 + "%" + Integer2 + "=" + Modulo);

        int Exponent = (int) Math.pow(Integer1,Integer2);
        System.out.println(Integer1 + "^" + Integer2 + "=" + Exponent);

    }
}
