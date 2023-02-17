package fr.aelion.user;

import fr.aelion.models.Student;
import fr.aelion.repo.StudentRepo;

public class LoginManager {

    private String username;
    private String password;

    private StudentRepo stdRepo = new StudentRepo();

    public LoginManager(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public StudentRepo getStdRepo() {
        return stdRepo;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login(){
        if (username == null || password == null){return "403";}
        Student stud = stdRepo.findByLogAndPwd(username,password);
        if(stud instanceof Student){
            stud.LoggedIn(true);
            return "200";

        }
        return "404";
    }
    public String logout(){
        if (username == null || password == null){return "403";}
        Student stud = stdRepo.findByLogAndPwd(username,password);
        if(stud instanceof Student){
            stud.LoggedIn(false);
            return "200";

        }
        return "404";

    }
}
