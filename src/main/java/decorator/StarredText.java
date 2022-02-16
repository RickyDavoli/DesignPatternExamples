/*
 * Decorator class that "decorates" text by surrounding it
 * with stars
 */
package decorator;

public class StarredText extends TextDecorator {

    public StarredText(TextIF t) {
        super(t);
    }

    public void display() {
        System.out.print("***");
        myText.display();
        System.out.print("***");
    }
}
