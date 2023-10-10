import java.util.Scanner;
public class Lesson6Exercise3 {

    public static void main(String[] args) {

        int lives = 3;
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
                    lives--;
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
                    lives--;
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
                    lives--;
                }
            }
            if (count == 4) {
                System.out.println("What is 23 + 14?");
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the answer: ");
                int answer = scanner.nextInt();
                if (answer == 47) {
                    System.out.println("Well done!");
                    score++;
                } else {
                    System.out.println("Sorry, the answer is 47");
                    lives--;
                }
            }
            if (count == 5) {
                System.out.println("What is 4 x 9?");
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the answer: ");
                int answer = scanner.nextInt();
                if (answer == 36) {
                    System.out.println("Well done!");
                    score++;
                } else {
                    System.out.println("Sorry, the answer is 36");
                    lives--;
                }
            }
            if (count == 6) {
                System.out.println("What is 27 / 3?");
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the answer: ");
                int answer = scanner.nextInt();
                if (answer == 9) {
                    System.out.println("Well done!");
                    score++;
                } else {
                    System.out.println("Sorry, the answer is 9");
                    lives--;
                }
            }
            if (count == 7) {
                System.out.println("What is 15 + 12?");
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the answer: ");
                int answer = scanner.nextInt();
                if (answer == 27) {
                    System.out.println("Well done!");
                    score++;
                } else {
                    System.out.println("Sorry, the answer is 27");
                    lives--;
                }
            }
            if (count == 8) {
                System.out.println("What is 9 x 11?");
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the answer: ");
                int answer = scanner.nextInt();
                if (answer == 99) {
                    System.out.println("Well done!");
                    score++;
                } else {
                    System.out.println("Sorry, the answer is 99");
                    lives--;
                }
            }
            if (count == 9) {
                System.out.println("What is 78 - 23?");
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the answer: ");
                int answer = scanner.nextInt();
                if (answer == 55) {
                    System.out.println("Well done!");
                    score++;
                } else {
                    System.out.println("Sorry, the answer is 55");
                    lives--;
                }
            }
            if (count == 10) {
                System.out.println("What is 3 x 15?");
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the answer: ");
                int answer = scanner.nextInt();
                if (answer == 45) {
                    System.out.println("Well done!");
                    score++;
                } else {
                    System.out.println("Sorry, the answer is 45");
                    lives--;
                }
            }
            System.out.println("Your score is " + score);

            if (lives == 3) {a
                System.out.println("well done");
            }
        }
    }
}
