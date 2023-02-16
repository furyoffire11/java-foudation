package fr.aelion.models;

public class Login {

    private String username;
    private String password;
    private boolean isLoggedIn = false;

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
