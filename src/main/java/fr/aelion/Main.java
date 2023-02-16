package fr.aelion;

import fr.aelion.models.Person;
import fr.aelion.models.Student;

public class Main {

    private static Main app;
    public static void main(String[] args) {
        app = new Main();
        if (app instanceof Main) {
            System.out.println("is a main");
        } else {
            System.out.println("not a main");
        }
        System.out.println("main method");
    }

    public Main() {
        Person JL = new Person();
        JL.setLastName("Aubert");
        JL.setFirstName("Jean-Luc");
        JL.setPhoneNumber("06 69 69 69 42");
        JL.setEmail("jl@aelion.biz");

        Person Jt = new Person("Taubert","Jean-Juc","06 69 69 69 69","jt@aelion.biz");

        Person mz = new Person("Zetofre","mz@aelion.biz");
        mz.setFirstName("Melanie");
        mz.setPhoneNumber("06 69 69 42 42");

        System.out.println("je suis "+Jt.greetings());
        System.out.println("je suis "+JL.greetings());
        System.out.println("je suis "+mz.greetings());
        userLife();

    }

    private static void userLife() {
        Student Ok = new Student("ok","bok","o@p");
        Ok.setPassword("a");
        Ok.setUsername("b");
        if (Ok.isLoggedIn()){
            System.out.println("Deja connect");
        } else {
            System.out.println(Ok.login("b","a"));
        }
    }


}