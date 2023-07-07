package fr.dawan.springmaven;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RepertoireTest {

    @Autowired
    private Repertoire repertoire;
    @Test
    void getNomFromIndex() {
        // Arrange
        int index = 1;
        String expected = "Boutry";
        // Act
        String result = repertoire.getNomFromIndex(index);
        // Assert
        assertEquals(expected,result);
    }
}
