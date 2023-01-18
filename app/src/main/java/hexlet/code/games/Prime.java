package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void main(String[] args) {
        String userName = Engine.nameUser();
        System.out.println(Engine.questionPrime);

        System.out.println(Engine.question + Engine.primeNumberOne);
        System.out.print("Your answer: ");
        String resultOne = Engine.answerUserString();
        if (Engine.isPrime(Engine.primeNumberOne) == true && resultOne.equals("yes")) {
            System.out.println("Correct!");
        } else if (Engine.isPrime(Engine.primeNumberOne) == true && resultOne.equals("no")) {
            System.out.println("'" + resultOne + "'" + " is wrong answer ;(. Correct answer was " + "'" + "yes" + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return;
        } else if (Engine.isPrime(Engine.primeNumberOne) == false && resultOne.equals("yes")) {
            System.out.println("'" + resultOne + "'" + " is wrong answer ;(. Correct answer was " + "'" + "no" + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return;
        } else if (Engine.isPrime(Engine.primeNumberOne) == false && resultOne.equals("no")) {
            System.out.println("Correct!");
        }

        System.out.println(Engine.question + Engine.primeNumberTwo);
        System.out.print("Your answer: ");
        String resultTwo = Engine.answerUserString();
        if (Engine.isPrime(Engine.primeNumberTwo) == true && resultTwo.equals("yes")) {
            System.out.println("Correct!");
        } else if (Engine.isPrime(Engine.primeNumberTwo) == true && resultTwo.equals("no")) {
            System.out.println("'" + resultTwo + "'" + " is wrong answer ;(. Correct answer was " + "'" + "yes" + "'.");
            return;
        } else if (Engine.isPrime(Engine.primeNumberTwo) == false && resultTwo.equals("yes")) {
            System.out.println("'" + resultTwo + "'" + " is wrong answer ;(. Correct answer was " + "'" + "no" + "'.");
            return;
        } else if (Engine.isPrime(Engine.primeNumberTwo) == false && resultTwo.equals("no")) {
            System.out.println("Correct!");
        }

        System.out.println(Engine.question + Engine.primeNumberThree);
        System.out.print("Your answer: ");
        String resultThree = Engine.answerUserString();
        if (Engine.isPrime(Engine.primeNumberThree) == true && resultThree.equals("yes")) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        } else if (Engine.isPrime(Engine.primeNumberThree) == true && resultThree.equals("no")) {
            System.out.println("'" + resultThree + "'" + " is wrong answer ;(. Correct answer was " + "'" + "yes" + "'.");
            return;
        } else if (Engine.isPrime(Engine.primeNumberThree) == false && resultThree.equals("yes")) {
            System.out.println("'" + resultOne + "'" + " is wrong answer ;(. Correct answer was " + "'" + "no" + "'.");
            return;
        } else if (Engine.isPrime(Engine.primeNumberThree) == false && resultThree.equals("no")) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
