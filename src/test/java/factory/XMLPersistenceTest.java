package factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XMLPersistenceTest {
    private PersistenceIF subject;

    @BeforeEach
    void setup(){
        subject = new XMLPersistence();
    }

    @Test
    void shouldReturnCorrectValue(){
        assertEquals("Successfully saved to XML", subject.Persist("any name"));
    }

}