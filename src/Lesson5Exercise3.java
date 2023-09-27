import java.util.Scanner;
public class Lesson5Exercise3 {

    public static void main(String[] args) {

        int score = 0;
        for (int count=1; count<=10; count++){

            System.out.println("What is 5 + 7?");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the answer: ");
            int answer = scanner.nextInt();

            if (answer == 12){
                System.out.println("Well done!");
                score++;
            } else {
                System.out.println("Sorry, the answer is 12");
            }
        }
    }
}
