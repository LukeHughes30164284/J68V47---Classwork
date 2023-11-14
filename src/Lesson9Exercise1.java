import java.util.Scanner;

public class Lesson9Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String response = scanner.nextLine();

        for (int i = response.length() - 1; i >= 0; i--) {
            char character = response.charAt(i);
            System.out.print(character);
        }

        scanner.close();
    }
}
