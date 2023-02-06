package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static int numberQuestion = 3;
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

    public static void gamePrime() {
        String[][] gameData = new String[numberQuestion][2];

        for (int i = 0; i < Engine.maxRounds; i++) {
            int randomNumber = Engine.getRandomNumber(Engine.maxNumber);
            gameData[i][0] = String.valueOf(randomNumber);
            gameData[i][1] = isPrime(randomNumber) ? "yes" : "no";
        }
        String taskGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.playGame(gameData, taskGame);
    }
}
