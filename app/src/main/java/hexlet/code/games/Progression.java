package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static final int MAX_LENGTH = 10;
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
        String[][] gameData = new String[Engine.NUMBER_QUESTION][2];

        for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
            int generalMeaning = Engine.getRandomNumber(MAX_LENGTH);
            int[] gameProgression = getPrintProgression(generalMeaning, generalMeaning, MAX_LENGTH);
            StringBuilder missedElement = new StringBuilder();
            for (int j = 0; j < MAX_LENGTH; j++) {
                if (j == generalMeaning) {
                    missedElement.append(".. ");
                } else {
                    missedElement.append(gameProgression[j]);
                    missedElement.append(" ");
                }
            }
            gameData[i][0] = missedElement.toString();
            gameData[i][1] = Integer.toString(gameProgression[generalMeaning]);
        }
        String taskGame =  "What number is missing in the progression?";
        Engine.playGame(gameData, taskGame);
    }
}
