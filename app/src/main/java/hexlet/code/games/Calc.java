package hexlet.code.games;

import hexlet.code.Engine;
public class Calc {
    private static final String[] USED_OPERATORS = {"*", "+", "-"};
    private static final String TASK_GAME = "What is the result of the expression?";
    private static int calculations(int oneNumber, int twoNumber, String operator) {
        return switch (operator) {
            case "*" -> oneNumber * twoNumber;
            case "+" -> oneNumber + twoNumber;
            case "-" -> oneNumber - twoNumber;
            default -> throw new RuntimeException("Invalid statement.");
        };
    }
    public static void startCalcGame() {
        String[][] gameData = new String[Engine.NUMBER_QUESTION][2];

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int oneNumber = Engine.getRandomNumber(Engine.OTHER_NUMBER);
            int twoNumber = Engine.getRandomNumber(Engine.OTHER_NUMBER);
            gameData[i][0] = oneNumber + " " + USED_OPERATORS[i] + " " + twoNumber;
            gameData[i][1] = String.valueOf(calculations(oneNumber, twoNumber, USED_OPERATORS[i]));
        }
        Engine.playGame(gameData, TASK_GAME);
    }
}
