package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner menuScanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        System.out.println("Your choice: ");

        int choice = menuScanner.nextInt();
        menuScanner.nextLine();

        switch (choice) {
            case 1:
                Cli.greetUser();
                break;
            case 2:
                EvenGame.play();
                break;
            case 3:
                Calc.play();
                break;
            case 4:
                GCD.play();
            case 0:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid game number.");
        }
    }
}
