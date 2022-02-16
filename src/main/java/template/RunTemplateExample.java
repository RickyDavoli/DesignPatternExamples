/*
 * Simple example of the Template Design Pattern
 * Main program.
 */
package template;

import java.util.Random;

public class RunTemplateExample {

    public static void main(String[] args) {
        Random ran = new Random();
        TheTemplate ttOne = new TimesTable(ran.nextInt(12) + 1),
                ttTwo = new RandomGuesser();

        ttOne.templateMethod();
        ttTwo.templateMethod();
    }
}
