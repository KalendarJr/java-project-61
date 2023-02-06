package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static int maxGcd(int numberOne, int numberTwo) {
        int gcd = 1;
        for (int i = 1; i <= numberOne && i <= numberTwo; i++) {
            if (numberOne % i == 0 && numberTwo % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void gameGCD() {
        String[][] gameData = new String[3][2];

        for (int i = 0; i < Engine.maxRounds; i++) {
            int oneNumber = Engine.getRandomNumber(Engine.maxNumber);
            int twoNumber = Engine.getRandomNumber(Engine.maxNumber);
            gameData[i][0] = oneNumber + " " + " " + twoNumber;
            gameData[i][1] = String.valueOf(maxGcd(oneNumber, twoNumber));
        }
        String taskGame = "Find the greatest common divisor of given numbers.";
        Engine.playGame(gameData, taskGame);
    }
}
