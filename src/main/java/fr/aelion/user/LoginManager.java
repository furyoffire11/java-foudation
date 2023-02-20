package fr.aelion.user;

import fr.aelion.models.Student;
import fr.aelion.repositories.StudentRepository;

public class LoginManager {
    private String login;
    private String password;

    private StudentRepository studentRepository = new StudentRepository();
    public LoginManager(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public StudentRepository getStudentRepository() {
        return this.studentRepository;
    }
    public String login() {

        Student student = this.studentRepository.findByLoginAndPassword(this.login, this.password);
        if (student != null) {
            student.isLoggedIn(true);
            return "200 Ok";
        }

        return "404 Not Found";
        /*
          if (this.studentRepository.findByLoginAndPassword(this.login, this.password)) {
           return "200 Ok"
          }
          return "404 Not Found"
         */
    }

    public void logout() {
        Student student = this.studentRepository.findByLoginAndPassword(this.login, this.password);
        if (student != null) {
            student.isLoggedIn(false);
        }
    }
}
