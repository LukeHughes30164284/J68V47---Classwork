public class Lesson8Exercise2 {
    public static void main(String[] args) {

        Integer[] scores = {26, 78, 89, 58, 14, 49, 68, 93, 55, 74};

        float sum = 0;
        for (int index = 0; index < scores.length; index++) {
            System.out.println(scores[index]);
            sum += scores[index];

        }

        float average = sum / scores.length;
        System.out.format("The average score is: %.1f", average);
    }
}
