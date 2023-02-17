package fr.aelion.user;

import fr.aelion.repo.StudentRepo;

public class LoginManager {

    private String username;
    private String password;

    static StudentRepo stdRepo = new StudentRepo();

    public LoginManager(String username, String password) {
        this.username = username;
        this.password = password;
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

    public String login(String uName, String pWord){
        return stdRepo.findByLogAndPwd(uName,pWord)?"200":"400";
    }
    public void logout(){

    }
}
