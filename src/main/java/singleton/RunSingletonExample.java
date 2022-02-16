/*
 * Example of the Singleton Design Pattern
 * Objects of three classes access the
 * Singleton class and are guaranteed  to
 * be given access to the same object.
 */

package singleton;

public class RunSingletonExample {

    public static void main(String[] args) {
        SomeClass sc = new SomeClass();
        SomeOtherClass soc = new SomeOtherClass();

        sc.generateDateMessage();
        soc.generateMessages();

        //  Singleton sing = new Singleton(); // can't do
        Singleton sing = Singleton.getInstance();
        System.out.println(sing.toString());
    }
}
