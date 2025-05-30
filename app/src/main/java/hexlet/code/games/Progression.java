package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;


public class Progression {
    public static void play() {
        String gameDescription = "What number is missing in the progression?";
        String[][] gameData = new String[Engine.rounds][2];

        Random random = new Random();
        for (int i = 0; i < Engine.rounds; i++) {
            int start = random.nextInt(20) + 1;
            int step = random.nextInt(10) + 1;
            int progressionLength = random.nextInt(6) + 5;

            int[] numbers = new int[progressionLength];
            for (int j = 0; j < progressionLength; j++) {
                numbers[j] = start + j * step;
            }

            int hiddenIndex = random.nextInt(progressionLength);
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
