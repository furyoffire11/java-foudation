package fr.aelion.models;

public class Student extends Person{
    public String lastName;
    public String firstName;

    private String email;

    private String username;
    private String password;

    private Boolean isLoggedIn = false;

    public Student(String lastName, String email, String login, String password) {
        this.lastName = lastName;
        this.email = email;
        this.username = login;
        this.password = password;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Boolean login(String username, String password) {
        if (username.equals(this.username) && password.equals(this.password)) {
            this.isLoggedIn = true;
            return true;
        }
        return false;
    }

    public void logout() {
        this.isLoggedIn = false;
    }
    public Boolean isLoggedIn() {
        return this.isLoggedIn;
    }

    public void isLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }
}
