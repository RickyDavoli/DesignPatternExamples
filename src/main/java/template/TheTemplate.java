/*
 * Simple example of the Template Design Pattern
 * The Template class itself.
 */

package template;

abstract class TheTemplate {


    public void templateMethod() {
        doStart();
        while (!isEnd()) {
            doSomething();
        }
        doEnd();
    }

    abstract protected void doStart();

    abstract protected boolean isEnd();

    abstract protected void doSomething();

    abstract protected void doEnd();

}
