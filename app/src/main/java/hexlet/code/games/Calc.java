package hexlet.code.games;

import hexlet.code.Engine;
public class Calc {
    private static final int numberQuestion = 3;
    public static int calculations(int oneNumber, int twoNumber, String operator) {
        return switch (operator) {
            case "*" -> oneNumber * twoNumber;
            case "+" -> oneNumber + twoNumber;
            case "-" -> oneNumber - twoNumber;
            default -> 0;
        };
    }
    public static void gameCalc() {
        String[][] gameData = new String[numberQuestion][2];
        String[] usedOperators = {"*", "+", "-"};

        for (int i = 0; i < Engine.maxRounds; i++) {
            int oneNumber = Engine.getRandomNumber(Engine.otherNumber);
            int twoNumber = Engine.getRandomNumber(Engine.otherNumber);
            gameData[i][0] = oneNumber + " " + usedOperators[i] + " " + twoNumber;
            gameData[i][1] = String.valueOf(calculations(oneNumber, twoNumber, usedOperators[i]));
        }
        String taskGame = "What is the result of the expression?";
        Engine.playGame(gameData, taskGame);
    }
}
