package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    private static final Random RANDOM = new Random();

    public static void play() {
        String gameDescription = "What is the result of the expression?";
        String[][] gameData = new String[Engine.rounds][2];

        for (int i = 0; i < Engine.rounds; i++) {
            int num1 = RANDOM.nextInt(40);
            int num2 = RANDOM.nextInt(40);
            char[] operations = {'+', '-', '*'};
            char operation = operations[RANDOM.nextInt(operations.length)];

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

            gameData[i][0] = question;
            gameData[i][1] = correctAnswer;
        }

        Engine.runGame(gameDescription, gameData);
    }
}




