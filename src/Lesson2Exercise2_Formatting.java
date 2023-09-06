import java.util.*;
public class Lesson2Exercise2_Formatting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of item 1: ");
        String Item1Name = input.nextLine();

        System.out.print("Enter the price of item 1: ");
        String Item1Price = input.nextLine();

        System.out.print("Enter the name of item 2: ");
        String Item2Name = input.nextLine();

        System.out.print("Enter the price of item 2: ");
        String Item2Price = input.nextLine();

        System.out.print("Enter the name of item 3: ");
        String Item3Name = input.nextLine();

        System.out.print("Enter the price of item 3: ");
        String Item3Price = input.nextLine();

        float Item1Float = Float.parseFloat(Item1Price);
        float Item2Float = Float.parseFloat(Item2Price);
        float Item3Float = Float.parseFloat(Item3Price);

        float Total = Item1Float + Item2Float + Item3Float;

        System.out.println("NESMART \n" + Item1Name + "........£" + Item1Price);
        System.out.println(Item2Name + "........£" + Item2Price);
        System.out.println(Item3Name + "........£" + Item3Price);
        System.out.format("SUBTOTAL....£%.2f%n", Total);




    }
}
