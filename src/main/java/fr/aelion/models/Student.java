package fr.aelion.models;

import fr.aelion.user.LoginManager;

public class Student{

    public String lastName;
    public String firstName;
    public LoginManager credential;
    private String email;

    public boolean isLoggedIn() {
        return credential.isLoggedIn();
    }

    public Student(String lastName, String firstName, String email,String uName, String pWord) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.credential = new LoginManager( uName,  pWord);
    }
    public boolean login(String uName, String pWord){
        /*i 
        }*///check a lappel de la methode
        return credential.login(uName,pWord);//if false wrong password else login successful/already login
    }
    public void logout(){
        this.credential.logout();
    }

    public String getEmail() {
        return email;
    }
}
