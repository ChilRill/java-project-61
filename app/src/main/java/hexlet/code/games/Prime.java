package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    private static final Random RANDOM = new Random();

    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int MIN_RANDOM_NUMBER = 2;

    private static final int GAME_DATA_SIZE = 2;
    private static final int FIRST_PRIME_NUMBER = 2;


    public static void play() {
        String gameDescription = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] gameData = new String[Engine.ROUNDS][GAME_DATA_SIZE];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = RANDOM.nextInt(MAX_RANDOM_NUMBER) + MIN_RANDOM_NUMBER;

            String question = String.valueOf(number);
            String correctAnswer = isPrime(number) ? "yes" : "no";

            gameData[i][0] = question;
            gameData[i][1] = correctAnswer;
        }

        Engine.runGame(gameDescription, gameData);
    }

    private static boolean isPrime(int number) {
        if (number < FIRST_PRIME_NUMBER) {
            return false;
        }
        for (int i = FIRST_PRIME_NUMBER; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return  true;
    }
}
