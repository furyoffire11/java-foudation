import fr.aelion.models.Student;
import fr.aelion.repo.StudentRepo;
import fr.aelion.user.LoginManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class LoginManagerTest {

    LoginManager lM;
    @BeforeEach
    public void setup(){
        this.lM = new LoginManager("Bond","007");

    }

    @Test
    @DisplayName("Login and pwd should be Bond and 007")
    public void haveCredentials(){
        assertAll("credentials",
                () -> assertEquals("Bond",this.lM.getUsername()),
                () -> assertEquals("007",this.lM.getPassword()));
    }

    @Test
    @DisplayName("loggedin test")
    public void stdLogin(){
        StudentRepo StudRepo = lM.getStdRepo();
        Student student = StudRepo.findByLogAndPwd("Bond","007");
        System.out.println(lM.login());
        assertEquals(true,student.LoggedIn());
    }

    @Test
    @DisplayName("loggedout test")
    public void stdLogout(){
        StudentRepo StudRepo = lM.getStdRepo();
        Student student = StudRepo.findByLogAndPwd("Bond","007");
        assertEquals(false,student.LoggedIn());
    }
}
