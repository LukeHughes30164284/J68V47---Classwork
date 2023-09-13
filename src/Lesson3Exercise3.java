import java.util.*;

public class Lesson3Exercise3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Loan amount: £");
        float L = input.nextFloat();

        System.out.print("Interest Rate (APR %): ");
        float Interest = input.nextFloat();

        System.out.print("Number of years: ");
        float Years = input.nextFloat();

        float j = (Interest / 100) / 12 ;

        float n = Years * 12;

        double k = 1 - Math.pow((1 + j), -n);

        double O = j / k;

        double M = L * O;

        System.out.format("Monthly payment for this loan = £ %.2f%n", M);


    }
}
