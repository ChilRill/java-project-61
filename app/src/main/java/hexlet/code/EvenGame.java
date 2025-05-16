package hexlet.code;

import java.util.Random;
import java.util.Scanner;
public class EvenGame {
    public static void play(Scanner scanner) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random random = new Random();
        int correctAnswers = 0;

        while (correctAnswers < 3) {
            int number = random.nextInt(100);
            System.out.println("Question: " + number);
            System.out.println("Your answer: ");
            String userAnswer = scanner.nextLine().trim().toLowerCase();
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again!");
                return;
            }
        }

        System.out.println("Congratulation!");
    }
}
