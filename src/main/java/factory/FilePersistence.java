package factory;

public class FilePersistence implements PersistenceIF {
    @Override
    public String Persist(String name) {
        System.out.println("Name:" + name);
        return "Successfully saved to file";

    }
}
