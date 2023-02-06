package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static int[] getPrintProgression(int element, int step, int length) {
//        int lengthProgression = Engine.getRandomNumber(Engine.otherNumber);
        int[] printProgression = new int[length];

        for (int i = 0; i < length; i++) {
            if (i == 0) {
                printProgression[i] = element;
            } else {
                printProgression[i] = printProgression[i - 1] + step;
            }
        }
        return printProgression;
    }

    public static void gameProgression() {
        String[][] gameData = new String[3][2];

        for (int i = 0; i < Engine.maxRounds; i++) {
            int maxLength = 10;
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
