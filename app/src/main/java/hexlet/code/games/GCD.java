package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {
    private static final Random RANDOM = new Random();

    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int MIN_RANDOM_NUMBER = 1;

    private static final int GAME_DATA_SIZE = 2;

    public static void play() {
        String gameDescription = "Find the greatest common divisor of given numbers.";
        String[][] gameData = new String[Engine.ROUNDS][GAME_DATA_SIZE];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int num1 = RANDOM.nextInt(MAX_RANDOM_NUMBER) + MIN_RANDOM_NUMBER;
            int num2 = RANDOM.nextInt(MAX_RANDOM_NUMBER) + MIN_RANDOM_NUMBER;
            String question = num1 + " " + num2;
            String correctAnswer = String.valueOf(calculateGCD(num1, num2));

            gameData[i][0] = question;
            gameData[i][1] = correctAnswer;
        }
        Engine.runGame(gameDescription, gameData);
    }

    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
