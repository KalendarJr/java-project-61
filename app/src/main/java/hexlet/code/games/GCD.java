package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static final String TASK_GAME = "Find the greatest common divisor of given numbers.";
    private static int maxGcd(int numberOne, int numberTwo) {
        return numberTwo == 0 ? numberOne : maxGcd(numberTwo, numberOne % numberTwo);
    }

    public static void startGCDGame() {
        String[][] gameData = new String[Engine.NUMBER_QUESTION][2];

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int leftOperand = Engine.getRandomNumber(Engine.MAX_NUMBER);
            int rightOperand = Engine.getRandomNumber(Engine.MAX_NUMBER);
            gameData[i][0] = leftOperand + " " + rightOperand;
            gameData[i][1] = String.valueOf(maxGcd(leftOperand, rightOperand));
        }
        Engine.playGame(gameData, TASK_GAME);
    }
}
