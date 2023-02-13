package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    private static final int GREETING = 1;
    private static final int EVEN_GAME = 2;
    private static final int CALC_GAME = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION_GAME = 5;
    private static final int PRIME_GAME = 6;
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        Scanner scannerChoice = new Scanner(System.in);

        System.out.print("Your choice: ");

        int choice = scannerChoice.nextInt();

        switch (choice) {
            case GREETING -> Cli.main(args);
            case EVEN_GAME -> Even.startEvenGame();
            case CALC_GAME -> Calc.startCalcGame();
            case GCD_GAME -> GCD.startGCDGame();
            case PROGRESSION_GAME -> Progression.startProgressionGame();
            case PRIME_GAME -> Prime.startPrimeGame();
            default -> System.out.println("Sorry. There is no such item.");
        }

        scannerChoice.close();

    }
}
