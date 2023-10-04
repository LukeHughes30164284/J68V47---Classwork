import java.util.*;
public class Lesson6Exercise2 {
    public static void main(String[] args) {

        int Count = 1;
        while (Count < 2) {

            Scanner input = new Scanner(System.in);
            System.out.print("1. Say 'Hello'\n2. Tell me the time\n3. Tell me the date\n4. Quit\n");
            int Number = input.nextInt();

            if (Number == 1) {
                System.out.println("Hello");
            }
            if (Number == 2) {
                System.out.println("The time is 12pm");
            }
            if (Number == 3) {
                System.out.println("The date is 04/10/2023");
            }
            if (Number == 4) {
                Count++;
            }

        }
    }
}
