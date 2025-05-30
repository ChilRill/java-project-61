package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {
    public static void play() {
        String gameDescription = "Find the greatest common divisor of given numbers.";
        String[][] gameData = new String[Engine.rounds][2];

        Random random = new Random();

        for (int i = 0; i < Engine.rounds; i++) {
            int num1 = random.nextInt(100) + 1;
            int num2 = random.nextInt(100) + 1;
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
