/*
 * Simple example of the Template Design Pattern
 * A subclass that implements a simple guessing game.
 */
package template;

import java.io.*;
import java.util.Random;

public class RandomGuesser extends TheTemplate {

    private String theGuess = "";
    private BufferedReader reader;
    private String randomNum;
    private int count = 0;

    protected void doStart() {
        Random ran = new Random();
        randomNum = ran.nextInt(10)+ "";
        System.out.println("Guess the random number 0 to 9");
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    protected boolean isEnd() {
        return (theGuess.equals(randomNum));
    }

    protected void doSomething() {
        try {
            System.out.print("> ");
            theGuess = reader.readLine();
            count++;
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    protected void doEnd() {
        System.out.println("Correct - It took " + count + " guesses");
    }
}
