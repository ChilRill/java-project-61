package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    public static void play() {
        String playerName = Engine.getPlayerName();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int correctAnswersCount = 0;
        int correctAnswerNeeded = 3;

        while (correctAnswersCount < correctAnswerNeeded) {
            int number = random.nextInt(100) + 1;
            System.out.println("Question: " + number);
            System.out.println("Your answer: ");
            String userAnswer = scanner.nextLine().trim().toLowerCase();

            String correctAnswer;
            if (number % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                Engine.showWrongAnswerMessage(userAnswer, correctAnswer, playerName);
                scanner.close();
                return;
            }
        }

        Engine.showCongratulationsMessage(playerName);
        scanner.close();
    }
}
