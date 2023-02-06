package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static final int numberQuestion = 3;
    private static int maxGcd(int numberOne, int numberTwo) {
        return numberTwo == 0 ? numberOne : maxGcd(numberTwo, numberOne % numberTwo);
    }

    public static void gameGCD() {
        String[][] gameData = new String[numberQuestion][2];

        for (int i = 0; i < Engine.maxRounds; i++) {
            int oneNumber = Engine.getRandomNumber(Engine.maxNumber);
            int twoNumber = Engine.getRandomNumber(Engine.maxNumber);
            gameData[i][0] = oneNumber + " " + twoNumber;
            gameData[i][1] = String.valueOf(maxGcd(oneNumber, twoNumber));
        }
        String taskGame = "Find the greatest common divisor of given numbers.";
        Engine.playGame(gameData, taskGame);
    }
}
