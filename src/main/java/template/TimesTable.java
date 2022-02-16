/*
 * Simple example of the Template Design Pattern
 * A subclass that outputs a times table.
 */
package template;

public class TimesTable extends TheTemplate {

    private int count;
    private int table;

    public TimesTable(int table) {
        this.table = table;
    }

    protected void doStart() {
        System.out.println(table + " times table");
    }

    protected boolean isEnd() {
        return (++count > 12);
    }

    protected void doSomething() {
        System.out.println(count + " times " + table + " = " + (count * table));
    }

    protected void doEnd() {
        System.out.println("*******");
    }
}

