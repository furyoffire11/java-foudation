import fr.aelion.models.Student;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    Student student;

    @BeforeEach()
    void setUp() {
        Student student = new Student("Aubert", "jean-luc.aubert@aelion.fr","jlaubert" ,"dacodemaniak");
    }

    @Test
    @DisplayName("Standared properties should be 'Aubert', 'Jean-Luc', 'jean-luc.aubert@aelion.fr")
    void testStdProperties() {
        assertAll("Aubert Jean-Luc jean-luc.aubert@aelion.fr",
                () -> assertEquals("Aubert", student.lastName),
                () -> assertEquals("Jean-Luc", student.firstName),
                () -> assertEquals("jean-luc.aubert@aelion.fr", student.getEmail())
        );
    }

    @Test
    @DisplayName("Student should have 'Casper' as lastName")
    void testPublicAttribute() {
        Student student = new Student("Aubert", "jean-luc.aubert@aelion.fr","jlaubert" ,"dacodemaniak");
        student.lastName = "Casper";
        assertEquals("Casper", student.lastName);
    }

}
