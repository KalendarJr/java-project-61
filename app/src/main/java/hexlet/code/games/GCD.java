package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static int maxGcd(int numberOne, int numberTwo) {
        return numberTwo == 0 ? numberOne : maxGcd(numberTwo, numberOne % numberTwo);
    }

    public static void gameGCD() {
        String[][] gameData = new String[Engine.NUMBER_QUESTION][2];

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int oneNumber = Engine.getRandomNumber(Engine.MAX_NUMBER);
            int twoNumber = Engine.getRandomNumber(Engine.MAX_NUMBER);
            gameData[i][0] = oneNumber + " " + twoNumber;
            gameData[i][1] = String.valueOf(maxGcd(oneNumber, twoNumber));
        }
        String taskGame = "Find the greatest common divisor of given numbers.";
        Engine.playGame(gameData, taskGame);
    }
}
