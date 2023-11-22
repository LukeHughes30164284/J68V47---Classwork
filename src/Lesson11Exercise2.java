import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Lesson11Exercise2 {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("TimesTable.txt"))) {
            String line;

            do {
                line = reader.readLine();
                if (line != null) {
                    System.out.println(line);
                }
            } while (line != null);

        } catch (IOException e) {
            System.out.println("Error occurred while reading the file: " + e.toString());
        }
    }
}
