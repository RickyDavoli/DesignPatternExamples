package factory;

/**
 *
 * @author wm50
 */
public class PersistenceFactory {
    
    public static PersistenceIF GetFactory(PersistenceType type)
        {
            switch (type)
            {
                case Database:
                    return new DBPersistence();
                case XML:
                    return new XMLPersistence();
                default:
                    return null;
            }
        }    
}
