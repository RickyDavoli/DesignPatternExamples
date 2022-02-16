/*
 * The concrete class for the decorated text example use of
 * the Decorator Pattern
 */

package decorator;

public class PlainText implements TextIF {

    private String text;

    public PlainText(String t) {
        text = t;
    }

    public void display() {
        System.out.print(text);
    }
}
