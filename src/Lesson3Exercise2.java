import java.util.*;
public class Lesson3Exercise2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Q1. What is the capital of Spain? ");
        String Q1 = input.nextLine();

        String Q1Lower = Q1.toLowerCase();

        System.out.println(Q1Lower.contains("madrid"));

        System.out.print("Q2. What is the capital of the UK? ");
        String Q2 = input.nextLine();

        String Q2Lower = Q2.toLowerCase();

        System.out.println(Q2Lower.contains("london"));

        System.out.print("Q3. What is the capital of Italy? ");
        String Q3 = input.nextLine();

        String Q3Lower = Q3.toLowerCase();

        System.out.println(Q3Lower.contains("rome"));

    }
}
