package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class EvenGame {
    private static final Random RANDOM = new Random();

    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int MIN_RANDOM_NUMBER = 1;

    private static final int GAME_DATA = 2;
    private static final int EVEN_DIVISOR = 2;

    public static void play() {
        String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] gameData = new String[Engine.ROUNDS][GAME_DATA];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = RANDOM.nextInt(MAX_RANDOM_NUMBER) + MIN_RANDOM_NUMBER;
            String question = String.valueOf(number);

            String correctAnswer;
            if (number % EVEN_DIVISOR == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            gameData[i][0] = question;
            gameData[i][1] = correctAnswer;
        }

        Engine.runGame(gameDescription, gameData);
    }
}
