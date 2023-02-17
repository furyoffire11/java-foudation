package fr.aelion;

import fr.aelion.run.PersonRun;
import fr.aelion.run.StudentRun;


public class Main {

    public static void main(String[] args) {
        PersonRun PRun = new PersonRun();
        PRun.run();
        new StudentRun().run();

    }

}