/*
 * Decorator class that "decorates" text by surrounding it
 * with dots
 */
package decorator;

public class DottyText extends TextDecorator {

    public DottyText(TextIF t) {
        super(t);
    }

    public void display() {
        System.out.print("...");
        myText.display();
        System.out.print("...");
    }
}
