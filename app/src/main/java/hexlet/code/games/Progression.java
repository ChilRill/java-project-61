package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    private static final Random RANDOM = new Random();
    private static final int START_FIRST_NUMBER = 20;
    private static final int START_SECOND_NUMBER = 1;

    private static final int STEP_FIRST_NUMBER = 10;
    private static final int STEP_SECOND_NUMBER = 1;

    private static final int PROGRESSION_LENGTH_RANDOM_BOUND = 6;
    private static final int MIN_PROGRESSION_LENGTH = 5;

    private static final int GAME_DATA_SIZE = 2;

    public static void play() {
        String gameDescription = "What number is missing in the progression?";
        String[][] gameData = new String[Engine.ROUNDS][GAME_DATA_SIZE];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int start = RANDOM.nextInt(START_FIRST_NUMBER) + START_SECOND_NUMBER;
            int step = RANDOM.nextInt(STEP_FIRST_NUMBER) + STEP_SECOND_NUMBER;
            int progressionLength = RANDOM.nextInt(PROGRESSION_LENGTH_RANDOM_BOUND) + MIN_PROGRESSION_LENGTH;

            int[] numbers = new int[progressionLength];
            for (int j = 0; j < progressionLength; j++) {
                numbers[j] = start + j * step;
            }

            int hiddenIndex = RANDOM.nextInt(progressionLength);
            String correctAnswer = String.valueOf(numbers[hiddenIndex]);

            String question = "";
            for (int j = 0; j < progressionLength; j++) {
                if (j == hiddenIndex) {
                    question = question + "..";
                } else {
                    question = question + numbers[j];
                }
                if (j < progressionLength - 1) {
                    question = question + " ";
                }
            }
            gameData[i][0] = question;
            gameData[i][1] = correctAnswer;
        }

        Engine.runGame(gameDescription, gameData);
    }
}
