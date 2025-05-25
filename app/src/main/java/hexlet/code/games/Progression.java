package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void play() {
        String playerName = Engine.getPlayerName();

        System.out.println("What number is missing in the progression?");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int correctAnswersCount = 0;
        final int rounds = 3;

        while (correctAnswersCount < rounds) {
            int start = random.nextInt(20) + 1;
            int step = random.nextInt(10) + 1;
            int progressionLength = random.nextInt(6) + 5;

            int[] numbers = new int[progressionLength];
            for (int i = 0; i < progressionLength; i++) {
                numbers[i] = start + i * step;
            }

            int hiddenIndex = random.nextInt(progressionLength);
            String correctAnswer = String.valueOf(numbers[hiddenIndex]);

            String question = "";
            for (int i = 0; i < progressionLength; i++) {
                if (i == hiddenIndex) {
                    question = question + "..";
                } else {
                    question = question + numbers[i];
                }

                if (i < progressionLength - 1) {
                    question = question + " ";
                }
            }

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
}
