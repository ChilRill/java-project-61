package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static void play() {
        String playerName = Engine.getPlayerName();

        System.out.println("Find the common divisor of given numbers.");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int correctAnswersCount = 0;
        final int rounds = 3;

        while (correctAnswersCount < rounds) {
            int num1 = random.nextInt(100) + 1;
            int num2 = random.nextInt(100) + 1;

            String question = num1 + " " + num2;
            int correctAnswerValue = findGCD(num1, num2);
            String correctAnswer = String.valueOf(correctAnswerValue);

            System.out.println("Question: " + question);
            System.out.println("Your answer: ");
            String userAnswer = scanner.nextLine().trim();

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

    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
