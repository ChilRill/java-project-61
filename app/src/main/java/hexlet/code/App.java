package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Great");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.println("Your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                Cli.greetUser();
                break;
            case 2:
                System.out.println("\nWelcome to the Brain Games!");
                System.out.println("May I have your name? ");
                String name = scanner.nextLine();
                System.out.println("Hello, " + name + "!");
                EvenGame.play(scanner);
                break;
            case 0:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid game number.");
        }
        scanner.close();
    }
}
