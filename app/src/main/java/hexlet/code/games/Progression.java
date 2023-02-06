package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static final int numberQuestion = 3;
    private static final int maxLength = 10;
    private static int[] getPrintProgression(int element, int step, int maxLength) {
        int[] printProgression = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            if (i == 0) {
                printProgression[i] = element;
            } else {
                printProgression[i] = printProgression[i - 1] + step;
            }
        }
        return printProgression;
    }

    public static void gameProgression() {
        String[][] gameData = new String[numberQuestion][2];

        for (int i = 0; i < Engine.maxRounds; i++) {
            int firstElement = Engine.getRandomNumber(maxLength);
            int step = Engine.getRandomNumber(maxLength);
            int[] gameProgression = getPrintProgression(firstElement, step, maxLength);
            int missingElement = Engine.getRandomNumber(maxLength);
            StringBuilder missedElement = new StringBuilder();
            for (int j = 0; j < maxLength; j++) {
                if (j == missingElement) {
                    missedElement.append(".. ");
                } else {
                    missedElement.append(gameProgression[j]);
                    missedElement.append(" ");
                }
            }
            gameData[i][0] = missedElement.toString();
            gameData[i][1] = Integer.toString(gameProgression[missingElement]);
        }
        String taskGame =  "What number is missing in the progression?";
        Engine.playGame(gameData, taskGame);
    }
}
