package factory;

/**
 *
 * @author wm50
 */
public class DBPersistence implements PersistenceIF {

    @Override
    public String Persist(String name) {
        System.out.println("Name: " + name);
        return "Successfully saved to database";
    }
    
}
