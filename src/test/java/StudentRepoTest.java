import fr.aelion.repo.StudentRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentRepoTest {
    StudentRepo sR;
    @BeforeEach
    public void setup(){
        this.sR = new StudentRepo();

    }

    @Test
    @DisplayName("List should have 1 student")
    public void studentInitTest(){
        assertEquals(1,sR.students.size());
    }
}
