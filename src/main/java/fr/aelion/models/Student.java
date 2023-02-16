package fr.aelion.models;

public class Student{

    public String lastName;
    public String firstName;
    public Login credential = new Login();
    private String email;

    public boolean isLoggedIn() {
        return credential.isLoggedIn();
    }

    public Student(String lastName, String firstName, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
    }
    public void setUsername(String username) {
        this.credential.setUsername(username);
    }

    public void setPassword(String password) {
        this.credential.setPassword(password);
    }
    public boolean login(String uName, String pWord){
        /*i 
        }*///check a lappel de la methode
        return credential.login(uName,pWord);//if false wrong password else login successful/already login
    }
    public void logout(){
        this.credential.logout();
    }
}
