package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void play() {
        String playerName = Engine.getPlayerName();

        System.out.println("What is the result of the expression?");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int correctAnswersCount = 0;
        int correctAnswerNeeded = 3;

        while (correctAnswersCount < correctAnswerNeeded) {
            int num1 = random.nextInt(40);
            int num2 = random.nextInt(40);
            char[] operations = {'+', '-', '*'};
            char operation = operations[random.nextInt(operations.length)];

            String question = num1 + " " + operation + " " + num2;
            int correctAnswerValue;

            switch (operation) {
                case '+':
                    correctAnswerValue = num1 + num2;
                    break;
                case '-':
                    correctAnswerValue = num1 - num2;
                    break;
                case '*':
                    correctAnswerValue = num1 * num2;
                    break;
                default:
                    throw new IllegalStateException("Unexpected operation: " + operation);
            }
            String correctAnswer = String.valueOf(correctAnswerValue);

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
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




