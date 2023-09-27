import java.util.Scanner;
public class Lesson5Exercise3 {

    public static void main(String[] args) {

        int score = 0;
        for (int count = 1; count <= 10; count++) {

            if (count == 1) {
                System.out.println("What is 5 + 7?");
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the answer: ");
                int answer = scanner.nextInt();
                if (answer == 12) {
                    System.out.println("Well done!");
                    score++;
                } else {
                    System.out.println("Sorry, the answer is 12");
                }
            }
            if (count == 2) {
                System.out.println("What is 5 x 3?");
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the answer: ");
                int answer = scanner.nextInt();
                if (answer == 15) {
                    System.out.println("Well done!");
                    score++;
                } else {
                    System.out.println("Sorry, the answer is 15");
                }
            }
            if (count == 3) {
                System.out.println("What is 24 - 6?");
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the answer: ");
                int answer = scanner.nextInt();
                if (answer == 18) {
                    System.out.println("Well done!");
                    score++;
                } else {
                    System.out.println("Sorry, the answer is 18");
                }
            }
            System.out.println("Your score is " + score);
        }
    }
}
