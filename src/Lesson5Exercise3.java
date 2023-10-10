import java.util.Random;
import java.util.Scanner;

public class Lesson5Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int score = 0;

        for (int questionNumber = 1; questionNumber <= 10; questionNumber++) {
            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;
            int correctAnswer = num1 + num2;

            System.out.print("Question " + questionNumber + ": What is " + num1 + " + " + num2 + "? ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Correct! You earned 1 point.\n");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer is " + correctAnswer);

            }
        }

        System.out.println("Quiz ended. Your score: " + score + " out of 10");

    }
}
