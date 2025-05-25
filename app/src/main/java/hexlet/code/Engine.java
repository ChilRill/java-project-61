package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String getPlayerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
    public static void showWrongAnswerMessage(String userAnswer, String correctAnswer, String playerName) {
        System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
        System.out.println("Let's try again, " + playerName + "!");
    }

    public static void showCongratulationsMessage(String playerName) {
        System.out.println("Congratulations, " + playerName + "!");
    }
}
