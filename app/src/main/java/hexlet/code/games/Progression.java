package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void main(String[] args) {
        String userName = Engine.nameUser();
        System.out.println(Engine.questionProgression);
        System.out.println(Engine.question);
        Engine.progressionOne();
        int resultOne = Engine.answerUser();

        if (resultOne == Engine.resultOneNumber) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + resultOne + "'" + Engine.isWrong + Engine.resultOneNumber + "'.");
            System.out.println(Engine.letsTry + userName + "!");
            return;
        }

            System.out.print("Question: ");
            Engine.progressionTwo();
            int resultTwo = Engine.answerUser();

            if (resultTwo == Engine.resultTwoNumber) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + resultTwo + "'" + " is wrong answer ;(. Correct answer was " + "'" + Engine.resultTwoNumber + "'.");
                System.out.println("Let's try again, " + userName + "!");
            return;
            }

        System.out.print("Question: ");
        Engine.progressionThree();
        int resultThree = Engine.answerUser();

        if (resultThree == Engine.resultThreeNumber) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + resultThree + "'" + " is wrong answer ;(. Correct answer was " + "'" + Engine.resultThreeNumber + "'.");
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}
