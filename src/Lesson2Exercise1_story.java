import java.util.*;
public class Lesson2Exercise1_story {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String Name = input.nextLine();

        System.out.print("Enter your Hobby: ");
        String Hobby = input.nextLine();

        System.out.println(Name + "enjoys" + Hobby + "in their spare time.");
        System.out.println("They find" + Hobby + " relaxing and satisfying.");
        System.out.println(Hobby + "allows " + Name + "to express their creative side.");
    }
}
