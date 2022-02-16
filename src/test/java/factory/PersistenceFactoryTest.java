package factory;

import org.junit.jupiter.api.Test;

import static factory.PersistenceFactory.GetFactory;
import static factory.PersistenceType.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PersistenceFactoryTest {

    @Test
    void shouldProduceInstanceOfCorrectClass(){
        assertTrue(GetFactory(File) instanceof FilePersistence);
        assertTrue(GetFactory(XML) instanceof XMLPersistence);
        assertTrue(GetFactory(Database) instanceof DBPersistence);
        assertEquals(3, values().length);
    }
}