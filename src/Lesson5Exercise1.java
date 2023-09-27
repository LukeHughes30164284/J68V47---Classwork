import java.util.*;
public class Lesson5Exercise1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int Number = input.nextInt();

        for( int count=1; count<=12; count++ )
        {
            int Answer = count * Number;
            System.out.println(Number + " x " + count + " = " + Answer);
        }


    }
}
