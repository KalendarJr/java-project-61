package hexlet.code.games;

import hexlet.code.Engine;
public class Calc {
    public static void main(String[] args) {
        String userName = Engine.nameUser();

        System.out.println("What is the result of the expression?");
        System.out.println("Question: " + Engine.numberOne + " * " + Engine.numberTwo);
        System.out.print("Your answer: ");
        int resultOne = Engine.answerUser();

        if (resultOne == Engine.resultOne) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + resultOne + "'" + " is wrong answer ;(. Correct answer was " + "'" + Engine.resultOne + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return;
        }

        System.out.println("Question: " + Engine.numberThree + " + " + Engine.numberFour);
        System.out.print("Your answer: ");
        int resultTwo = Engine.answerUser();

        if (resultTwo == Engine.resultTwo) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + resultTwo + "'" + " is wrong answer ;(. Correct answer was " + "'" + Engine.resultTwo + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return;
        }

        System.out.println("Question: " + Engine.numberFive + " - " + Engine.numberSix);
        System.out.print("Your answer: ");

        int resultThree = Engine.answerUser();

        if (resultThree == Engine.resultThree) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("'" + resultThree + "'" + " is wrong answer ;(. Correct answer was " + "'" + Engine.resultThree + "'.");
            System.out.println("Let's try again, " + userName + "!");
        }

    }
}
