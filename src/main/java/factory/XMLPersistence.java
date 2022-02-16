package factory;

public class XMLPersistence implements PersistenceIF {
    @Override
    public String Persist(String name) {
        System.out.println("Name: " + name);
        return "Successfully saved to XML";
    }
}
