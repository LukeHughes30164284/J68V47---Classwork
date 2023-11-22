import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Lesson11Exercise1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int Number = input.nextInt();

        for( int count=1; count<=12; count++ )
        {
            int Answer = count * Number;
            System.out.println(Number + " x " + count + " = " + Answer);
        }


        try (PrintWriter writer = new PrintWriter(new FileWriter("TimesTable.txt"))) {
            for (int count = 1; count <= 12; count++) {
                int answer = count * Number;
                String line = Number + " x " + count + " = " + answer;
                writer.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }

    }

}
