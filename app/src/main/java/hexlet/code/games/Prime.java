package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;
import java.util.Random;

public class Prime {
    public static void play() {
        String playerName = Engine.getPlayerName();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'. ");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int correctAnswersCount = 0;
        final int rounds = 3;

        while (correctAnswersCount < rounds) {
            int number = random.nextInt(100) + 2;

            String question = String.valueOf(number);
            String correctAnswer = isPrime(number) ? "yes" : "no";

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim().toLowerCase();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct");
                correctAnswersCount++;
            } else {
                Engine.showWrongAnswerMessage(userAnswer, correctAnswer, playerName);
                scanner.close();
            }
        }

        Engine.showCongratulationsMessage(playerName);
        scanner.close();
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return  true;
    }
}
