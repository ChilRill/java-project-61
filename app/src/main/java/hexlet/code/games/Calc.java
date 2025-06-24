package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    private static final Random RANDOM = new Random();

    private static final int MAX_RANDOM_NUMBER = 40;
    private static final int GAME_DATA = 2;

    public static void play() {
        String gameDescription = "What is the result of the expression?";
        String[][] gameData = new String[Engine.ROUNDS][GAME_DATA];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int num1 = RANDOM.nextInt(MAX_RANDOM_NUMBER);
            int num2 = RANDOM.nextInt(MAX_RANDOM_NUMBER);
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




