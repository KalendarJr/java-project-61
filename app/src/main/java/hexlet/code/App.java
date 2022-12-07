package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");

        Scanner scannerChoice = new Scanner(System.in);

        System.out.print("Your choice: ");

        int choice = scannerChoice.nextInt();

        switch (choice) {
            case 1:
                Engine.welcomeUser();
                Cli.main(args);
                break;
            case 2:
                Engine.welcomeUser();
                Even.main(args);
                break;
            case 3:
                Engine.welcomeUser();
                Calc.main(args);
                break;
            case 4:
                Engine.welcomeUser();
                GCD.main(args);
                break;
            case 5:
                Engine.welcomeUser();
                Progression.main(args);
                break;
        }

        scannerChoice.close();

    }
}
