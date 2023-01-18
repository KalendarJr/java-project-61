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

        var oneGcd = Engine.maxGcd(Engine.numberOne, Engine.numberOne * i);
        if (resultOne == Engine.maxGcd(Engine.numberOne, Engine.numberOne * i)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + resultOne + "'" + " is wrong answer ;(. Correct answer was '" + oneGcd + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return;
        }

        var j = 5;
        System.out.println("Question: " + (Engine.numberTwo * j) + " " + (Engine.numberTwo + 30));
        System.out.print("Your answer: ");
        int resultTwo = Engine.answerUser();

        var twoGcd = Engine.maxGcd(Engine.numberTwo * j, Engine.numberTwo + 30);
        if (resultTwo == twoGcd) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + resultTwo + "'" + " is wrong answer ;(. Correct answer was " + "'" + twoGcd + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return;
        }

        var k = 7;
        System.out.println("Question: " + Engine.numberOne + " " + Engine.numberOne * k);
        System.out.print("Your answer: ");
        int resultThree = Engine.answerUser();

        var threeGcd = Engine.maxGcd(Engine.numberOne, Engine.numberOne * k);
        if (resultThree == threeGcd) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("'" + resultThree + "'" + " is wrong answer ;(. Correct answer was " + "'" + threeGcd + "'.");
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}
