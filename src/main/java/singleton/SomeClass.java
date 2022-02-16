/*
 * This class acts a client to the Singleton.  It
 * can't directly create an instance but can access
 * an instance via the getInstance() method.
 */

package singleton;

import java.util.Date;

public class SomeClass {

    public void generateDateMessage() {
        Singleton theOne = Singleton.getInstance();

        theOne.addMessage(new Date().toString());

    }
}
