import java.util.*;
public class Lesson4Exercise2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Q1. What is the capital of Spain? ");
        String Q1 = input.nextLine();

        if (Q1.toLowerCase().equals("madrid")) {
            System.out.println("Correct");

        } else {
            System.out.println("Sorry, The correct answer is Madrid");
        }

        System.out.print("Q2. What is the capital of the UK? ");
        String Q2 = input.nextLine();

        if (Q2.toLowerCase().equals("london")) {
            System.out.println("Correct");

        } else {
            System.out.println("Sorry, The correct answer is London");
        }

        System.out.print("Q3. What is the capital of Italy? ");
        String Q3 = input.nextLine();

        if (Q3.toLowerCase().equals("rome")) {
            System.out.println("Correct");

        } else {
            System.out.println("Sorry, The correct answer is Rome");
        }

    }
}
