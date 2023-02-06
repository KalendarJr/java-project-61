package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static int maxRounds = 3;
    public static int otherNumber = 20;
    public static int maxNumber = 100;
    public static int getRandomNumber(int lim) {
        return (int) (Math.random() * lim);
    }
    public static void playGame(String[][] dataGame, String taskGame) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(taskGame);

        for (int i = 0; i < Engine.maxRounds; i++) {
            System.out.println("Question: " + dataGame[i][0]);
            System.out.print("Your answer: ");
            String answerUser = scanner.next();
            if (answerUser.equals(dataGame[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answerUser + "'" + " is wrong answer ;(. "
                        + "Correct answer was " + "'" + dataGame[i][1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
