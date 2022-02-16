/*
 * Example of the Singleton Design Pattern
 * This is the Singleton class itself.  It maintains
 *  a list of messages in an ArrayList.  Only one
 * copy of this message list should exist when the
 * program runs so the choice of a Singleton
 * is sensible.
 */

package singleton;

import java.util.*;

class Singleton {

    private static Singleton instance = null;

    private List<String> messages;

    // Note that the constructor is private - typical
    // of a Singleton
    private Singleton() {
        messages = new ArrayList<>();
    }
    // This is the method that allows all other objects
    // in the system access to the Singlton object.
    // The first time it is called it creates the instance.
    //  All subsequent calls return a reference to the object.
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // The two method below are the methods that
    // actually DO something (not much but something ;)
    public synchronized void addMessage(String s) {
        messages.add(s);
    }
    public String toString() {
        return messages.toString();
    }
}
