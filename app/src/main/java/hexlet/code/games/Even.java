package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void main(String[] args) {
        String userName = Engine.nameUser();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        System.out.println("Question: " + Engine.numberOne);
        System.out.print("Your answer: ");
        String resultOne = Engine.answerUserString();

        String yes = "yes";
        String no = "no";

        if (Engine.numberOne % 2 == 0 && resultOne.equals(yes)) {
            System.out.println("Correct!");
        } else if (Engine.numberOne % 2 != 0 && resultOne.equals(no)) {
            System.out.println("Correct!");
        } else if (Engine.numberOne % 2 == 0 && resultOne.equals(no)) {
            System.out.println("'" + resultOne + "'" + " is wrong answer ;(. Correct answer was '" + yes + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return;
        } else if (Engine.numberOne % 2 != 0 && resultOne.equals(yes)) {
            System.out.println("'" + resultOne + "'" + " is wrong answer ;(. Correct answer was '" + no + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return;
        }

        System.out.println("Question: " + Engine.numberTwo);
        System.out.print("Your answer: ");
        String resultTwo = Engine.answerUserString();

        if (Engine.numberTwo % 2 == 0 && resultTwo.equals(yes)) {
            System.out.println("Correct!");
        } else if (Engine.numberTwo % 2 != 0 && resultTwo.equals(no)) {
            System.out.println("Correct!");
        } else if (Engine.numberTwo % 2 == 0 && resultTwo.equals(no)) {
            System.out.println("'" + resultTwo + "'" + " is wrong answer ;(. Correct answer was '" + yes + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return;
        } else if (Engine.numberTwo % 2 != 0 && resultTwo.equals(yes)) {
            System.out.println("'" + resultTwo + "'" + " is wrong answer ;(. Correct answer was '" + no + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return;
        }

        System.out.println("Question: " + Engine.numberThree);
        System.out.print("Your answer: ");
        String resultThree = Engine.answerUserString();

        if (Engine.numberThree % 2 == 0 && resultThree.equals(yes)) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        } else if (Engine.numberThree % 2 != 0 && resultThree.equals(no)) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        } else if (Engine.numberThree % 2 == 0 && resultThree.equals(no)) {
            System.out.println("'" + resultThree + "'" + " is wrong answer ;(. Correct answer was '" + yes + "'.");
            System.out.println("Let's try again, " + userName + "!");
        } else if (Engine.numberThree % 2 != 0 && resultThree.equals(yes)) {
            System.out.println("'" + resultThree + "'" + " is wrong answer ;(. Correct answer was '" + no + "'.");
            System.out.println("Let's try again, " + userName + "!");
        }

    }
}
