package fr.aelion.run;

import fr.aelion.models.Person;

/**
 * create Person instances makes they say hello
 */
public class PersonRun {
    public void run(){
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
    }
}
