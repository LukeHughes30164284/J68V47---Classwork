import java.util.*;
public class Lesson7Exercise2 {

    public static int Number1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        return input.nextInt();
    }
    public static int Number2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the second Number: ");
        return input.nextInt();
    }

    public static void CalculateSum() {

        int num1 = Number1();
        int num2 = Number2();
        int calc = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + calc);

    }

    public static void main(String[] args) {

        CalculateSum();

    }
}

