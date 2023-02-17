package fr.aelion.repo;

import fr.aelion.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo {
     public List<Student> students = new ArrayList<>();

    public StudentRepo() {
        populate();
    }

    private void populate(){
        Student Ok = new Student("ok","bok","o@p","a","b");
        students.add(Ok);
    }

}
