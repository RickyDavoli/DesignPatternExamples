package factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DBPersistenceTest {

    private PersistenceIF subject;

    @BeforeEach
    void setup(){
        subject = new DBPersistence();
    }

    @Test
    void shouldReturnCorrectValue(){
        assertEquals("Successfully saved to database", subject.Persist("any name"));
    }

}