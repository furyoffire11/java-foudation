package fr.aelion.models;

import fr.aelion.user.LoginManager;

public class Student{

    public String lastName;
    public String firstName;

    private String username;
    private String password;
    private boolean isLoggedIn = false;
    private String email;

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public Student(String lastName, String firstName, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }


    public boolean login(String a, String b) {
        return a.equals(this.username)&&b.equals(this.password);
    }
}
