package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int rounds = 3;

    public static String getPlayerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static void runGame(String gameDescription, String[][] gameData) {
        String playerName = getPlayerName();

        System.out.println(gameDescription);

        Scanner scanner = new Scanner(System.in);
        int correctAnswersCount = 0;

        for (int i = 0; i < rounds; i++) {
            String question = gameData[i][0];
            String correctAnswer = gameData[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim().toLowerCase();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                showWrongAnswerMessage(userAnswer, correctAnswer, playerName);
                scanner.close();
                return;
            }
        }
        showCongratulationsMessage(playerName);
        scanner.close();
    }

    public static void showWrongAnswerMessage(String userAnswer, String correctAnswer, String playerName) {
        System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
        System.out.println("Let's try again, " + playerName + "!");
    }

    public static void showCongratulationsMessage(String playerName) {
        System.out.println("Congratulations, " + playerName + "!");
    }
}







