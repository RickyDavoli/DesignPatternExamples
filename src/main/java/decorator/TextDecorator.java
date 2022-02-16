/*
 * The abstract super class for all the decorator classes in
 * the decorated text example use of the Decorator Pattern
 */
package decorator;
public abstract class TextDecorator implements TextIF {

    protected TextIF myText;

    public TextDecorator(TextIF myText) {
        this.myText = myText;
    }
}
