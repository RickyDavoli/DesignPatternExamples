/*
 * Class that contains the main() method to run the 
 * decorated text example use of the Decorator Pattern
 */
package decorator;
public class RunDecorator {

    public static void main(String[] args) {

        TextIF t1 = new PlainText("elephant");
        t1.display();
        System.out.println();
        
        TextIF t2 = new DottyText(new PlainText("camel"));
        t2.display();
        System.out.println();
        
        TextIF t3 = new DottyText(new StarredText(new DottyText(new PlainText("lion"))));
        t3.display();
        System.out.println();
    }
}
