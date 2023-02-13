package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final String TASK_GAME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static boolean isPrime(int number) {
        boolean result = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void startPrimeGame() {
        String[][] gameData = new String[Engine.NUMBER_QUESTION][2];

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int randomNumber = Engine.getRandomNumber(Engine.MAX_NUMBER);
            gameData[i][0] = String.valueOf(randomNumber);
            gameData[i][1] = isPrime(randomNumber) ? "yes" : "no";
        }
        Engine.playGame(gameData, TASK_GAME);
    }
}
