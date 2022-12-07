package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void main(String[] args) {
        String userName = Engine.nameUser();

        var i = 3;
        System.out.println("Find the greatest common divisor of given numbers.");
        System.out.println("Question: " + Engine.numberOne + " " + Engine.numberOne * i);
        System.out.print("Your answer: ");
        int resultOne = Engine.answerUser();

        if (resultOne == Engine.numberOne) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + resultOne + "'" + " is wrong answer ;(. Correct answer was '" + i + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return;
        }

        var j = 5;
        System.out.println("Question: " + (Engine.numberTwo * j + 30) + " " + (Engine.numberTwo + 30));
        System.out.print("Your answer: ");
        int resultTwo = Engine.answerUser();

        if (resultTwo == Engine.numberTwo) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + resultTwo + "'" + " is wrong answer ;(. Correct answer was " + "'" + Engine.numberTwo + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return;
        }

        var k = 7;
        System.out.println("Question: " + Engine.numberThree + " " + Engine.numberThree * k);
        System.out.print("Your answer: ");

        int resultThree = Engine.answerUser();

        if (resultThree == Engine.numberThree) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("'" + resultThree + "'" + " is wrong answer ;(. Correct answer was " + "'" + Engine.numberThree + "'.");
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}
