package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        Scanner scannerChoice = new Scanner(System.in);

        System.out.print("Your choice: ");

        int choice = scannerChoice.nextInt();

        if (choice == 1) {
            System.out.println();
            System.out.println("Welcome to the Brain Games!");
            Cli.main(args);
        }

        if (choice == 2) {
            System.out.println();
            System.out.println("Welcome to the Brain Games!");
            Even.main(args);
        } else {
            return;
        }

        scannerChoice.close();

    }
}
