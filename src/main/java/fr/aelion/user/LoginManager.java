package fr.aelion.user;

public class LoginManager {

    private String username;
    private String password;
    private boolean isLoggedIn = false;

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

    public boolean login(String uName, String pWord){
        return isLoggedIn = (uName.equals(username) && pWord.equals(password));
    }
    public void logout(){
        this.isLoggedIn = false;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }
}
