package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner menuScanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Great");
        System.out.println("0 - Exit");

        System.out.println("Your choice: ");
        String userChoice = menuScanner.nextLine();

        switch (userChoice) {
            case "1":
                Cli.greetUser();
                break;
            case "0":
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid game number.");
        }
        menuScanner.close();
    }
}
