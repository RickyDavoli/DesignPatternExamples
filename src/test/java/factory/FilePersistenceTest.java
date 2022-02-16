package factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FilePersistenceTest {

    private PersistenceIF subject;

    @BeforeEach
    void setup(){
        subject = new FilePersistence();
    }

    @Test
    void shouldReturnCorrectValue(){
        assertEquals("Successfully saved to file", subject.Persist("any name"));
    }

}