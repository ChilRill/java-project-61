package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static final int EXIT_CHOICE = 0;
    public static final int GREET_CHOICE = 1;
    public static final int EVEN_CHOICE = 2;
    public static final int CALC_CHOICE = 3;
    public static final int GCD_CHOICE = 4;
    public static final int PROGRESSION_CHOICE = 5;
    public static final int PRIME_CHOICE = 6;
    public static void main(String[] args) {
        Scanner menuScanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println(GREET_CHOICE + " - Greet");
        System.out.println(EVEN_CHOICE + " - Even");
        System.out.println(CALC_CHOICE + " - Calc");
        System.out.println(GCD_CHOICE + " - GCD");
        System.out.println(PROGRESSION_CHOICE+ " - Progression");
        System.out.println(PRIME_CHOICE+ " - Prime");
        System.out.println(EXIT_CHOICE+ " - Exit");
        System.out.print("Your choice: ");

        int choice = menuScanner.nextInt();
        menuScanner.nextLine();

        switch (choice) {
            case GREET_CHOICE:
                Engine.getPlayerName();
                break;
            case EVEN_CHOICE:
                EvenGame.play();
                break;
            case CALC_CHOICE:
                Calc.play();
                break;
            case GCD_CHOICE:
                GCD.play();
                break;
            case PROGRESSION_CHOICE:
                Progression.play();
                break;
            case PRIME_CHOICE:
                Prime.play();
                break;
            case EXIT_CHOICE:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid game number.");
        }
        menuScanner.close();
    }
}
