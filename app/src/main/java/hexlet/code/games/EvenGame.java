package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class EvenGame {
    private static final Random RANDOM = new Random();

    public static void play() {
        String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String [][] gameData = new String[Engine.rounds][2];

        for (int i = 0; i < Engine.rounds; i++) {
            int number = RANDOM.nextInt(100) + 1;
            String question = String.valueOf(number);

            String correctAnswer;
            if (number % 2 == 0) {
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
