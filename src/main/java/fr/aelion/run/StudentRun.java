package fr.aelion.run;

import fr.aelion.models.Student;

/**
 * create Student instances makes they say hello
 */
public class StudentRun {
    public void run() {
        Student Ok = new Student("ok","bok","o@p");
        Ok.setUsername("a");
        Ok.setPassword("b");
        if (Ok.isLoggedIn()){
            System.out.println("Deja connect");
        } else {
            System.out.println(Ok.login("a","b"));
        }
    }
}
