/*
 * This class acts a client to the Singleton.  It
 * can't directly create an instance but can access
 * an instance via the getInstance() method.
 */

package singleton;

public class SomeOtherClass {

    public void generateMessages() {
        Singleton theOne = Singleton.getInstance();

        theOne.addMessage("message 1");
        theOne.addMessage("message 2");
    }
}
